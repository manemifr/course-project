package com.payou;

public class Joueur {
	
	private String Nom;
	private String Prenom;
	private String sexe;
	
	public Joueur(String nom,String prenom,String sexe) {
		
		Nom = nom;
		Prenom = prenom;
		this.sexe= sexe;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	
	

}
