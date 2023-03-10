package projetPersonnev2;

public class Personne {
	
	// initialiseur
	String nom;
	String prenom;
	int age;
	
	// constructeurs
	// 1. implicite
	// 2. par défaut
	// 3. d'initialisation
	
	// constructeur par défaut
	Personne() {}
	
	// constructeur d'initialisation
	Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	// constructeur d'initialisation
	Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	String getInfo() {
		return this.nom + " " + this.prenom + " " + this.age;
	}
}
