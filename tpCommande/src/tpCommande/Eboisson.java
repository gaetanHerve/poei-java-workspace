package tpCommande;

public enum Eboisson {
	sans("sans", 0.0),
	gingerbeer("Ginger beer", 1.5),
	eaupetillante("Eau pétillante", 1.2);
	
	private String nom;
	private Double prix;
	
	private Eboisson() {}
	
	private Eboisson(String nom, Double prix) {
		this.nom = nom;
		this.prix = prix;
	}
	
	public Double getPrix() {
		return prix;
	}
	
	public String toString() {
		return "Boisson " + nom + ", " + prix + " euros";
	}
}
