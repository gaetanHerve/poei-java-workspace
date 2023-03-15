package tpUsePersonne;

import model.Personne;

public class Test {
	public static void main(String[] args) {
		testTpPersonne();
	}
	
	static void testTpPersonne() {
		Personne p = new Personne("aa", "bb", 67);
		System.out.println(p);
	}
}
