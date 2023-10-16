package com.metropolitan.domaci9.service.impl;

import com.metropolitan.domaci9.model.Gender;
import com.metropolitan.domaci9.repository.GenderRepository;
import com.metropolitan.domaci9.service.GenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GenderServiceImpl implements GenderService {

    private final GenderRepository genderRepository;

    @Override
    public List<Gender> findAll() {
        return genderRepository.findAll();
    }

    @Override
    public Optional<Gender> findById(Integer id) {
        return genderRepository.findById(id);
    }

    @Override
    public Gender save(Gender gender) {
        return genderRepository.save(gender);
    }

    @Override
    public Gender update(Gender gender) {
        return genderRepository.save(gender);
    }

    @Override
    public void deleteById(Integer id) {
        genderRepository.deleteById(id);
    }
}
