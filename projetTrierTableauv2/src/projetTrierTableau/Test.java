package projetTrierTableau;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		test1();
	}
	
	static void test1() {
		Personne[] tab = {
				new Personne("aa", "ff", 87),
				new Personne("gg", "bb", 27),
				new Personne("dd", "zz", 67),
				new Personne("dd", "bb", 47),
		};
		System.out.println("-----TABLEAU INITIAL-----");
		affiche(tab);
		
		System.out.println("-----TABLEAU TRIE PAR NOM-----");
		Arrays.sort(tab, new CompareNom());
		affiche(tab);
		
		System.out.println("-----TABLEAU TRIE PAR PRENOM-----");
		Arrays.sort(tab, new CompareNom());
		affiche(tab);
		
	}
	
	static void affiche(Personne[] tab) {
		for (Personne i : tab) {
			System.out.println(i);
		}
		System.out.println();
	}

}
