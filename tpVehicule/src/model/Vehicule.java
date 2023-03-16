package model;

public class Vehicule {
	
	public String avancer() {
		return "Je roule";
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
	
	

}
