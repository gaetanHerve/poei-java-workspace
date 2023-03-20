package model;

public class AutoEntreprise extends Entreprise {
	
	public AutoEntreprise() {
		
	}
	
	public AutoEntreprise(String nom, TailleEntreprise taille, Domaine domaine) {
		super(nom, taille, domaine);
	}

	public AutoEntreprise(String nom, double capital, TailleEntreprise taille, Domaine domaine) {
		super(nom, capital, taille, domaine);
	}
	
	public void gagneArgent(double somme) {
		this.capital += somme;
		this.faillite = this.capital < 0;
	}

}
