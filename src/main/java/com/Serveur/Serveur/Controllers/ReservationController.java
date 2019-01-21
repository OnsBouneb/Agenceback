package com.Serveur.Serveur.Controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.Serveur.Serveur.Entities.Reservation;
import com.Serveur.Serveur.Repositories.ReservationRepository;

import java.net.URI;
import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
public class ReservationController {
    private ReservationRepository repository;

    public ReservationController(ReservationRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/reservations")
    public List<Reservation> retrieveAllReservations() {
        return repository.findAll();
    }


    @DeleteMapping("/reservations/{id}")
    public void deleteReservation(@PathVariable long id) {
        repository.deleteById(id);
    }

    @PutMapping("/reservations")
    public Reservation updateUser(@RequestBody Reservation Reservation) {
        return repository.save(Reservation);
    }
    @PutMapping("/reservations/{id}")
    public ResponseEntity<Object> updateReservation(@RequestBody Reservation Reservation, @PathVariable long id) {
        Optional<Reservation> ReservationOptional = repository.findById(id);
        if (!ReservationOptional.isPresent())
            return ResponseEntity.notFound().build();
        Reservation.setId(id);
        repository.save(Reservation);
        return ResponseEntity.noContent().build();
    }

    /*
        @PostMapping("/reservations")
        public Reservation createUser(@RequestBody Reservation Reservation) {
            return repository.save(Reservation);
        }
    */
    @PostMapping("/reservations")
    public ResponseEntity<Object> createReservation(@RequestBody Reservation Reservation) {
        Reservation savedReservation = repository.save(Reservation);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedReservation.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("/reservations/{id}")
    public Reservation getReservation(@PathVariable Long id) {

        return repository.findById(id).get();
    }




}
