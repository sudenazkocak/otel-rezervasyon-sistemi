package com.ote.rezervasyon.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "islem_loglari")
@Data
public class IslemLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tabloAdi; // Hangi tabloda değişiklik oldu? (Örn: rezervasyonlar)

    @Column(nullable = false)
    private String islemTipi; // INSERT, UPDATE, DELETE

    @Column(nullable = false)
    private LocalDateTime islemTarihi;

    private String aciklama; // Örn: 5 nolu rezervasyon iptal edildi.
}