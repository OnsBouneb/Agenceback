package com.Serveur.Serveur.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.Serveur.Serveur.Entities.Transport;
import com.Serveur.Serveur.Entities.User;


@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {
	  Optional<User> findById(Long id);
	  void deleteById(Long id);

}

