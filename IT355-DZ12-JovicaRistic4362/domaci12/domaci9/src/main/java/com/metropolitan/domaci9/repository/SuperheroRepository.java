package com.metropolitan.domaci9.repository;

import com.metropolitan.domaci9.model.Superhero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SuperheroRepository extends JpaRepository<Superhero, Integer> {

    List<Superhero> findByHeightCmGreaterThan(int height);

}
