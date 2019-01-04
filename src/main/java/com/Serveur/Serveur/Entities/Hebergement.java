package com.Serveur.Serveur.Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Hebergement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //@ManyToOne
    // @JoinColumn(name = "villeID", referencedColumnName="villeID")
    private int ville;
    private Date date_depart_dispo;
    private Date date_fin_dispo;
    private  String designation;
    private int prix;
    private int nbre_chambre;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getVille() {
		return ville;
	}
	public void setVille(int ville) {
		this.ville = ville;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public int getNbre_chambre() {
		return nbre_chambre;
	}
	public void setNbre_chambre(int nbre_chambre) {
		this.nbre_chambre = nbre_chambre;
	}
}