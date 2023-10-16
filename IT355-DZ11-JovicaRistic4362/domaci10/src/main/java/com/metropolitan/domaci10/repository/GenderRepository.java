package com.metropolitan.domaci10.repository;

import com.metropolitan.domaci10.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<Gender, Integer> {
}
