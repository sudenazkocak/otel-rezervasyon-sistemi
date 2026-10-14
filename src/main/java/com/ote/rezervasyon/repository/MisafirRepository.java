package com.ote.rezervasyon.repository;

import com.ote.rezervasyon.entity.Misafir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MisafirRepository extends JpaRepository<Misafir, Long> {
}