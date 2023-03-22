package model;

public class Gateau extends Article {
	
	private EGateau saveur;
	
	public Gateau(String nom, EGateau saveur) {
		super(nom, saveur.getPrix());
		this.saveur = saveur;
	}

	@Override
	public String toString() {
		return "Gateau " + super.toString() + " - " + saveur;
	}

}
