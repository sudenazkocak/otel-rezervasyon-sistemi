package com.ote.rezervasyon.controller;

import com.ote.rezervasyon.entity.Odeme;
import com.ote.rezervasyon.repository.OdemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/odemeler")
public class OdemeController {

    @Autowired
    private OdemeRepository odemeRepository;

    // Veritabanındaki tüm ödemeleri ve gelirleri getirir
    @GetMapping
    public List<Odeme> tumOdemeleriGetir() {
        return odemeRepository.findAll();
    }
}