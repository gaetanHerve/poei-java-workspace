package projetPersonnev3;

public class Personne {

	private String nom;
	private String prenom;
	private int age;
	private String status; // mineur / majeur
	

	public Personne() {}
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.setAge(age);
	}
	
	String getInfo() {
		return this.nom + " " + this.prenom + " " + this.age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if ((age >= 0 && age <= 120) && age > this.age) {
			this.age = age;
			this.status = this.age >= 18 ? "MAJEUR" : "MINEUR";
		}
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", status=" + status + "]";
	}
}
