package tpCentraliseur;

public class Test {

	public static void main(String[] args) {
		testTpCentraliseur();
	}
	
	static void testTpCentraliseur() {
		Centraliseur centraliseur = Centraliseur.getInstance();
		Poste p1 = new Poste("poste1", centraliseur);
		
		p1.print("TEST");
		
	}

}
