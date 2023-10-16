package com.metropolitan.domaci9.service.impl;

import com.metropolitan.domaci9.model.Colour;
import com.metropolitan.domaci9.repository.ColourRepository;
import com.metropolitan.domaci9.service.ColourService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ColourServiceImpl implements ColourService {

    private final ColourRepository colourRepository;

    @Override
    public List<Colour> findAll() {
        return colourRepository.findAll();
    }

    @Override
    public Optional<Colour> findById(Integer id) {
        return colourRepository.findById(id);
    }

    @Override
    public Colour save(Colour colour) {
        return colourRepository.save(colour);
    }

    @Override
    public Colour update(Colour colour) {
        return colourRepository.save(colour);
    }

    @Override
    public void deleteById(Integer id) {
        colourRepository.deleteById(id);
    }
}
