package projetEquals;

import java.util.Objects;

public class Personne {
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
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//        return this.nom.equals(((Personne)obj).nom);
//    }
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, nom, prenom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		return age == other.age && Objects.equals(nom, other.nom) && Objects.equals(prenom, other.prenom);
	}
	
}
