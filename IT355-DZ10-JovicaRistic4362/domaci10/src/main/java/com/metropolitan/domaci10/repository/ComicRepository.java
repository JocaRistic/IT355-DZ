package com.metropolitan.domaci10.repository;

import com.metropolitan.domaci10.model.Comic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComicRepository extends JpaRepository<Comic, Integer> {
}
