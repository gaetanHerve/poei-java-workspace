package projetGenerique;

public class Test {
	
	public static void main(String[] args) {
		test4();
	}
	
	static void test4() {
		Generic2<String, String> g1 = new Generic2<String, String>("10");
		Generic2<Personne, Personne> g2 = new Generic2<Personne, Personne>(new Personne("DUPOND", "arthur", 25));
		System.out.println(g1.getA());
		System.out.println(g2.getA());
	}
	
	static void test3() {
		Generic<Personne> g1 = new Generic<Personne>(new Personne("arthur"));
		System.out.println(g1.getA());
	}
	
	static void test2() {
		Personne p = new Personne("machin", "truc", 12);
		System.out.println(p);
	}
	
	
	static void test1() {
		Generic<String> g = new Generic<String>("10");
		Generic<Integer> g2 = new Generic<Integer>(10);
		Object res = g.getA();
		Object res2 = g2.getA();
		System.out.println(res);
		System.out.println(res2);
		
		g2.setA(14);
		
		System.out.println(g2.getA());
	}
	
}
