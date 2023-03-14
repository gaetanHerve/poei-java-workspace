package model;

public class Voiture {
	private static final int vitesseMax = 300;
	private static final int vitesseMin = 0;
	// quand on passe de en-dessous à au-dessus de la vitesse autorisée => flash
	private static final int vitesseMaxAutorisee = 120;
	
	// vitesse entre 0 et 300;
	private int vitesse;
	private Fiche fiche;
	private Proprio proprio;
	private int flashCounter;

	public Voiture() { }

	public Voiture(Fiche fiche, Proprio proprio) {
		this.fiche = fiche;
		this.proprio = proprio;
	}

	@Override
	public String toString() {
		return "Voiture [vitesse=" + vitesse + ", fiche=" + fiche + ", proprio=" + proprio + ", flashCounter="
				+ flashCounter + "]";
	}
	
}
