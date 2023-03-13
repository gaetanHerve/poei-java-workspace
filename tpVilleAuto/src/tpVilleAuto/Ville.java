package tpVilleAuto;

public class Ville {
	private String nom;
	private String pays;
	private Double nbHabitant;
	
	public Ville() {
	}

	public Ville(String nom, String pays, Double nbHabitant) {
		this.nom = nom;
		this.pays = pays;
		this.nbHabitant = nbHabitant;
	}

	public Double getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(Double nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	public String getNom() {
		return nom;
	}

	public String getPays() {
		return pays;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", pays=" + pays + ", nbHabitant=" + nbHabitant + "]";
	}
	
}
