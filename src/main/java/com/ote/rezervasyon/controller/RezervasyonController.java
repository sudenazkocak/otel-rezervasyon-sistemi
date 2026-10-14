package com.ote.rezervasyon.controller;

import com.ote.rezervasyon.entity.Rezervasyon;
import com.ote.rezervasyon.service.RezervasyonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rezervasyonlar")
public class RezervasyonController {

    @Autowired
    private RezervasyonService rezervasyonService;

    @GetMapping
    public List<Rezervasyon> tumRezervasyonlariGetir() {
        return rezervasyonService.tumRezervasyonlariGetir();
    }

    @PostMapping
    public Rezervasyon rezervasyonEkle(@RequestBody Rezervasyon rezervasyon) {
        return rezervasyonService.rezervasyonEkle(rezervasyon);
    }
}