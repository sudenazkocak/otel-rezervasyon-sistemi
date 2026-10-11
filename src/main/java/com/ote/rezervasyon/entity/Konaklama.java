package com.ote.rezervasyon.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "konaklamalar")
@Data
public class Konaklama {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "rezervasyon_id", nullable = false, unique = true)
    private Rezervasyon rezervasyon;

    private LocalDateTime gercekGirisZamani; // Müşterinin otele fiziksel olarak ayak bastığı an

    private LocalDateTime gercekCikisZamani; // Müşterinin otelden ayrıldığı an

    @ManyToOne
    @JoinColumn(name = "islem_yapan_personel_id", nullable = false)
    private Personel islemYapanPersonel;
}