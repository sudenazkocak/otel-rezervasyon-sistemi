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

    // Frontend'den gelen Check-Out isteklerini karşılayan uç - Artık para (Double) döndürüyor
    @PutMapping("/{id}/checkout")
    public Double checkOut(@PathVariable Long id) {
        return rezervasyonService.checkOutYap(id);
    }
    // Frontend'den gelen İptal isteklerini karşılayan uç
    @PutMapping("/{id}/iptal")
    public Rezervasyon iptalEt(@PathVariable Long id) {
        return rezervasyonService.iptalEt(id);
    }
}