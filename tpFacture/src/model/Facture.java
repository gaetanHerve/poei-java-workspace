package model;

import java.util.ArrayList;

public class Facture {
	private ArrayList<Ligne> lignes = new ArrayList<Ligne>();
	private String nomClient;
	
	public Facture(String nomClient) {
		this.nomClient = nomClient;
	}
	
	public void add(Ligne ligne) {
		this.lignes.add(ligne);
	}

	public double prixTotal() {
		double result = 0.0;
		for (Ligne ligne : lignes) {
			result += ligne.getPrixLigne();
		}
		return result;
	}
	
	@Override
	public String toString() {
		String result = "----------\n";
		result += "Facture client: " + nomClient + "\n";
		for (Ligne ligne : lignes) {
			result += ligne + "\n";
		}
		result += "\ntotal: " + prixTotal() + "EUR(S)";
		return result;
	}

}
