package model;

public class Voiture extends Vehicule {
	boolean gps;
	
	public Voiture(String model, int prix) {
		super(model, prix);
	}
	
	@Override
	public String avancer() {
		return "Je roule";
	}
	
	public void gpsOnOff() {
		this.gps = !gps;
	}

	@Override
	public String toString() {
		String gpsStatus = gps ? "actif" : "inactif";
		return "Voiture " + super.toString() +" gps=" + gpsStatus;
	}
	
}
