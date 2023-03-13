package projetPersonnev4;

public class Personne {
	private String nom;
	private String prenom;
	private int age;
	private static final int ageMin = 0;
	private static final int ageMax = 120;
	private static final int ageMajeur = 18;
	
	private boolean isMajeur;
	
	
	public Personne() {}

	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.setAge(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > ageMin && age <= ageMax && age > this.age) {
			this.age = age;
			this.isMajeur = this.age >= ageMajeur;
		}
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	@Override
	public String toString() {
		String str = "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
		str += isMajeur ? " MAJEUR" : " MINEUR";
		return str;
	}
	
}
