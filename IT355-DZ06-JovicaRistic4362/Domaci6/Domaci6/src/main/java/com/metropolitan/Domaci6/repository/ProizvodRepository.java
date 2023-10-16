package com.metropolitan.Domaci6.repository;

import com.metropolitan.Domaci6.entity.Proizvod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProizvodRepository extends JpaRepository<Proizvod, Long> {
}
