package com.metropolitan.domaci9.service.impl;

import com.metropolitan.domaci9.model.Alignment;
import com.metropolitan.domaci9.repository.AlignmentRepository;
import com.metropolitan.domaci9.service.AlignmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AlignmentServiceImpl implements AlignmentService {

    private final AlignmentRepository alignmentRepository;

    @Override
    public List<Alignment> findAll() {
        return alignmentRepository.findAll();
    }

    @Override
    public Optional<Alignment> findById(Integer id) {
        return alignmentRepository.findById(id);
    }

    @Override
    public Alignment save(Alignment alignment) {
        return alignmentRepository.save(alignment);
    }

    @Override
    public Alignment update(Alignment alignment) {
        return alignmentRepository.save(alignment);
    }

    @Override
    public void deleteById(Integer id) {
        alignmentRepository.deleteById(id);
    }
}
