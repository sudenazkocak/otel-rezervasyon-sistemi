package com.ote.rezervasyon.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "kullanicilar")
@Data
public class Kullanici {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String kullaniciAdi; // Giriş yaparken kullanılacak, eşsiz olmalı

    @Column(nullable = false)
    private String sifre;

    @Column(nullable = false)
    private String rol; // misafir, resepsiyon, yönetici

    // Kullanıcı bir misafir olabilir (Bire-Bir bağlantı)
    @OneToOne
    @JoinColumn(name = "misafir_id")
    private Misafir misafir;

    // Ya da bir personel olabilir (Bire-Bir bağlantı)
    @OneToOne
    @JoinColumn(name = "personel_id")
    private Personel personel;
}