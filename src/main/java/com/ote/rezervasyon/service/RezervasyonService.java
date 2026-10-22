package com.ote.rezervasyon.service;

import com.ote.rezervasyon.entity.Rezervasyon;
import com.ote.rezervasyon.repository.RezervasyonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RezervasyonService {

    @Autowired
    private RezervasyonRepository rezervasyonRepository;

    // Tüm rezervasyonları listeler
    public List<Rezervasyon> tumRezervasyonlariGetir() {
        return rezervasyonRepository.findAll();
    }

    // Yeni rezervasyon ekler
    public Rezervasyon rezervasyonEkle(Rezervasyon rezervasyon) {
        return rezervasyonRepository.save(rezervasyon);
    }

    // Check-Out işlemini yapan ve toplam tutarı döndüren metot
    @Transactional
    public Double checkOutYap(Long id) {
        // Doğrudan MySQL'deki prosedürü tetikler ve hesaplanan faturayı geri döndürür
        return rezervasyonRepository.checkOutVeHesapla(id);
    }

    // Rezervasyonu iptal eden metot
    public Rezervasyon iptalEt(Long id) {
        Rezervasyon rezervasyon = rezervasyonRepository.findById(id).orElse(null);
        if (rezervasyon != null) {
            rezervasyon.setDurum("iptal");
            return rezervasyonRepository.save(rezervasyon); // Odayı boşaltma işini MySQL Trigger yapacak!
        }
        return null;
    }
}