package com.ote.rezervasyon.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "misafirler")
@Data
public class Misafir {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String ad;

    @Column(nullable = false)
    private String soyad;

    @Column(unique = true)
    private String tcPasaportNo;

    private String telefon;
    private String ePosta;
    private LocalDate dogumTarihi;
}