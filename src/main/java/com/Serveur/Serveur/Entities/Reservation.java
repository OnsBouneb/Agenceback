package com.Serveur.Serveur.Entities;

import lombok.*;
import lombok.NoArgsConstructor;
import javax.persistence.*;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userID")
    private User User;

    @ManyToOne
    @JoinColumn(name = "volID")
    private Vol vol;

    @ManyToOne
    @JoinColumn(name = "hebergementID")
    private Hebergement hebergement;

    @ManyToOne
    @JoinColumn(name = "transportID")
    private Transport transport;

    private int nbre_personne;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return User;
	}

	public void setUser(User user) {
		User = user;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public Hebergement getHebergement() {
		return hebergement;
	}

	public void setHebergement(Hebergement hebergement) {
		this.hebergement = hebergement;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public int getNbre_personne() {
		return nbre_personne;
	}

	public void setNbre_personne(int nbre_personne) {
		this.nbre_personne = nbre_personne;
	}
}