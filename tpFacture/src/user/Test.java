package user;

import model.*;

public class Test {
	
	public static void main(String[] args) {
		testTpFacture();
	}
	
	static void testTpFacture() {
		Facture facture = new Facture("Dupond");
		
		facture.add(new Ligne(new Gateau("LU", EGateau.choco), 3));
		facture.add(new Ligne(new Boisson("coca", 10.4, EBoisson.grand), 4));
		facture.add(new Ligne(new Gateau("Tresor", EGateau.fraise), 5));
		facture.add(new Ligne(new Boisson("orangina", 3.0, EBoisson.petit), 2));
		
		System.out.println(facture);
	}
	
}
