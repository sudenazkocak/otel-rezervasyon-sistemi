package com.ote.rezervasyon.service;

import com.ote.rezervasyon.entity.Misafir;
import com.ote.rezervasyon.repository.MisafirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MisafirService {

    @Autowired
    private MisafirRepository misafirRepository;

    // Tüm misafirleri listeler
    public List<Misafir> tumMisafirleriGetir() {
        return misafirRepository.findAll();
    }

    // Yeni misafir kaydeder
    public Misafir misafirEkle(Misafir misafir) {
        return misafirRepository.save(misafir);
    }
}