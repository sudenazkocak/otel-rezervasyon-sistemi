package com.ote.rezervasyon.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Table(name = "ek_hizmetler")
@Data
public class EkHizmet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String hizmetAdi; // Örn: kahvaltı, spa, otopark, oda servisi

    @Column(nullable = false)
    private BigDecimal birimFiyat;
}