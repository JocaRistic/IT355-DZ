package com.metropolitan.domaci10.service.impl;

import com.metropolitan.domaci10.model.Comic;
import com.metropolitan.domaci10.repository.ComicRepository;
import com.metropolitan.domaci10.service.ComicService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ComicServiceImpl implements ComicService {

    private final ComicRepository comicRepository;

    @Override
    public List<Comic> findAll() {
        return comicRepository.findAll();
    }

    @Override
    public Optional<Comic> findById(Integer id) {
        return comicRepository.findById(id);
    }

    @Override
    public Comic save(Comic comic) {
        return comicRepository.save(comic);
    }

    @Override
    public Comic update(Comic comic) {
        return comicRepository.save(comic);
    }

    @Override
    public void deleteById(Integer id) {
        comicRepository.deleteById(id);
    }
}
