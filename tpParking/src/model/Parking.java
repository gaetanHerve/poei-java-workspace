package model;

import java.util.Arrays;

public class Parking {
	private String nom;
	private int taille;
	private Voiture[] voitures;
	
	public Parking(String nom, int taille) {
		this.nom = nom;
		this.taille = taille;
		this.voitures = new Voiture[taille];
	}
	
	public boolean garerVoiture(Voiture voiture) {

		return false;
	}
	
	public boolean quitter(int Matricule) {
		// si voiture > quitter / retourner false
		return false;
	}
	
	public int getCountByMarque(String marque) {
		return 0;
	}
	
	public int getCountByPrix(int prixMin, int prixMax) {
		return 0;
	}
	
	public int getCountVoitures() {
		int count = 0;
		for (Voiture v : voitures) {
			if (v != null) count++;
		}
		return count;
	}

	@Override
	public String toString() {
		return "Parking [nom=" + nom + ", taille=" + taille + ", voitures=" + Arrays.toString(voitures) + "]";
	}
	
	

}
