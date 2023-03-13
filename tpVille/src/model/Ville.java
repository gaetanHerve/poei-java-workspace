package model;

public class Ville {

	private String nom;
	private String pays;
	private Double nbHbts;
	private String taille;
	
	public Ville() {}
	
	public Ville(String nom, String pays, Double nbHbts) {
		this.nom = nom;
		this.pays = pays;
		this.setNbHbts(nbHbts);
	}
	
	public String getNom() {
			return (nom != null) ? nom.toLowerCase() : "NA";
	}

	public String getPays() {
		return (pays != null) ? pays.toUpperCase() : "NA";
	}

	public Double getNbHbts() {
		return nbHbts;
	}
	
	public void setNbHbts(Double nbHbts) {
		if (nbHbts > 0 && nbHbts <= 10) {
			this.nbHbts = nbHbts;
			this.taille = this.nbHbts <= 5 ? "petit" : "grand";
		}
	}
	
	public String getTaille() {
		return taille;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + this.getNom() + ", pays=" + this.getPays() + ", nbHbts=" + nbHbts + ", taille=" + taille + "]";
	}
}
