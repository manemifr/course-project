package com.payou;

import java.util.Observable;

public class Model extends Observable{
	
	boolean joueurajouter;
	
	public Joueur creeobjetjoueur(String n,String p,String s) {
		
		Joueur joueur = new Joueur(n,p,s);
		return joueur;
	}
	
	public void ajouterJoueur(Joueur j) {
		JoueurImpl joueurimpl = new JoueurImpl();
		 if (joueurimpl.create(j)) {
			 joueurajouter = true;
		 }
		 else {
			 joueurajouter = false;
		 }
		 this.setChanged();
		 this.notifyObservers();
	}
	
	boolean isJoueurajouter() {
		return joueurajouter;
				}


}
