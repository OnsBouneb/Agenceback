package com.Serveur.Serveur.Entities;


import lombok.*;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
public class Vol implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date_depart;
    private Date date_arrive;
    private Date heure_depart;
    private Date heure_arrive;
    private int prix;
    private int place_dispo;
    private String ville_depart;
    private String ville_arrive;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate_depart() {
		return date_depart;
	}
	public void setDate_depart(Date date_depart) {
		this.date_depart = date_depart;
	}
	public Date getDate_arrive() {
		return date_arrive;
	}
	public void setDate_arrive(Date date_arrive) {
		this.date_arrive = date_arrive;
	}
	public Date getHeure_depart() {
		return heure_depart;
	}
	public void setHeure_depart(Date heure_depart) {
		this.heure_depart = heure_depart;
	}
	public Date getHeure_arrive() {
		return heure_arrive;
	}
	public void setHeure_arrive(Date heure_arrive) {
		this.heure_arrive = heure_arrive;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public int getPlace_dispo() {
		return place_dispo;
	}
	public void setPlace_dispo(int place_dispo) {
		this.place_dispo = place_dispo;
	}
	public String getVille_depart() {
		return ville_depart;
	}
	public void setVille_depart(String ville_depart) {
		this.ville_depart = ville_depart;
	}
	public String getVille_arrive() {
		return ville_arrive;
	}
	public void setVille_arrive(String ville_arrive) {
		this.ville_arrive = ville_arrive;
	}
}