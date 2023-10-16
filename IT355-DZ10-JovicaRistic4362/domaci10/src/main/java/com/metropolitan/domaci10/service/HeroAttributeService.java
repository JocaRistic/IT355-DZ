package com.metropolitan.domaci10.service;

import com.metropolitan.domaci10.model.HeroAttribute;

import java.util.List;
import java.util.Optional;

public interface HeroAttributeService {

    List<HeroAttribute> findAll();

    Optional<HeroAttribute> findById(Integer id);

    HeroAttribute save(HeroAttribute heroAttribute);

    HeroAttribute update(HeroAttribute heroAttribute);

    void deleteById(Integer id);

}
