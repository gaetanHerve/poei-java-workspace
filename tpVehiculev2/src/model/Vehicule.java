package model;

public abstract class Vehicule {
	private String model;
	private int prix;
	
	public Vehicule(String model, int prix) {
		this.model = model;
		this.prix = prix;
	}

	public abstract String avancer();

	@Override
	public String toString() {
		return "model=" + model + ", prix=" + prix;
	}

}
