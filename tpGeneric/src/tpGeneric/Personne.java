package tpGeneric;


public class Personne {
	private String nom;
	private String prenom;
	private int age;

	
	public Personne() {}
	
	public Personne(String prenom) {
		this.prenom = prenom;
	}
	
	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
}
