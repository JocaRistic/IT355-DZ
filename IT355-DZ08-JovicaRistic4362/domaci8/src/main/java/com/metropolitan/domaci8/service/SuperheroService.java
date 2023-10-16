package com.metropolitan.domaci8.service;

import com.metropolitan.domaci8.model.*;
import com.metropolitan.domaci8.repo.SuperheroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SuperheroService {

    private final SuperheroRepo superheroRepo;

    @Autowired
    public SuperheroService(SuperheroRepo superheroRepo) {
        this.superheroRepo = superheroRepo;
    }

    public Optional<Superhero> findSuperheroById(int id){
        return superheroRepo.findSuperheroById(id);
    }

    public Optional<Superhero> findFirstBySuperHeroName(String superHeroName){
        return superheroRepo.findFirstBySuperHeroName(superHeroName);
    }

    public List<Superhero> findByPublisherName(String publisherName){
        return superheroRepo.findByPublisher_PublisherName(publisherName);
    }

    public List<Superhero> findByHeightCmGreaterThan(int height){
        return superheroRepo.findByHeightCmGreaterThan(height);
    }

    public List<Superhero> findByWeightKgLessThan(int weight){
        return superheroRepo.findByWeightKgLessThan(weight);
    }

    public List<Superhero> findByEyeColour(String eyeColour){
        return superheroRepo.findByEyeColour_Colour(eyeColour);
    }

    public List<Superhero> findByHairColour(String hairColour){
        return superheroRepo.findByHairColour_Colour(hairColour);
    }

    public List<Superhero> findByRace(String race){
        return superheroRepo.findByRace_Race(race);
    }

    public List<Superhero> findByAlignment(String alignment){
        return superheroRepo.findByAlignment_Alignment(alignment);
    }

    public List<Superhero> findBySuperpowerName(String superpowerName){
        return superheroRepo.findBySuperpower_PowerName(superpowerName);
    }
}
