package user;

import model.AutoEntreprise;
import model.Domaine;
import model.Entreprise;
import model.TailleEntreprise;

public class Test {
	public static void main(String[] args) {
		testEntreprise();
	}
	
	static void testEntreprise() {
		Entreprise e1 = new Entreprise("Entreprise 1", 10000.0, TailleEntreprise.tpe, Domaine.informatique);
		Entreprise e2 = new Entreprise("Entreprise 2", 20000.0, TailleEntreprise.pme, Domaine.publique);
		AutoEntreprise ae1 = new AutoEntreprise("AutoEntreprise", 20000.0, TailleEntreprise.pme, Domaine.publique);
		Entreprise[] entreprises = {e1, e2};
		affiche(entreprises);
		
		e1.commissionne(5000, e2);
		affiche(entreprises);
	}
	
	static void affiche(Entreprise[] entreprises) {
		System.out.println("\n-----------RESULTS-----------");
		for (Entreprise entreprise : entreprises) {
			System.out.println(entreprise);
		}
	}
}
