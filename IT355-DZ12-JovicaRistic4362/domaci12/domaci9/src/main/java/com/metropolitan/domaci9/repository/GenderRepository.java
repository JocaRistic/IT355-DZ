package com.metropolitan.domaci9.repository;

import com.metropolitan.domaci9.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<Gender, Integer> {
}
