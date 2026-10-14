package com.ote.rezervasyon.repository;

import com.ote.rezervasyon.entity.Rezervasyon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RezervasyonRepository extends JpaRepository<Rezervasyon, Long> {
}