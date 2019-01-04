package com.Serveur.Serveur.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.Serveur.Serveur.Entities.Reservation;
import com.Serveur.Serveur.Entities.Transport;


@RepositoryRestResource
public interface TransportRepository extends JpaRepository<Transport, Long> {
	 // Optional<Transport> findById(Long id);
	  void deleteById(Long id);

}
