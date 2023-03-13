package projetPersonnev3;

public class Test {

	public static void main(String[] args) {
		test4();
	}
	
	static void test1() {
		Personne p = new Personne("aaa", "bbb", 10);
		System.out.println(p);
		p.setAge(20);
		System.out.println(p);
		p.setNom("Durand");
		System.out.println(p);
	}
	
	static void test4() {
		Personne p = new Personne("aaa", "bbb", 10);
		System.out.println(p);
		p.setAge(20);
		System.out.println(p);
		p.setNom("Durand");
		System.out.println(p);
	}

}
