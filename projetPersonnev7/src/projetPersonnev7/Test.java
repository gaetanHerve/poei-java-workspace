package projetPersonnev7;

public class Test {

	public static void main(String[] args) {
		test2();
	}
	
	static void test2() {
		Personne p1 = new Personne("Jean");
		Personne p2 = new Personne("Jacques");
		System.out.println(p1);
		System.out.println(p2);
		p1.setAge(34);
		p2.setAge(35);
		
		Personne.setNom("DURAND");
		
		System.out.println(p1);
		System.out.println(p2);
		
		new Personne("P");
		System.out.println(Personne.getCount());
	}
	
	static void test1() {
		Traitement.m1();
		Traitement t = new Traitement();
		t.m3();
	}

}
