package projetEquals;

public class Test {
	
	public static void main(String[] args) {
		test1();
	}
	
	static void test1() {
		Personne p1 = new Personne("DUPOND", "avec un D", 65);
		Personne p2 = new Personne("DUPOND", "avec un D", 65);
		Personne p3 = p2;
		
		if (p1.equals(p2)) {
			System.out.println("OK");
		} else {
			System.out.println("KO");
		}
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p3);
		
	}
	
}
