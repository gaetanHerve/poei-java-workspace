package model;

public class Article {
	private String marque;
	private double prix;
	
	public Article() {}
	
	public Article(String marque, double prix) {
		this.marque = marque;
		this.prix = prix;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Article [marque=" + marque + ", prix=" + prix + "]";
	}
}
