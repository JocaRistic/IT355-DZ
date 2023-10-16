package com.metropolitan.domaci9.service;

import com.metropolitan.domaci9.model.Attribute;

import java.util.List;
import java.util.Optional;

public interface AttributeService {

    List<Attribute> findAll();

    Optional<Attribute> findById(Integer id);

    Attribute save(Attribute attribute);

    Attribute update(Attribute attribute);

    void deleteById(Integer id);

}
