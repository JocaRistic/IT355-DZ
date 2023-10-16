package com.metropolitan.domaci10.service;

import com.metropolitan.domaci10.model.Superhero;

import java.util.List;
import java.util.Optional;

public interface SuperheroService {

    List<Superhero> findAll();

    Optional<Superhero> findById(Integer id);

    Superhero save(Superhero superhero);

    Superhero update(Superhero superhero);

    void deleteById(Integer id);

    List<Superhero> findByHeightCmGreaterThan(int height);

}
