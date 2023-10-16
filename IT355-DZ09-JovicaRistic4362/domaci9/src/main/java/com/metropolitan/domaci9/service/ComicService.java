package com.metropolitan.domaci9.service;

import com.metropolitan.domaci9.model.Comic;

import java.util.List;
import java.util.Optional;

public interface ComicService {

    List<Comic> findAll();

    Optional<Comic> findById(Integer id);

    Comic save(Comic comic);

    Comic update(Comic comic);

    void deleteById(Integer id);

}
