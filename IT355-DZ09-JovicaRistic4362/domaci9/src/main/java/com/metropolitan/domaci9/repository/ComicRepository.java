package com.metropolitan.domaci9.repository;

import com.metropolitan.domaci9.model.Comic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComicRepository extends JpaRepository<Comic, Integer> {
}
