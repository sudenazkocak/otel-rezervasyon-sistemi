package com.ote.rezervasyon.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "konaklama_hizmetleri")
@Data
public class KonaklamaHizmeti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "konaklama_id", nullable = false)
    private Konaklama konaklama;

    @ManyToOne
    @JoinColumn(name = "ek_hizmet_id", nullable = false)
    private EkHizmet ekHizmet;

    private int adet = 1;

    @Column(nullable = false)
    private LocalDateTime tarih;
}