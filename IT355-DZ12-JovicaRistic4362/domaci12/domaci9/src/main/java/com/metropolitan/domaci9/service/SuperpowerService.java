package com.metropolitan.domaci9.service;

import com.metropolitan.domaci9.model.Superpower;

import java.util.List;
import java.util.Optional;

public interface SuperpowerService {

    List<Superpower> findAll();

    Optional<Superpower> findById(Integer id);

    Superpower save(Superpower superpower);

    Superpower update(Superpower superpower);

    void deleteById(Integer id);

}
