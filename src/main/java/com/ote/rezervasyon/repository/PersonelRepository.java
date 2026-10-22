package com.ote.rezervasyon.repository;

import com.ote.rezervasyon.entity.Personel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonelRepository extends JpaRepository<Personel, Long> {
    // Giriş işlemi için veritabanında kullanıcı adına göre arama yapan özel metot
    Personel findByKullaniciAdi(String kullaniciAdi);
}