package com.Serveur.Serveur.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.Serveur.Serveur.Entities.Vol;
import com.Serveur.Serveur.Repositories.VolRepository;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
// @CrossOrigin(origins = "*")
@RestController
public class VolController {
    private VolRepository repository;

    public VolController(VolRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/vols")
    public List<Vol> retrieveAllVols() {
        return repository.findAll();
    }

/*
    @PostMapping("/vols")
    public ResponseEntity<Object> createVol(@RequestBody Vol vol) {
        Vol savedVol = repository.save(vol);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedVol.getId()).toUri();
        return ResponseEntity.created(location).build();

    }

    @PutMapping("/vols/{id}")
    public ResponseEntity<Object> updateVol(@RequestBody Vol vol, @PathVariable long id) {
        Optional<Vol> volOptional = repository.findById(id);
        if (!volOptional.isPresent())
            return ResponseEntity.notFound().build();
        vol.setId(id);
        repository.save(vol);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/vols/{id}")
    public void deleteVol(@PathVariable long id) {
        repository.deleteById(id);
    }

*/


    @DeleteMapping("/vols/{id}")
    public void deleteVol(@PathVariable long id) {
        repository.deleteById(id);
    }

    @PutMapping("/vols")
    public Vol updateUser(@RequestBody Vol vol) {
        return repository.save(vol);
    }
    @PutMapping("/vols/{id}")
    public ResponseEntity<Object> updateVol(@RequestBody Vol vol, @PathVariable long id) {
        Optional<Vol> volOptional = repository.findById(id);
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
    @PostMapping("/vols")
    public ResponseEntity<Object> createVol(@RequestBody Vol vol) {
        Vol savedVol = repository.save(vol);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedVol.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

        @GetMapping("/vols/{id}")
    public Vol getVol(@PathVariable Long id) {

            return repository.findById(id).get();
        }


}
