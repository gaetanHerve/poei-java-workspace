package user;

import java.util.ArrayList;

import model.*;

public class Test {
	
	public static void main(String[] args) {
		testTpFacture();
	}
	
	static void testTpFacture() {
		Facture facture = new Facture("Dupond");
		
		ArrayList<Ligne> panier = new ArrayList<Ligne>();
		panier.add(new Ligne(new Gateau("LU", EGateau.choco), 3));
		panier.add(new Ligne(new Boisson("coca", 10.4, EBoisson.grand), 4));
		panier.add(new Ligne(new Gateau("Tresor", EGateau.fraise), 5));
		panier.add(new Ligne(new Boisson("orangina", 3.0, EBoisson.petit), 2));
		
		facture.setLignes(panier);
		
		System.out.println(facture);
	}
	
}
