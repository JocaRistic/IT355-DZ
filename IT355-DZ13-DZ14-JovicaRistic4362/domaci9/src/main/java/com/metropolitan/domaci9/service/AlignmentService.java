package com.metropolitan.domaci9.service;

import com.metropolitan.domaci9.model.Alignment;

import java.util.List;
import java.util.Optional;

public interface AlignmentService {

    List<Alignment> findAll();

    Optional<Alignment> findById(Integer id);

    Alignment save(Alignment alignment);

    Alignment update(Alignment alignment);

    void deleteById(Integer id);

}
