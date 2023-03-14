package model;

public class Fiche {
	private String matricule;
	private String marque;
	private int prix;
	
	public Fiche() {}
	
	public Fiche(String matricule, String marque, int prix) {
		this.matricule = matricule;
		this.marque = marque;
		this.prix = prix;
	}
	
	public String getMatricule() {
		return matricule;
	}
	
	public String getMarque() {
		return marque;
	}
	
	public int getPrix() {
		return prix;
	}

	@Override
	public String toString() {
		return "Fiche [matricule=" + matricule + ", marque=" + marque + ", prix=" + prix + "]";
	}

}
