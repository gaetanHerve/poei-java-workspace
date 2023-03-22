package model;

public enum EGateau {
	choco(1.5), vanille(3.0), fraise(5.0);
	
	private double prix;
	
	private EGateau(double prix) {
		this.prix = prix;
	}

	public double getPrix() {
		return prix;
	}
	
	public String toString() {
		return "saveur: " + this.name();
	}
	
}
