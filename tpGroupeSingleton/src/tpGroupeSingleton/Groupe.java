package tpGroupeSingleton;

public class Groupe {
	private static Groupe instance;
	private String nom;
	private Personne[] personnes = new Personne[10];
	
	private Groupe() {}

	private Groupe(String nom) {
		this.nom = nom;
	}
	
	public Personne[] getPersonnes() {
		return personnes;
	}
	
	public static Groupe getInstance() {
		if (instance == null) {
			instance = new Groupe();
		}
		return instance;
	}
	
	public static Groupe getInstance(String nom) {
		if (instance == null) {
			instance = new Groupe(nom);
		}
		return instance;
	}
	
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
