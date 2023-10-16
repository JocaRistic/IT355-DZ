package com.metropolitan.domaci8.controller;

import com.metropolitan.domaci8.model.Superhero;
import com.metropolitan.domaci8.service.SuperheroService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/superhero")
public class SuperheroController {

    private final SuperheroService superheroService;

    @Autowired
    public SuperheroController(SuperheroService superheroService) {
        this.superheroService = superheroService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Superhero> getSuperheroById(@PathVariable("id") int id){
        Optional<Superhero> superhero = superheroService.findSuperheroById(id);

        return superhero.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/{name}")
    public ResponseEntity<Superhero> getSuperheroBySuperHeroName(@PathVariable("name") String name) {
        Optional<Superhero> superhero = superheroService.findFirstBySuperHeroName(name);

        return superhero.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/{publisherName}")
    public ResponseEntity<List<Superhero>> getByPublisherName(@PathVariable("publisherName") String publisherName){
        return ResponseEntity.ok(superheroService.findByPublisherName(publisherName));
    }

    @GetMapping("/{heightCm}")
    public ResponseEntity<List<Superhero>> getByByHeightCmGreaterThan(@PathVariable("heightCm") int heightCm){
        return ResponseEntity.ok(superheroService.findByHeightCmGreaterThan(heightCm));
    }

    @GetMapping("/{weightKg}")
    public ResponseEntity<List<Superhero>> getByWeightKgLessThan(@PathVariable("weightKg") int weightKg){
        return ResponseEntity.ok(superheroService.findByWeightKgLessThan(weightKg));
    }

    @GetMapping("/{eyeColour}")
    public ResponseEntity<List<Superhero>> getByEyeColour(@PathVariable("eyeColour") String eyeColour){
        return ResponseEntity.ok(superheroService.findByEyeColour(eyeColour));
    }

    @GetMapping("/{hairColour}")
    public ResponseEntity<List<Superhero>> getByHairColour(@PathVariable("hairColour") String hairColour){
        return ResponseEntity.ok(superheroService.findByHairColour(hairColour));
    }

    @GetMapping("/{race}")
    public ResponseEntity<List<Superhero>> getByRace(@PathVariable("race") String race){
        return ResponseEntity.ok(superheroService.findByRace(race));
    }

    @GetMapping("/{alignment}")
    public ResponseEntity<List<Superhero>> getByAlignment(@PathVariable("alignment") String alignment){
        return ResponseEntity.ok(superheroService.findByAlignment(alignment));
    }

    @GetMapping("/{superpowerName}")
    public ResponseEntity<List<Superhero>> getBySuperpowerName(@PathVariable("superpowerName") String superpowerName){
        return ResponseEntity.ok(superheroService.findBySuperpowerName(superpowerName));
    }
}
