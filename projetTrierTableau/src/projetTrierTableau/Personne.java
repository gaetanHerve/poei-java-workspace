package projetTrierTableau;


public class Personne implements Comparable<Personne> {
	private String nom;
	private String prenom;
	private int age;

	
	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getAge() {
		return this.age;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Personne o) {
		return ((Integer)(this.age)).compareTo(o.age);
		// return this.nom.compareTo(o.nom);
	}
	
	
}
