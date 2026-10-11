package com.ote.rezervasyon.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "sezon_fiyatlari")
@Data
public class SezonFiyati {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "oda_tipi_id", nullable = false)
    private OdaTipi odaTipi;

    @Column(nullable = false)
    private LocalDate baslangicTarihi;

    @Column(nullable = false)
    private LocalDate bitisTarihi;

    @Column(nullable = false)
    private BigDecimal gecelikFiyat;
}