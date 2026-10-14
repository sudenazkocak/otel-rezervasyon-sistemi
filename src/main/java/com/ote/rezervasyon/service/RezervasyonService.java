package com.ote.rezervasyon.service;

import com.ote.rezervasyon.entity.Rezervasyon;
import com.ote.rezervasyon.repository.RezervasyonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}