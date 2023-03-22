package tpGeneric;

public class Test {
	public static void main(String[] args) {
		testGeneric();
	}
	
	static void testGeneric() {
		System.out.println("-----TEST STRINGS-----");
		Generic<String> g1 = new Generic<String>(3);
		g1.add("Salut");
		g1.add(", ça");
		g1.add(" va ?");
		System.out.println(g1);
		
		System.out.println("-----TEST PERSONNES-----");
		Generic<Personne> g2 = new Generic<Personne>(3);
		g2.add(new Personne("DUPOND", "avec un D", 35));
		g2.add(new Personne("DUPONT", "avec un T", 36));
		g2.add(new Personne("DUPONG", "avec un G", 37));
		System.out.println(g2);
		
		System.out.println("-----TEST INTEGERS-----");
		Generic<Integer> g3 = new Generic<Integer>(3);
		g3.add(1);
		g3.add(2);
		g3.add(3);
		System.out.println(g3);
	}
}
