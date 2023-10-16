package com.metropolitan.domaci8.repo;

import com.metropolitan.domaci8.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SuperheroRepo extends JpaRepository<Superhero, Integer> {

    Optional<Superhero> findSuperheroById(int id);

    Optional<Superhero> findFirstBySuperHeroName(String superHeroName);

    List<Superhero> findByPublisher_PublisherName(String publisherName);

    List<Superhero> findByHeightCmGreaterThan(int height);

    List<Superhero> findByWeightKgLessThan(int weight);

    List<Superhero> findByEyeColour_Colour(String eyeColour);

    List<Superhero> findByHairColour_Colour(String hairColour);

    List<Superhero> findByRace_Race(String race);

    List<Superhero> findByAlignment_Alignment(String alignment);

    List<Superhero> findBySuperpower_PowerName(String superpowerName);

}
