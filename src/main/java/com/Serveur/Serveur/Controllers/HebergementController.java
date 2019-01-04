package com.Serveur.Serveur.Controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.Serveur.Serveur.Entities.Hebergement;
import com.Serveur.Serveur.Repositories.HebergementRepository;

@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
// @CrossOrigin(origins = "*")
@RestController
public class HebergementController {
    private HebergementRepository repository;

    public HebergementController(HebergementRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/hebergements")
    public List<Hebergement> retrieveAllHebergements() {
        return repository.findAll();
    }
/*

    @PostMapping("/hebergements")
    public ResponseEntity<Object> createHebergement(@RequestBody Hebergement hebergement) {
    	Hebergement savedHebergement = repository.save(hebergement);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedHebergement.getId()).toUri();
        return ResponseEntity.created(location).build();

    }

    @PutMapping("/hebergements/{id}")
    public ResponseEntity<Object> updateHebergement(@RequestBody Hebergement hebergement, @PathVariable long id) {
        Optional<Hebergement> hebergementOptional = repository.findById(id);
        if (!hebergementOptional.isPresent())
            return ResponseEntity.notFound().build();
        hebergement.setId(id);
        repository.save(hebergement);
        return ResponseEntity.noContent().build();
    }
*/
    @DeleteMapping("/hebergements/{id}")
    public void deleteHebergement(@PathVariable long id) {
        repository.deleteById(id);
    }



    @PutMapping("/hebergements")
    public Hebergement updateHebergement(@RequestBody Hebergement hebergement) {
        return repository.save(hebergement);
    }
    @PutMapping("/hebergements/{id}")
    public ResponseEntity<Object> updateHebergement(@RequestBody Hebergement hebergement, @PathVariable long id) {
        Optional<Hebergement> hebergementOptional = repository.findById(id);
        if (!hebergementOptional.isPresent())
            return ResponseEntity.notFound().build();
        hebergement.setId(id);
        repository.save(hebergement);
        return ResponseEntity.noContent().build();
    }


    @PostMapping("/hebergements")
    public ResponseEntity<Object> createHebergement(@RequestBody Hebergement hebergement) {
        Hebergement savedHebergement = repository.save(hebergement);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedHebergement.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("/hebergements/{id}")
    public Hebergement getHebergement(@PathVariable Long id) {

        return repository.findById(id).get();
    }





























}
