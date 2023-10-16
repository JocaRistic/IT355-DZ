package com.metropolitan.domaci9.service.impl;

import com.metropolitan.domaci9.model.Superhero;
import com.metropolitan.domaci9.repository.SuperheroRepository;
import com.metropolitan.domaci9.service.SuperheroService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SuperheroServiceImpl implements SuperheroService {

    private final SuperheroRepository superheroRepository;

    @Override
    public List<Superhero> findAll() {
        return superheroRepository.findAll();
    }

    @Override
    public Optional<Superhero> findById(Integer id) {
        return superheroRepository.findById(id);
    }

    @Override
    public Superhero save(Superhero superhero) {
        return superheroRepository.save(superhero);
    }

    @Override
    public Superhero update(Superhero superhero) {
        return superheroRepository.save(superhero);
    }

    @Override
    public void deleteById(Integer id) {
        superheroRepository.deleteById(id);
    }

    @Override
    public List<Superhero> findByHeightCmGreaterThan(int height) {
        return superheroRepository.findByHeightCmGreaterThan(height);
    }
}
