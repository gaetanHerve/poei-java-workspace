package projetGenerique;

public class Personne {
	private static Object nom = "DUPOND";
	private Object prenom;
	private Object age;

	
	public Personne() {}
	
	public Personne(Object prenom) {
		this.prenom = prenom;
	}
	
	public Personne(Object nom, Object prenom, Object age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public static void setNom(Object nom) {
		Personne.nom = nom;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
}
