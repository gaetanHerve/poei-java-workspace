package model;

public class Proprio {
	private String nom;
	private String prenom;
	
	public Proprio() {}
	
	public Proprio(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Proprio [nom=" + nom + ", prenom=" + prenom + "]";
	}

}
