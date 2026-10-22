package com.ote.rezervasyon.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "personeller")
@Data
public class Personel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String ad;

    @Column(nullable = false)
    private String soyad;

    @Column(nullable = false)
    private String gorev; 

    @Column(nullable = false)
    private LocalDate iseGirisTarihi;

    // Veritabanına yeni eklediğimiz giriş bilgileri
    @Column(unique = true)
    private String kullaniciAdi;

    private String sifre;
}