package model;

public class Voiture {
	public static final int VITESSE_MAX = 300;
	public static final int VITESSE_MIN = 0;
	public static final int LIMITE_VITESSE = 120;
	
	private int vitesse;
	private Fiche fiche;
	private Proprio proprio;
	private int flashCounter;

	public Voiture() { }

	public Voiture(Fiche fiche, Proprio proprio) {
		this.fiche = fiche;
		this.proprio = proprio;
	}

	public void setVitesse(int vitesse) {
		if (vitesse < VITESSE_MIN) {
			this.vitesse = VITESSE_MIN;
		} else if (vitesse > VITESSE_MAX) {
			this.checkFlash(vitesse);
			this.vitesse = VITESSE_MAX;
		} else {
			this.checkFlash(vitesse);
			this.vitesse = vitesse;
		}
	}
	
	private void checkFlash(int vitesse) {
		if (this.vitesse <= LIMITE_VITESSE && vitesse > LIMITE_VITESSE)
			this.flashCounter++;
	}
	
	public Fiche getFiche() {
		return fiche;
	}

	@Override
	public String toString() {
		return "Voiture [vitesse=" + vitesse + ", flashes=" + flashCounter + ", fiche=" + fiche + ", proprio=" + proprio  + "]";
	}
	
}
