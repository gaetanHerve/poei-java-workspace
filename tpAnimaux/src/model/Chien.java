package model;

public class Chien extends AnimalDomestique {
	
	public Chien(String nom, String proprietaire) {
		super(nom, proprietaire);
	}
	
	public String cri() {
		return "OUAF OUAF";
	}
	
}
