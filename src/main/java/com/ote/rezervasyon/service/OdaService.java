package com.ote.rezervasyon.service;

import com.ote.rezervasyon.entity.Oda;
import com.ote.rezervasyon.repository.OdaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdaService {

    @Autowired
    private OdaRepository odaRepository;

    // Veritabanındaki tüm odaları listeler
    public List<Oda> tumOdalariGetir() {
        return odaRepository.findAll();
    }

    // Sisteme yeni bir oda kaydeder
    public Oda odaEkle(Oda oda) {
        return odaRepository.save(oda);
    }
    
    // ID numarasına göre belirli bir odayı bulur
    public Oda odaBul(Long id) {
        return odaRepository.findById(id).orElse(null);
    }
}