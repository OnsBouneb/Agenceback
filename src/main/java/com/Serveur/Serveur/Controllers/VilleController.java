package com.Serveur.Serveur.Controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.Serveur.Serveur.Entities.Ville;
import com.Serveur.Serveur.Repositories.VilleRepository;


import java.net.URI;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
@RestController
public class VilleController {
    private VilleRepository repository;

    public VilleController(VilleRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/villes")
    public List<Ville> retrieveAllVilles() {
        return repository.findAll();
    }
/*
    @PostMapping("/villes")
    public ResponseEntity<Object> createVille(@RequestBody Ville ville) {
    	Ville savedVille = repository.save(ville);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedVille.getId()).toUri();
        return ResponseEntity.created(location).build();

    }

    @PutMapping("/villes/{id}")
    public ResponseEntity<Object> updateCity(@RequestBody Ville ville, @PathVariable long id) {
        Optional<Ville> villeOptional = repository.findById(id);
        if (!villeOptional.isPresent())
            return ResponseEntity.notFound().build();
        ville.setId(id);
        repository.save(ville);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/villes/{id}")
    public void deleteCity(@PathVariable long id) {
        repository.deleteById(id);
    }


}
*/
@PutMapping("/villes")
public Ville updateVille(@RequestBody Ville vol) {
    return repository.save(vol);
}

    @PutMapping("/villes/{id}")
    public ResponseEntity<Object> updateVille(@RequestBody Ville vol, @PathVariable long id) {
        Optional<Ville> volOptional = repository.findById(id);
        if (!volOptional.isPresent())
            return ResponseEntity.notFound().build();
        vol.setId(id);
        repository.save(vol);
        return ResponseEntity.noContent().build();
    }

    /*
        @PostMapping("/vols")
        public Vol createUser(@RequestBody Vol vol) {
            return repository.save(vol);
        }
    */
    @PostMapping("/villes")
    public ResponseEntity<Object> createVille(@RequestBody Ville vol) {
        Ville savedVille = repository.save(vol);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedVille.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("/villes/{id}")
    public Ville getVille(@PathVariable Long id) {

        return repository.findById(id).get();
    }


}

