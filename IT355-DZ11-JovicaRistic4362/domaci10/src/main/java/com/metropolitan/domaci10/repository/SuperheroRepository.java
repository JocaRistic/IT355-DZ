package com.metropolitan.domaci10.repository;

import com.metropolitan.domaci10.model.Superhero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SuperheroRepository extends JpaRepository<Superhero, Integer> {

    List<Superhero> findByHeightCmGreaterThan(int height);

}
