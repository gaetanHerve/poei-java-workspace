package model;

public abstract class Article {
	protected String nom;
	protected double prix;
	
	public Article(String nom, double prix) {
		this.nom = nom;
		this.prix = prix;
	}
	
	public double getPrix() {
		return prix;
	}

	@Override
	public String toString() {
		return nom + ": " + prix + " EUR";
	}
	
}
