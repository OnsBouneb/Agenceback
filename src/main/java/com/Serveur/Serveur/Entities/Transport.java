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
public class Transport implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    private int prix;
    private int nbre_place_dispo;
    private Date date_depart_dispo;
    private Date date_fin_dispo;
	private Date heure_depart_dispo;
    private Date heure_fin_dispo;
    //@ManyToOne
    //@JoinColumn(name = "villeID", referencedColumnName="villeID")
    private int  ville;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getPrix() {
		return prix;
	}


	public void setPrix(int prix) {
		this.prix = prix;
	}


	public int getNbre_place_dispo() {
		return nbre_place_dispo;
	}


	public void setNbre_place_dispo(int nbre_place_dispo) {
		this.nbre_place_dispo = nbre_place_dispo;
	}


	public Date getDate_depart_dispo() {
		return date_depart_dispo;
	}


	public void setDate_depart_dispo(Date date_depart_dispo) {
		this.date_depart_dispo = date_depart_dispo;
	}


	public Date getDate_fin_dispo() {
		return date_fin_dispo;
	}


	public void setDate_fin_dispo(Date date_fin_dispo) {
		this.date_fin_dispo = date_fin_dispo;
	}


	public Date getHeure_depart_dispo() {
		return heure_depart_dispo;
	}


	public void setHeure_depart_dispo(Date heure_depart_dispo) {
		this.heure_depart_dispo = heure_depart_dispo;
	}


	public Date getHeure_fin_dispo() {
		return heure_fin_dispo;
	}


	public void setHeure_fin_dispo(Date heure_fin_dispo) {
		this.heure_fin_dispo = heure_fin_dispo;
	}


	public int getVille() {
		return ville;
	}


	public void setVille(int ville) {
		this.ville = ville;
	}
}