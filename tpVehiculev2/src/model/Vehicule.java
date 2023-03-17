package model;

public class Vehicule {
	private String model;
	private int prix;
	
	public Vehicule(String model, int prix) {
		this.model = model;
		this.prix = prix;
	}

	public String avancer() {
		return "Je roule";
	}

	@Override
	public String toString() {
		return "model=" + model + ", prix=" + prix;
	}

}
