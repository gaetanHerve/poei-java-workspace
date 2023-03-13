package projetPersonnev4;

public class Test {

	public static void main(String[] args) {
		test1();

	}
	
	public static void test1() {
		Personne p = new Personne("aa", "bb", 12);
		p.setAge(20);
		System.out.println(p);
		System.out.println(p.getNom());
	}

}
