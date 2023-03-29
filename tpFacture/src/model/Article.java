package model;

public abstract class Article {
	private String nom;
	private double prix;
	
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
