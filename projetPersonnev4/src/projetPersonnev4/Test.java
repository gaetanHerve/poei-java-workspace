package projetPersonnev4;

public class Test {

	public static void main(String[] args) {
		System.out.println(new Personne("aa", "bb", 36));

	}
	
	public static void test1() {
		Personne p = new Personne("aa", "bb", 36);
		p.setAge(20);
		System.out.println(p);
		System.err.println(p.getNom());
	}

}
