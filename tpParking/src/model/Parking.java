package model;

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
		boolean voitureGaree = false;
		
		for (int i = 0; i < taille; i++) {
			if (voitures[i] == null) {
				voitures[i] = voiture;
				voiture.setVitesse(0);
				voitureGaree = true;
				break;
			}
		}
		return voitureGaree;
	}
	
	public boolean quitter(String matricule) {
		boolean placeLiberee = false;
		for (int i = 0; i < taille; i++) {
			if (this.voitures[i] != null) {
				Fiche fiche = voitures[i].getFiche();
				if (fiche != null && fiche.getMatricule().equals(matricule)) {
					voitures[i] = null;
					placeLiberee = true;
					break;
				}
			}
		}
		return placeLiberee;
	}
	
	public int getCountByMarque(String marque) {
		int count = 0;
		for (Voiture v : voitures) {
			if (v != null) {
				Fiche fiche = v.getFiche();
				if (fiche != null && fiche.getMarque().equalsIgnoreCase(marque))
					count++;
			}
		}
		return count;
	}
	
	public int getCountByPrix(int prixMin, int prixMax) {
		int count = 0;
		for (Voiture v : voitures) {
			Fiche fiche = v.getFiche();
			if (fiche != null) {
				int prix = fiche.getPrix();
				if (prix >= prixMin && prix <= prixMax)
					count++;
			}
		}
		return count;
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
		String str = "PARKING " + nom;
		str += "\nVoitures garées:";
		if (getCountVoitures() == 0) {
			str += " aucune";
		} else {
			for (Voiture v : voitures)
				if (v != null) str += "\n" + v;
		}
		return str;
	}
	
}
