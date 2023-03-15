package tpCommande;

public class Test {

	public static void main(String[] args) {
		testTpCommande();
	}
	
	static void testTpCommande() {
		Commande commande = new Commande("DUPOND",Eboisson.eaupetillante, Eplat.dahllentillescorail, Edessert.moussechoco);
		System.out.println(commande);
	}

}
