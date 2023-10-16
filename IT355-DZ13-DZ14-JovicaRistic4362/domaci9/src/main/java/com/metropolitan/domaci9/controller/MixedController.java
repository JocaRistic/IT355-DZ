package com.metropolitan.domaci9.controller;

import com.metropolitan.domaci9.model.*;
import com.metropolitan.domaci9.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
@RequiredArgsConstructor
public class MixedController {

    private final AlignmentService alignmentService;
    private final ColourService colourService;
    private final GenderService genderService;
    private final PublisherService publisherService;
    private final RaceService raceService;
    private final SuperpowerService superpowerService;

    @GetMapping("/alignment")
    public ResponseEntity<List<Alignment>> getAllAlignment(){
        return ResponseEntity.ok(alignmentService.findAll());
    }

    @GetMapping("/colour")
    public ResponseEntity<List<Colour>> getAllColour(){
        return ResponseEntity.ok(colourService.findAll());
    }

    @GetMapping("/gender")
    public ResponseEntity<List<Gender>> getAllGender(){
        return ResponseEntity.ok(genderService.findAll());
    }

    @GetMapping("/publisher")
    public ResponseEntity<List<Publisher>> getAllPublisher(){
        return ResponseEntity.ok(publisherService.findAll());
    }

    @GetMapping("/race")
    public ResponseEntity<List<Race>> getAllRace(){
        return ResponseEntity.ok(raceService.findAll());
    }

    @GetMapping("/superpower")
    public ResponseEntity<List<Superpower>> getAllSuperpower(){
        return ResponseEntity.ok(superpowerService.findAll());
    }

}
