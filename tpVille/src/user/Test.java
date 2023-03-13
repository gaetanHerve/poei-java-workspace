package user;

import model.Ville;

public class Test {

	public static void main(String[] args) {
		testVillesv4();
	}
	
	static void testVillesv4() {
		Ville v0 = new Ville();
		System.out.println(v0);
		System.out.println("instanciation et affichage de 3 villes: ");
		Ville v1 = new Ville("Toulouse", "France", 0.498);
		Ville v2 = new Ville("Marseille", "France", 0.87);
		Ville v3 = new Ville("Mexico", "Mexique", 9.209);
		Ville[] villes = {v1, v2, v3};
		printVilles(villes);
		
		System.out.println("\nattributs de v3: ");
		System.out.println(v3.getNom());
		System.out.println(v3.getPays());
		System.out.println(v3.getNbHbts());
		System.out.println(v3.getTaille());
		
		
		System.out.println("\nModification de v3.nbHbts: ");
		System.out.println(v3);
		v3.setNbHbts(3.2);
		System.out.println(v3);
	}
	
	static void printVilles(Ville[] tab) {
		for (Ville e : tab) {
			System.out.println(e);
		}
	}

}
