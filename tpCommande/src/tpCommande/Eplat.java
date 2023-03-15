package tpCommande;

public enum Eplat {
	sans("sans", 0.0),
	dahllentillescorail("Dahl de lentilles corail", 12.0),
	feuilleteaufromage("Feuilleté au fromage", 10.0);
	
	private String nom;
	private Double prix;
	
	private Eplat() {}
	
	private Eplat(String nom, Double prix) {
		this.nom = nom;
		this.prix = prix;
	}
	
	public Double getPrix() {
		return prix;
	}

	public String toString() {
		return "Plat " + nom + ", " + prix + " euros";
	}
}
