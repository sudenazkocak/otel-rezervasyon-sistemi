package com.ote.rezervasyon.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "temizlik_kayitlari")
@Data
public class TemizlikKaydi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "oda_id", nullable = false)
    private Oda oda;

    @ManyToOne
    @JoinColumn(name = "personel_id", nullable = false)
    private Personel personel;

    @Column(nullable = false)
    private LocalDateTime tarih;

    @Column(nullable = false)
    private String durum; // Örn: Başladı, Bitti
}