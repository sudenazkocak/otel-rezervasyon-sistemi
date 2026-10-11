package com.ote.rezervasyon.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Table(name = "oda_tipleri")
@Data
public class OdaTipi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tipAdi; // standart, deluxe, suit

    private int kapasite;
    private String aciklama;

    @Column(nullable = false)
    private BigDecimal temelFiyat;
}