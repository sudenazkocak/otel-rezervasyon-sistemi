package com.ote.rezervasyon.repository;

import com.ote.rezervasyon.entity.Rezervasyon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RezervasyonRepository extends JpaRepository<Rezervasyon, Long> {

    // Veritabanındaki Stored Procedure'ü çağıran ve toplam tutarı döndüren metot
    @Query(value = "CALL prc_checkout_yap(:id)", nativeQuery = true)
    Double checkOutVeHesapla(@Param("id") Long id);
    
}