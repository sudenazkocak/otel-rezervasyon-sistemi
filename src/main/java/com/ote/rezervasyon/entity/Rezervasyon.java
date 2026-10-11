package com.ote.rezervasyon.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "rezervasyonlar")
@Data
public class Rezervasyon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "misafir_id", nullable = false)
    private Misafir misafir;

    @ManyToOne
    @JoinColumn(name = "oda_id", nullable = false)
    private Oda oda;

    @Column(nullable = false)
    private LocalDate girisTarihi;

    @Column(nullable = false)
    private LocalDate cikisTarihi;

    private int kisiSayisi;

    private String durum = "beklemede"; // beklemede, onaylı, iptal, tamamlandı

    private LocalDateTime olusturmaTarihi = LocalDateTime.now();
}