package com.ote.rezervasyon.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "odalar")
@Data
public class Oda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String odaNumarasi;

    private int kat;

    private String durum = "boş"; // boş, dolu, temizlikte, bakımda

    @ManyToOne
    @JoinColumn(name = "oda_tipi_id", nullable = false)
    private OdaTipi odaTipi;
}