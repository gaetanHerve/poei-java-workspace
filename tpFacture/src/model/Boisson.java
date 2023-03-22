package model;

public class Boisson extends Article {
	
	private EBoisson taille;
	
	public Boisson(String nom, double prix, EBoisson taille) {
		super(nom, prix);
		this.taille = taille;
	}

	@Override
	public String toString() {
		return "Boisson " + super.toString() + " - " + taille;
	}
	
}
