package user;

import model.*;

public class Test {

	public static void main(String[] args) {
		testTPParking();
	}
	
	static void testTPParking() {
		Parking parking = new Parking("mon Parking", 5);
		System.out.println("PARKING VIDE");
		System.out.println(parking);
		System.out.println("------------------");
		
		Fiche f1 = new Fiche("038764", "Renault", 2500);
		Fiche f2 = new Fiche("652379532", "Citroën", 3000);
		Fiche f3 = new Fiche("087604", "Peugeot", 1750);
		Fiche f4 = new Fiche("076604", "Peugeot", 1750);
		
		Proprio p1 = new Proprio("DUPOND", "avec un D");
		Proprio p2 = new Proprio("DUPONT", "avec un T");
		Proprio p3 = new Proprio("DUPONG", "avec un G");
		
		Voiture v1 = new Voiture(f1, p1);
		Voiture v2 = new Voiture(f2, p2);
		Voiture v3 = new Voiture(f3, p3);
		Voiture v4 = new Voiture(f4, p3);
		
		v1.setVitesse(100);
		v2.setVitesse(130);
		v3.setVitesse(2000);
		v4.setVitesse(75);
		System.out.println("LISTE DES VOITURES (indépendamment du parking): ");
		System.out.println("nb: la Citroën et la Peugeot 087604 ont fait un excès de vitesse");
		printVoitures(new Voiture[]{v1, v2, v3, v4});
		System.out.println("------------------");
		
		System.out.println("LES 4 VOITURES SE GARENT");
		parking.garerVoiture(v1);
		parking.garerVoiture(v2);
		parking.garerVoiture(v3);
		parking.garerVoiture(v4);
		
		System.out.println(parking);
		String marque = "PEUGEOT";
		System.out.println("Voitures de marque " + marque + " : " + parking.getCountByMarque(marque));
		System.out.println("------------------");
		
		System.out.println("LES PEUGEOT QUITTENT LE PARKING");
		parking.quitter(v3.getFiche().getMatricule());
		parking.quitter(v4.getFiche().getMatricule());
		v3.setVitesse(125);
		v4.setVitesse(50);
		
		System.out.println(parking);
		System.out.println("Voitures de marque " + marque + " : " + parking.getCountByMarque(marque));
		System.out.println("------------------");
		
		System.out.println("LES PEUGEOT SE GARENT A NOUVEAU");
		System.out.println("nb: la Peugeot 087604 a à nouveau fait un excès de vitesse");
		parking.garerVoiture(v3);
		parking.garerVoiture(v4);
		
		System.out.println(parking);
		System.out.println("Voitures de marque " + marque + " : " + parking.getCountByMarque(marque));
		System.out.println("------------------");
	}
	
	static void printVoitures(Voiture[] voitures) {
		for (Voiture v : voitures)
			System.out.println(v);
	}

}
