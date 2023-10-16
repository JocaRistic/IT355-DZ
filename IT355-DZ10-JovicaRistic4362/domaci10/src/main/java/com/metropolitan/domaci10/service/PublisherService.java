package com.metropolitan.domaci10.service;

import com.metropolitan.domaci10.model.Publisher;

import java.util.List;
import java.util.Optional;

public interface PublisherService {

    List<Publisher> findAll();

    Optional<Publisher> findById(Integer id);

    Publisher save(Publisher publisher);

    Publisher update(Publisher publisher);

    void deleteById(Integer id);

}
