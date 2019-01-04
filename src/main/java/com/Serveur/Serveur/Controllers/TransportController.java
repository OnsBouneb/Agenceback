package com.Serveur.Serveur.Controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.Serveur.Serveur.Entities.Transport;
import com.Serveur.Serveur.Repositories.TransportRepository;

import java.net.URI;
import java.util.List;
import java.util.Optional;
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
@RestController
public class TransportController {
    private TransportRepository repository;

    public TransportController(TransportRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/transports")
    public List<Transport> retrieveAllTransports() {
        return repository.findAll();
    }


    @PostMapping("/transports")
    public ResponseEntity<Object> createTransport(@RequestBody Transport transport) {
        Transport savedTransport = repository.save(transport);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedTransport.getId()).toUri();
        return ResponseEntity.created(location).build();

    }

    /*
    @PutMapping("/transports/{id}")
    public ResponseEntity<Object> updateTransport(@RequestBody Transport transport, @PathVariable long id) {
        Optional<Transport> transportOptional = repository.findById(id);
        if (!transportOptional.isPresent())
            return ResponseEntity.notFound().build();
        transport.setId(id);
        repository.save(transport);
        return ResponseEntity.noContent().build();
    }

  
    @DeleteMapping("/transports/{id}")
    public void deleteTransport(@PathVariable long id) {
        repository.deleteById(id);
    }

*/
@GetMapping("/transport/{id}")
public Transport getTransport(@PathVariable Long id) {

    return repository.findById(id).get();
}

    @DeleteMapping("/transports/{id}")
    public void deleteTransport(@PathVariable long id) {
        repository.deleteById(id);
    }

    @PutMapping("/transports")
    public Transport updateTransport(@RequestBody Transport vol) {
        return repository.save(vol);
    }

    @PutMapping("/transports/{id}")
    public ResponseEntity<Object> updateTransport(@RequestBody Transport transport, @PathVariable long id) {
        Optional<Transport> transportOptional = repository.findById(id);
        if (!transportOptional.isPresent())
            return ResponseEntity.notFound().build();
        transport.setId(id);
        repository.save(transport);
        return ResponseEntity.noContent().build();
    }

}
