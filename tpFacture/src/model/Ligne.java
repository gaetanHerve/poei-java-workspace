package model;

public class Ligne {
	private Article article;
	private int quantite;
	private double prixLigne;
	
	public Ligne(Article article, int quantite) {
		this.article = article;
		this.quantite = quantite;
		this.prixLigne = article.getPrix() * quantite;
	}
	
	public double getPrixLigne() {
		return prixLigne;
	}

	@Override
	public String toString() {
		return "Quantité: " + quantite + " - " + article + " - " + prixLigne + "eur(s)";
	}
	
}
