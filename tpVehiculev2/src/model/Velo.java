package model;

public class Velo extends Vehicule {
	
	public Velo(String model, int prix) {
		super(model, prix);
	}
	
	@Override
	public String avancer() {
		return "Je roule a deux roues";
	}

	@Override
	public String toString() {
		return "Velo " + super.toString();
	}

}
