package user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import model.Client;
import model.Commercial;
import model.EPole;

public class Test {
	public static void main(String[] args) {
		testTpCommercial();
	}
	
	static void testTpCommercial() {
		
		// On génère le set de données de l'entreprise
		Commercial com1 = new Commercial("Sam", 11111);
		Commercial com2 = new Commercial("Tom", 22222);
		Commercial com3 = new Commercial("Bill", 33333);
		
		Commercial[] commerciaux = {com1, com2, com3};
		
		HashMap<Commercial, ArrayList<Client>> entreprise = new HashMap<Commercial, ArrayList<Client>>();
		
		ArrayList<Client> clientsAuto = new ArrayList<Client>();
		clientsAuto.add(new Client("Citroen", EPole.auto, 65));
		clientsAuto.add(new Client("Renault", EPole.auto, 12));
		clientsAuto.add(new Client("Peugeot", EPole.auto, 84));
		
		ArrayList<Client> clientsBanque = new ArrayList<Client>();
		clientsBanque.add(new Client("CMB", EPole.banque, 65));
		clientsBanque.add(new Client("Crédit Coopératif", EPole.banque, 12));
		clientsBanque.add(new Client("BNP", EPole.banque, 84));
		
		ArrayList<Client> clientsAssurance = new ArrayList<Client>();
		clientsAssurance.add(new Client("AXA", EPole.assurance, 65));
		clientsAssurance.add(new Client("Assur'", EPole.assurance, 12));
		clientsAssurance.add(new Client("Rassur'", EPole.assurance, 84));
		
		entreprise.put(com1, clientsAuto);
		entreprise.put(com2, clientsBanque);
		entreprise.put(com3, clientsAssurance);
		
		System.out.println(entreprise);
		
		
		// On propose à l'utilisateur de saisir le numéro de sécu d'un commercial
		// pour afficher la liste de ses clients
		Scanner clavier = new Scanner(System.in);
		System.out.println("choisissez un commercial parmi la liste pour afficher ses clients");
		for (Commercial com : commerciaux) {
			System.out.print(com.getSecu() + "(" + com.getNom() +")\t");
		}
		
		int choix = clavier.nextInt();
		
		System.out.println("Liste des clients: ");
		System.out.println(entreprise.get(new Commercial(choix)));
		
		clavier.close();
	}
}
