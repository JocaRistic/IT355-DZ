package com.metropolitan.domaci10.controller;

import com.metropolitan.domaci10.model.Publisher;
import com.metropolitan.domaci10.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller
@RequestMapping("/publisher")
@RequiredArgsConstructor
public class PublisherController {

    private final PublisherService publisherService;

    @GetMapping
    public ResponseEntity<List<Publisher>> getAll(){
        return ResponseEntity.ok(publisherService.findAll());
    }

    @GetMapping("/{publisherId}")
    public ResponseEntity<Publisher> getById(@PathVariable Integer publisherId){
        return ResponseEntity.ok(publisherService.findById(publisherId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "PublisherNotFound")));
    }

    @PostMapping
    public ResponseEntity<Publisher> save(@RequestBody Publisher publisher){
        return ResponseEntity.ok(publisherService.save(publisher));
    }

    @PutMapping
    public ResponseEntity<Publisher> update(@RequestBody Publisher publisher){
        return ResponseEntity.ok(publisherService.update(publisher));
    }

    @DeleteMapping("/{publisherId}")
    public ResponseEntity<Publisher> deleteById(@PathVariable Integer publisherId){
        publisherService.deleteById(publisherId);
        return ResponseEntity.ok().build();
    }

}
