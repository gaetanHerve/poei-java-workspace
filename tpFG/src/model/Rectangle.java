package model;

public class Rectangle extends FG {
	private double longueur;
	private double largeur;

	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculAire() {
		return longueur * largeur;
	}

	@Override
	public double calculPerim() {
		return (longueur*2 + largeur*2);
	}
	
}
