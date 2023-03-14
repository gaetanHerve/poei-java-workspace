package user;

import model.*;

public class Test {

	public static void main(String[] args) {
		// testv1();
		testv2();
	}
	
	static void testv2() {
		Info infoTest = new Info("0666666666", "client1@monClient.org");
		Compte compteTest = new Compte("000607654239", 1432.78, "Crédit Coopératif");
		Client c = new Client("DUPOND", "avec un D", infoTest, compteTest);
		
		System.out.println("1.Accéder en lecture et écriture au nom du client");
		System.out.println("nom: " + c.getNom());
		c.setNom("DUPONT");
		System.out.println("nom modifié: " + c.getNom());
		
		System.out.println("----------------------");
		
		System.out.println("2.Accéder en lecture et écriture au tel du client");
		System.out.println("tel: " + c.getInfo().getTel());
		c.getInfo().setTel("0655555555");
		System.out.println("tel modifié: " + c.getInfo().getTel());
		
		System.out.println("----------------------");
		
		System.out.println("3.depuis un client modifier le solde du compte dun client");
		System.out.println("compte avec solde initial: " + c.getCompte());
		c.getCompte().setSolde(1324.55);
		System.out.println("compte avec solde modifié: " + c.getCompte());
		
		System.out.println("----------------------");
		
		System.out.println("4.depuis un client afficher le nom de la banque et son email");
		System.out.println("Banque: " + c.getCompte().getBanque());
		System.out.println("Banque: " + c.getInfo().getEmail());
		
		System.out.println("----------------------");
		
		System.out.println("5.depuis le client, lui attribuer un autre compte bancaire et l'afficher");
		System.out.println("compte initial: " + c.getCompte());
		c.setCompte(new Compte("0954238756423085", 134.87, "Crédit Mutuel"));
		System.out.println("nouveau compte: " + c.getCompte());
	}
	
	static void testv1() {
		Info infoTest = new Info("0666666666", "client1@monClient.org");
		Compte compteTest = new Compte("000607654239", 1432.78, "Crédit Coopératif");
		
		System.out.println("1.un client avec info et compte....");
		Client c1 = new Client("DUPOND", "avec un D", infoTest, compteTest);
		System.out.println(c1);
		
		System.out.println("----------------------");
		
		System.out.println("2.un client avec info et sans compte....");
		Client c2 = new Client("DUPONT", "avec un T", infoTest);
		System.out.println(c2);
		
		System.out.println("----------------------");
		
		System.out.println("3.un client sans info et avec compte....");
		Client c3 = new Client("DUPONH", "avec un H", compteTest);
		System.out.println(c3);
		
		System.out.println("----------------------");
		
		System.out.println("4.un client sans info et sans compte....");
		Client c4 = new Client("DUPONG", "avec un G");
		System.out.println(c4);
	}

}
