package projetPersonnev6;

public class Groupe {
	private String nom;
	private Personne[] personnes = new Personne[20];
	
	public Groupe() {}

	public Groupe(String nom) {
		this.nom = nom;
	}
	
	public Personne[] getPersonnes() {
		return personnes;
	}
	
//	public Personne getPersonneById(int id) {
//		Personne result = null;
//		for (Personne p : personnes) {
//			if (p != null && p.getId() == id) {
//				result = p;
//				break;
//			}
//		}
//		return result;
//	}
	
	public String getPersonneByNom(String nom) {
		String result = "";
		for (Personne p : personnes) {
			if (p != null && p.getNom().equalsIgnoreCase(nom)) {
				result += p.toString() + "\n";
			}
		}
		return result;
	}
	
	public String getPersonneByAge(int ageMin, int ageMax) {
		String result = "";
		for (Personne p : personnes) {
			if (p != null) {
				int age = p.getAge();
				if (age >= ageMin && age <= ageMax) {
					result += p.toString() + "\n";
				}
			}
		}
		return result;
	}
	
	public int getCount() {
		int count = 0;
		for (Personne p : personnes)
			if (p != null) count++;
		return count;
	}
	
	public boolean remove(int id) {
		boolean result = false;
		for (int i = 0; i < this.personnes.length; i++) {
			if (personnes[i] != null && personnes[i].getId() == id) {
				personnes[i] = null;
				result = true;
				break;
			}
		}
		return result;
	}
	
	public boolean add(Personne personne) {
		boolean result = false;
		for (int i = 0; i < this.personnes.length; i++) {
			if (personnes[i] == null) {
				personnes[i] = personne;
				result = true;
				break;
			}
		}
		return result;
	}

	@Override
	public String toString() {
		String result = "NOM " + nom.toUpperCase() + "\n";
		for (Personne p : personnes) {
			if (p != null)
				result += p +"\n";
		}
		return result;
	}
	
}
