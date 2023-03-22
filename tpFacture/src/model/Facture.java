package model;

import java.util.ArrayList;

public class Facture {
	private ArrayList<Ligne> lignes;
	private String nomClient;
	
	public Facture(String nomClient) {
		this.nomClient = nomClient;
	}
	
	public Facture(ArrayList<Ligne> lignes, String nomClient) {
		this.lignes = lignes;
		this.nomClient = nomClient;
	}

	public ArrayList<Ligne> getLignes() {
		return lignes;
	}

	public void setLignes(ArrayList<Ligne> lignes) {
		this.lignes = lignes;
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
