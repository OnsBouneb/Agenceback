package com.Serveur.Serveur.Repositories;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.Serveur.Serveur.Entities.Hebergement; ;


@RepositoryRestResource
public interface HebergementRepository extends JpaRepository<Hebergement, Long> {
	 // Optional<Hebergement> findById(Long id);
	  void deleteById(Long id);

}
