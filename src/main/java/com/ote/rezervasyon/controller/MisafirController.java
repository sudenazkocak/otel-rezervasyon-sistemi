package com.ote.rezervasyon.controller;

import com.ote.rezervasyon.entity.Misafir;
import com.ote.rezervasyon.service.MisafirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/misafirler")
public class MisafirController {

    @Autowired
    private MisafirService misafirService;

    @GetMapping
    public List<Misafir> tumMisafirleriGetir() {
        return misafirService.tumMisafirleriGetir();
    }

    @PostMapping
    public Misafir misafirEkle(@RequestBody Misafir misafir) {
        return misafirService.misafirEkle(misafir);
    }
}