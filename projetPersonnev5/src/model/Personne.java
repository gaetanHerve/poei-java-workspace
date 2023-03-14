package model;

public class Personne {
	private String nom;
	private String prenom;
	private int age;
	
	private Adresse adresse;
	
	public Personne() {}

	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public Personne(String nom, String prenom, int age, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	@Override
	public String toString() {
		String result = "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
		if (adresse != null) {
			result += "\n" + adresse;
		}
		return result;
	}
		
}
