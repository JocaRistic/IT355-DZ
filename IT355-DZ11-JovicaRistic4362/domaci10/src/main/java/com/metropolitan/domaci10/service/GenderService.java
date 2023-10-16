package com.metropolitan.domaci10.service;

import com.metropolitan.domaci10.model.Gender;

import java.util.List;
import java.util.Optional;

public interface GenderService {

    List<Gender> findAll();

    Optional<Gender> findById(Integer id);

    Gender save(Gender gender);

    Gender update(Gender gender);

    void deleteById(Integer id);

}
