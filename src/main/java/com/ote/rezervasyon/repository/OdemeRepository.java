package com.ote.rezervasyon.repository;

import com.ote.rezervasyon.entity.Odeme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdemeRepository extends JpaRepository<Odeme, Long> {
}