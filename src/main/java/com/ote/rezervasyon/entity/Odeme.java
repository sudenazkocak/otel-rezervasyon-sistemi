package com.ote.rezervasyon.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "odemeler")
@Data
public class Odeme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rezervasyon_id", nullable = false)
    private Long rezervasyonId;

    @Column(nullable = false)
    private Double tutar;

    @Column(name = "odeme_turu")
    private String odemeTuru;

    @Column(name = "odeme_tarihi", insertable = false, updatable = false)
    private LocalDateTime odemeTarihi;
}