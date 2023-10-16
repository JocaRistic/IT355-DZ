package com.metropolitan.domaci10.service.impl;

import com.metropolitan.domaci10.model.Race;
import com.metropolitan.domaci10.repository.RaceRepository;
import com.metropolitan.domaci10.service.RaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RaceServiceImpl implements RaceService {

    private final RaceRepository raceRepository;

    @Override
    public List<Race> findAll() {
        return raceRepository.findAll();
    }

    @Override
    public Optional<Race> findById(Integer id) {
        return raceRepository.findById(id);
    }

    @Override
    public Race save(Race race) {
        return raceRepository.save(race);
    }

    @Override
    public Race update(Race race) {
        return raceRepository.save(race);
    }

    @Override
    public void deleteById(Integer id) {
        raceRepository.deleteById(id);
    }
}
