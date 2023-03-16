package model;

public class Velo extends Vehicule {
	
	public String avancer() {
		String str = super.avancer(); 
		str += "...a deux roues";
		return str;
	}

}
