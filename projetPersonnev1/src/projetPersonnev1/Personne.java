package projetPersonnev1;

public class Personne {
	
	String nom;
	String prenom;
	int age;
	
	public Personne() {}
	
	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	String getInfo() {
		return nom + " " + prenom + " " + age;
	}

}
