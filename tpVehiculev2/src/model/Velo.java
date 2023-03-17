package model;

public class Velo extends Vehicule {
	
	public Velo(String model, int prix) {
		super(model, prix);
	}
	
	public String avancer() {
		return super.avancer() + " a deux roues";
	}

	@Override
	public String toString() {
		return "Velo " + super.toString();
	}

}
