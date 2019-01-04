package com.Serveur.Serveur.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.Serveur.Serveur.Entities.Hebergement;
import com.Serveur.Serveur.Entities.Reservation;


@RepositoryRestResource
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
	  Optional<Reservation> findById(Long id);
	  void deleteById(Long id);

}