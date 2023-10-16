package com.metropolitan.domaci7.repository;

import com.metropolitan.domaci7.model.Jelo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface JeloRepository extends JpaRepository<Jelo, Long> {
    Optional<List<Jelo>> findAllByNaziv(String naziv);
}
