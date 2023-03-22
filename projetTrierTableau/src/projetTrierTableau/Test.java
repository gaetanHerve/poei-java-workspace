package projetTrierTableau;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		testPersonne();
		// testString();
		// testInt();
	}
	
	static void testPersonne() {
		Personne[] tab = {new Personne("dd", "ee", 5), new Personne("aa", "bb", 12), new Personne("xx", "zz", 45)};
		affiche(tab);
		Arrays.sort(tab);
		affiche(tab);
	}
	
	
	static void testString() {
		String[] tab = {"Salut", "toto", "ça va", "?"};
		affiche(tab);
		Arrays.sort(tab);
		affiche(tab);
	}
	
	static void testInt() {
		int[] tab = {20, 10, 50, 30, 40};
		affiche(tab);
		Arrays.sort(tab);
		affiche(tab);
	}
	
	static void affiche(int[] tab) {
		for (int i : tab) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	
	static void affiche(String[] tab) {
		for (String i : tab) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	
	static void affiche(Personne[] tab) {
		for (Personne i : tab) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}

}
