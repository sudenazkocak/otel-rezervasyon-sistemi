package com.ote.rezervasyon.service;

import com.ote.rezervasyon.entity.Personel;
import com.ote.rezervasyon.repository.PersonelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonelService {

    @Autowired
    private PersonelRepository personelRepository;

    public Personel girisYap(String kullaniciAdi, String sifre) {
        Personel personel = personelRepository.findByKullaniciAdi(kullaniciAdi);
        
        // Eğer böyle bir kullanıcı varsa ve şifresi doğruysa giriş başarılıdır
        if (personel != null && personel.getSifre().equals(sifre)) {
            return personel; // Başarılı giriş
        }
        
        return null; // Başarısız giriş (Kullanıcı yok veya şifre hatalı)
    }
}