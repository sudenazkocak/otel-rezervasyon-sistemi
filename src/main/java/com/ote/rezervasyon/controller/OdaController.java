package com.ote.rezervasyon.controller;

import com.ote.rezervasyon.entity.Oda;
import com.ote.rezervasyon.service.OdaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/odalar")
public class OdaController {

    @Autowired
    private OdaService odaService;

    // GET isteği ile tüm odaları listeler (Tarayıcıdan veya Postman'den çağrılabilir)
    @GetMapping
    public List<Oda> tumOdalariGetir() {
        return odaService.tumOdalariGetir();
    }

    // POST isteği ile sisteme yeni oda ekler
    @PostMapping
    public Oda odaEkle(@RequestBody Oda oda) {
        return odaService.odaEkle(oda);
    }
}