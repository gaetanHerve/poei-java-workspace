package user;
import model.*;

public class Test {
	public static void main(String[] args) {
		testAnimaux();
	}
	static void testAnimaux() {
		Chat chat = new Chat("Minou", "MinouMaster");
		Chien chien = new Chien("Chienchien", "OuafMaster");
		Renard renard = new Renard("Mister Renard");
		// Animal tigre = new Animal("TIgrou");
		
		renard.setProie("Poule");
		
		Animal[] animaux = {chat, chien, renard};
		
		for (Animal animal : animaux) {
			System.out.println(animal);
			System.out.println(animal.cri());
		}
		
	}
}

	

//
//Créer la classe Animal avec :
//un constructeur pour initialiser le nom
//un nom(string) en privé 
//une méthode cri qui retourne un string
//et une méthode toString qui retourne le nom de la classe et le nom de l'animal;
//
//
//créer la classe renard qui hérite d'animal, elle a :
//une proie(string) en privé. La variable n'est pas initialisé dans le constructeur
//un setter pour modifier la proie
//à vous de juger ce qui devrait être ajouter ou modifier.
//
//
//Créer la classe animal domestique qui hérite d'animal, elle a :
//un proprietaire(string)
//le propriétaire est initialisé dans le constructeur,
//a vous de juger pour le reste
//
//
//Créer la classe Chien qui hérite de animalDomestique. Elle a :
//rien de particulier, à vous de juger s'il faut modifier quelque chose
//
//
//Créer la classe Chat qui hérite de animalDomestique. Elle a :
//rien de particulier, à vous de juger s'il faut modifier quelque chose
//
//
//Créer une méthode de test qui permet de voir les utilisation des différentes classes
//
//Bonus : Dans les test, utilisez le cast implicite ou le polymorphisme pour faire
// un tableau d'animaux et les faire tous crier dans une boucle for

