package projetPersonnev2;

public class Test {

	public static void main(String[] args) {
		test5();
	}
	
	static void printPersonnes(Personne[] tab) {
		for (Personne p : tab) {
			System.out.println(p.getInfo());
		}
	}
	
	static void test5() {
		Personne p1 = new Personne();
		Personne p2 = new Personne("toto", "titi");
		Personne p3 = new Personne("tata", "tutu", 45);
		p2.age= 15;
		p3.age= 20;
		
		printPersonnes(new Personne[] {p1, p2, p3});
	}
	
	static void test4() {
		Personne[] tab = {
				new Personne("toto", "titi", 35),
				new Personne("tata", "tutu", 42),
				new Personne("toutou", "tantan", 23)
		};
		
		printPersonnes(tab);
		
		Personne x= tab[1];
		System.out.println(x.getInfo());
	}
	
	
	static void test3() {
		Personne p = new Personne("toto", "titi", 35);
		System.out.println(p.getInfo());
		
		new Personne("toto", "titi", 35);
	}
	
	static void test1() {
		Personne p = new Personne();
		System.out.println(p.getInfo());
	}
	
	static void test2() {
		Personne p = new Personne();
		Personne p2 = new Personne("testNom", "testPrenom");
		Personne p3 = new Personne("testNom", "testPrenom", 45);
		
		System.out.println(p.getInfo());
		System.out.println(p2.getInfo());
		System.out.println(p3.getInfo());
	}

}
