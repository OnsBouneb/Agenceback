package com.Serveur.Serveur.Repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.Serveur.Serveur.Entities.User;
import com.Serveur.Serveur.Entities.Ville;


@RepositoryRestResource
public interface VilleRepository extends JpaRepository<Ville, Long> {
	  //Optional<Ville> findById(Long id);
	  void deleteById(Long id);
}
