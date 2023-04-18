package model;

public class Article {
	private int ref;
	private String marque;
	private int prix;
	private String couleur;
	
	public Article() {
		super();
	}

	public Article(int ref, String marque, int prix, String couleur) {
		super();
		this.ref = ref;
		this.marque = marque;
		this.prix = prix;
		this.couleur = couleur;
		
	}
	
	public boolean isCher() {
		return this.prix > 100;
	}
	
	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return "Article [ref=" + ref + ", marque=" + marque + ", prix=" + prix + ", couleur=" + couleur + "]";
	}
	
	

}
