package projetPersonnev1;

public class Test {

	public static void main(String[] args) {
		test9();
	}
	
	static void test9() {
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		Personne p3 = new Personne();
		
		p1.nom = "aa";
		p1.prenom = "bb";
		p1.age = 12;
		
		p2.nom = "cc";
		p2.prenom = "dd";
		p2.age = 24;
		
		p3.nom = "ee";
		p3.prenom = "ff";
		p3.age = 36;
		
		Personne[] tab = {p1, p2, p3};
		
		for (Personne p : tab) {
			System.out.println(p.getInfo());
		}
	}
	
	static void test8() {
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		Personne p3 = new Personne();
		
		p1.nom = "aa";
		p1.prenom = "bb";
		p1.age = 12;
		
		p2.nom = "cc";
		p2.prenom = "dd";
		p2.age = 24;
		
		p3.nom = "ee";
		p3.prenom = "ff";
		p3.age = 36;
		
		Personne[] tab = new Personne[3];
		tab[0] = p1;
		tab[1] = p2;
		tab[2] = p3;
		
		for (Personne p : tab) {
			System.out.println(p.getInfo());
		}
		
		System.out.println("---------------------------");
		
		tab[0].nom = "Durand";
		for (Personne p : tab) {
			System.out.println(p.getInfo());
		}
		
	}
	
	
	static void test6() {
		Personne p1 = new Personne();
		p1.nom = "aa";
		p1.prenom = "bb";
		p1.age = 12;
		
		Personne p2 = p1;
		
		p2.nom = "Durand";
		System.out.println(p1.getInfo());
		
		p1 = null;
		System.out.println(p2.getInfo());
		
		p1 = p2;
		System.out.println(p1.getInfo());
		
		p1 = null;
		p2 = null;
		// System.out.println(p1.getInfo());
		// System.out.println(p2.getInfo());
	}
	
	static void test5() {
		Personne p1 = new Personne();
		p1.nom = "aa";
		p1.prenom = "bb";
		p1.age = 12;
		
		System.out.println(p1.getInfo());
		
		p1 = null;
	}
	
	static void test4() {
		Personne p1 = new Personne();
		p1.nom = "aa";
		p1.prenom = "bb";
		p1.age = 12;
		Personne p2 = p1;
		
		System.out.println(p1.getInfo());
		System.out.println(p2.getInfo());
	}
	
	static void test3() {
		// Personne n'est pas nécessairement un type, ça peut aussi être une femme !
		Personne p = new Personne();
		p.nom = "aa";
		p.prenom = "bb";
		p.age = 12;
		System.out.println(p.getInfo());
		p = new Personne();
	}
	
	static void test2() {
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		
		p1.nom = "aa";
		p1.prenom = "bb";
		p1.age = 12;
		
		p2.nom = "cc";
		p2.prenom = "dd";
		p2.age = 24;
		
		System.out.println(p1.getInfo());
		System.out.println(p2.getInfo());
	}
	
	static void test1() {
		Personne p = new Personne();
		System.out.println(p.getInfo());
		p.nom = "aa";
		p.prenom = "bb";
		p.age = 12;
		System.out.println(p.getInfo());
	}

}
