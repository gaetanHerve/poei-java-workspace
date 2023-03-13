package tpVilleAuto;

public class Ville {
	private String nom;
	private String pays;
	private String capitale;
	private Double nbHabitant;
	
	private boolean isGrand;
	private boolean isCapitale;
	
	private final int tailleThreshold = 5;
	private final int tailleMin = 0;
	private final int tailleMax = 10;
	
	public Ville() {}

	public Ville(String nom, String pays, String capitale, Double nbHabitant) {
		this.nom = nom;
		this.pays = pays;
		this.capitale = capitale;
		this.setNbHabitant(nbHabitant);
		this.setIsCapitale();
	}

	public Double getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(Double nbHabitant) {
		if (nbHabitant > tailleMin && nbHabitant < tailleMax) {
			this.nbHabitant = nbHabitant;
			isGrand = this.nbHabitant > tailleThreshold;
		}
	}

	public String getNom() {
		return nom;
	}

	public String getPays() {
		return pays;
	}
	
	public String getCapitale() {
		return capitale;
	}
	
	private void setIsCapitale() {
		if (this.nom != null && this.capitale != null)
			this.isCapitale = this.nom.toLowerCase().equals(this.capitale.toLowerCase());
	}

	@Override
	public String toString() {
		String str = "Ville [nom=" + nom + ", pays=" + pays + ", nbHabitant=" + nbHabitant + ", capitale=" + capitale +"]";
		str += isCapitale ? " CAPITALE" : " !CAPITALE";
		str += isGrand ? " GRANDE" : " PETITE";
		return str;
	}
	
}
