package model;

public class AnimalDomestique extends Animal {
	private String proprietaire;

	public AnimalDomestique(String nom, String proprietaire) {
		super(nom);
		this.proprietaire = proprietaire;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", propriétaire=" + proprietaire;
	}
	
}
