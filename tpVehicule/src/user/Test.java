package user;

import model.*;

public class Test {

	public static void main(String[] args) {

		Vehicule vehicule = new Vehicule();
		Velo velo = new Velo();
		Voiture voiture = new Voiture();
		Bateau bateau = new Bateau();
		
		System.out.print(vehicule + ": ");
		System.out.println(vehicule.avancer());
		System.out.print(velo + ": ");
		System.out.println(velo.avancer());
		System.out.print(voiture + ": ");
		System.out.println(voiture.avancer());
		System.out.print(bateau + ": ");
		System.out.println(bateau.avancer());
	}

}
