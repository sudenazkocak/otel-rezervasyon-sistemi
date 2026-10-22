package com.ote.rezervasyon.controller;

import com.ote.rezervasyon.entity.Personel;
import com.ote.rezervasyon.service.PersonelService;
import com.ote.rezervasyon.repository.PersonelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personel")
public class PersonelController {

    @Autowired
    private PersonelService personelService;

    @Autowired
    private PersonelRepository personelRepository;

    @PostMapping("/login")
    public Personel login(@RequestParam String kullaniciAdi, @RequestParam String sifre) {
        return personelService.girisYap(kullaniciAdi, sifre);
    }

    // Tüm personelleri listeleme ucu
    @GetMapping
    public List<Personel> tumPersonelleriGetir() {
        return personelRepository.findAll();
    }

    // Yeni personel ekleme ucu
    @PostMapping
    public Personel personelEkle(@RequestBody Personel personel) {
        return personelRepository.save(personel);
    }
}