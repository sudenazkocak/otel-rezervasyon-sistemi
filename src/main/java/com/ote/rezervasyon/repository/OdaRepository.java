package com.ote.rezervasyon.repository;

import com.ote.rezervasyon.entity.Oda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdaRepository extends JpaRepository<Oda, Long> {
    // JpaRepository sayesinde temel CRUD (Ekle, Sil, Güncelle, Bul) işlemleri otomatik gelir.
}