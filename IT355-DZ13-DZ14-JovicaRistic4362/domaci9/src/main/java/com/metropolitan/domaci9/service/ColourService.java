package com.metropolitan.domaci9.service;

import com.metropolitan.domaci9.model.Colour;

import java.util.List;
import java.util.Optional;

public interface ColourService {

    List<Colour> findAll();

    Optional<Colour> findById(Integer id);

    Colour save(Colour colour);

    Colour update(Colour colour);

    void deleteById(Integer id);

}
