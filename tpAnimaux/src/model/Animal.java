package model;

public abstract class Animal {
	private String nom;

	public Animal(String nom) {
		this.nom = nom;
	}
	
	public String cri() {
		return "CRI ANIMAl";
	}

	@Override
	public String toString() {
		return  this.getClass().getSimpleName() + " nom=" + nom;
	}
	
}
