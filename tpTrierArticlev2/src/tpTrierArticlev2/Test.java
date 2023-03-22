package tpTrierArticlev2;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		testTpArticlev2();
	}
	
	static void testTpArticlev2() {
		Article[] tab = {
				new Article("xx", 45),
				new Article("dd", 17),
				new Article("bb", 12),
				new Article("bb", 49),
				new Article("aa", 72),
				new Article("aa", 32),
				new Article("aa", 23)
			};
		
		// on clone le tableau pour pouvoir le réutiliser non trié ensuite
		Article[] tab2 = tab.clone();
		
		System.out.println("-----TABLEAU DE DEPART-----");
		affiche(tab);
		
		System.out.println("-----TABLEAU TRIE PAR PRIX-----");
		Arrays.sort(tab, new ComparePrix());
		affiche(tab);
		
		System.out.println("-----TABLEAU TRIE PAR MARQUE-----");
		Arrays.sort(tab, new CompareMarque());
		affiche(tab);
		
		System.out.println("-----TABLEAU DE DEPART-----");
		affiche(tab2);
		
		System.out.println("-----TABLEAU TRIE PAR MARQUE PUIS PRIX -----");
		Arrays.sort(tab2, new CompareMarquePrix());
		affiche(tab2);
	}
	
	static void affiche(Article[] tab) {
		for (Article i : tab) {
			System.out.println(i);
		}
		System.out.println();
	}

}
