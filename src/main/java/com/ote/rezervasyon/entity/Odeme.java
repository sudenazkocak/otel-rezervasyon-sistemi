package com.ote.rezervasyon.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "odemeler")
@Data
public class Odeme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "konaklama_id", nullable = false)
    private Konaklama konaklama;

    @Column(nullable = false)
    private BigDecimal tutar;

    @Column(nullable = false)
    private String odemeTuru; // nakit, kart

    @Column(nullable = false)
    private LocalDateTime tarih;
}