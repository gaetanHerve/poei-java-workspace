package tpTrierArticle;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		testTpArticle();
	}
	
	static void testTpArticle() {
		Article[] tab = {
				new Article("xx", 45),
				new Article("dd", 17),
				new Article("bb", 12),
				new Article("bb", 49),
				new Article("aa", 72),
				new Article("aa", 32),
				new Article("aa", 23)
			};
		System.out.println("-----TABLEAU DE DEPART-----");
		affiche(tab);
		
		Arrays.sort(tab);
		
		System.out.println("-----TABLEAU TRIE-----");
		affiche(tab);
	}
	
	static void affiche(Article[] tab) {
		for (Article i : tab) {
			System.out.println(i);
		}
		System.out.println();
	}

}
