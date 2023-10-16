package com.metropolitan.domaci10.service.impl;

import com.metropolitan.domaci10.model.Attribute;
import com.metropolitan.domaci10.repository.AttributeRepository;
import com.metropolitan.domaci10.service.AttributeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AttributeServiceImpl implements AttributeService {

    private final AttributeRepository attributeRepository;

    @Override
    public List<Attribute> findAll() {
        return attributeRepository.findAll();
    }

    @Override
    public Optional<Attribute> findById(Integer id) {
        return attributeRepository.findById(id);
    }

    @Override
    public Attribute save(Attribute attribute) {
        return attributeRepository.save(attribute);
    }

    @Override
    public Attribute update(Attribute attribute) {
        return attributeRepository.save(attribute);
    }

    @Override
    public void deleteById(Integer id) {
        attributeRepository.deleteById(id);
    }
}
