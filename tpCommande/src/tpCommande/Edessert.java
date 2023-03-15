package tpCommande;

public enum Edessert {
	sans("sans", 0.0),
	moussechoco("Mousse au chocolat", 5.0),
	saladedefruits("Salade de fruits", 4.0);
	
	private String nom;
	private Double prix;
	
	private Edessert() {}
	
	private Edessert(String nom, Double prix) {
		this.nom = nom;
		this.prix = prix;
	}
	
	public Double getPrix() {
		return prix;
	}
	
	public String toString() {
		return "Dessert " + nom + ", " + prix + " euros";
	}
}
