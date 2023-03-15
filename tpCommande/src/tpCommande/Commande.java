package tpCommande;

public class Commande {
	private String client;
	private Eboisson boisson;
	private Eplat plat;
	private Edessert dessert;
	
	public Commande() {}

	public Commande(String client) {
		this.client = client;
	}

	public Commande(String client, Eboisson boisson, Eplat plat, Edessert dessert) {
		this.client = client;
		this.boisson = boisson;
		this.plat = plat;
		this.dessert = dessert;
	}

	public Double getPrixTotal() {
		Double total = 0.0;
		total += boisson.getPrix();
		total += plat.getPrix();
		total += dessert.getPrix();
		return total;
	}

	@Override
	public String toString() {
		String str = "Commande [client=" + client + ", boisson=" + boisson + ", plat=" + plat + ", dessert=" + dessert + "]";
		str += "\nTotal: " + getPrixTotal();
		return str;
	}
	
}
