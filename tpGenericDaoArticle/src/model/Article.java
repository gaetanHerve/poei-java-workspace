package model;

public class Article {
	
	private int ref;
	private String marque;
	private int prix;
	
	public Article() {
		
	}
	
	public Article(int ref) {
		this.ref = ref;
	}
	
	public Article(int ref, String marque, int prix) {
		this.ref = ref;
		this.marque = marque;
		this.prix = prix;
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

	@Override
	public String toString() {
		return "Article [ref=" + ref + ", marque=" + marque + ", prix=" + prix + "]";
	}
	
}
