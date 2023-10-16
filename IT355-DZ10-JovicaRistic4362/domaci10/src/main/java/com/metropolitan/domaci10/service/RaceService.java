package com.metropolitan.domaci10.service;

import com.metropolitan.domaci10.model.Race;

import java.util.List;
import java.util.Optional;

public interface RaceService {

    List<Race> findAll();

    Optional<Race> findById(Integer id);

    Race save(Race race);

    Race update(Race race);

    void deleteById(Integer id);

}
