package com.payou;

public class Controller {
	
	private Model model ;
	private Vue vue;
	
	

	public Controller(Model model) {

		this.model = model;
		this.vue = new Vue(this,model);
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
	
	public void setJoueur(String n,String p,String s) {
		
		Joueur j = model.creeobjetjoueur(n,p,s);
		model.ajouterJoueur(j);
	}
	
	

}
