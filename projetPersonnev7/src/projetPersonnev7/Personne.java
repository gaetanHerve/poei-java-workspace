package projetPersonnev7;

public class Personne {
	private static String nom = "DUPOND";
	private String prenom;
	private int age;
	private static int count = 0;
	
	public static final int ageMin = 0;
	public static final int ageMax = 120;
	
	public Personne() {}
	
	public Personne(String prenom) {
		this.prenom = prenom;
		count++;
	}
	
	public void setAge(int age) {
		if (age > ageMin && age < ageMax) {
			this.age = age;
		}
	}
	
	public static int getCount() {
		return count;
	}

	public static void setNom(String nom) {
		Personne.nom = nom;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
}
