package tpVille;

public class Test {

	public static void main(String[] args) {
		testConstructors();
		System.out.println("--------------------------");
		testTableauVillesAnon();
	}
	
	static void testConstructors() {
		Ville v1 = new Ville();
		Ville v2 = new Ville("Rennes", "France", 0.222);
		
		v1.nom = "Toulouse";
		v1.pays = "France";
		v1.nbHbts = 0.498;
		
		System.out.println(v1.getInfos());
		System.out.println(v2.getInfos());
	}
	
	static void testTableauVillesAnon() {
		Ville[] villes = {
				new Ville("Toulouse", "France", 0.498),
				new Ville("Marseille", "France", 0.87),
				new Ville("Rennes", "France", 0.222)
			};
		printVilles(villes);
	}
	
	static void printVilles(Ville[] tab) {
		for (Ville e : tab) {
			System.out.println(e.getInfos());
		}
	}
	
	static void tabLongVersion() {
		Ville v1 = new Ville();
		Ville v2 = new Ville();
		Ville v3 = new Ville();
		
		v1.nom = "Rennes";
		v1.pays = "France";
		v1.nbHbts = 0.222;
		
		v2.nom = "Toulouse";
		v2.pays = "France";
		v2.nbHbts = 0.498;
		
		v3.nom = "Marseille";
		v3.pays = "France";
		v3.nbHbts = 0.87;
		
		Ville[] tab = new Ville[3];
		tab[0] = v1;
		tab[1] = v2;
		tab[2] = v3;
		
		printVilles(tab);
	}
	
	static void tabShortVersion() {
		Ville v1 = new Ville();
		Ville v2 = new Ville();
		Ville v3 = new Ville();
		
		v1.nom = "Rennes";
		v1.pays = "France";
		v1.nbHbts = 0.222;
		
		v2.nom = "Toulouse";
		v2.pays = "France";
		v2.nbHbts = 0.498;
		
		v3.nom = "Marseille";
		v3.pays = "France";
		v3.nbHbts = 0.87;
		
		Ville[] tab = {v1, v2, v3};
		
		printVilles(tab);
	}
	
	static void test1() {
		Ville v = new Ville();
		v.nom = "Rennes";
		v.pays = "France";
		v.nbHbts = 0.222;
		System.out.println(v.getInfos());
	}
	
	static void test2() {
		Ville v1 = new Ville();
		Ville v2 = new Ville();
		Ville v3 = new Ville();
		
		v1.nom = "Rennes";
		v1.pays = "France";
		v1.nbHbts = 0.222;
		
		v2.nom = "Toulouse";
		v2.pays = "France";
		v2.nbHbts = 0.498;
		
		v3.nom = "Marseille";
		v3.pays = "France";
		v3.nbHbts = 0.87;
		
		System.out.println(v1.getInfos());
		System.out.println(v2.getInfos());
		System.out.println(v3.getInfos());
	}

}
