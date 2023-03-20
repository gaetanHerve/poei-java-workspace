package model;



public class Bateau extends Vehicule {
	private Ebateau taille;
	private boolean metIceberg;
	
	public Bateau(String model, int prix, Ebateau taille) {
		super(model, prix);
		this.taille = taille;
	}
	
	@Override
	public String avancer() {
		return !this.metIceberg ? "Je flotte" : "Je coule";
	}
	
	public void meetIceberg() {
		this.metIceberg = true;
	}

	@Override
	public String toString() {
		return "Bateau " + super.toString() + " nombre de places=" + taille.getNbPlaces();
	}
	
}
