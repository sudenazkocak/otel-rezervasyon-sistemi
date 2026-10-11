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
    private String gorev; // Örn: resepsiyon, kat görevlisi, yönetici

    @Column(nullable = false)
    private LocalDate iseGirisTarihi;
}