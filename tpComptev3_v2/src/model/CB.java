package model;

public enum CB {
	visa(5), mc(10), amex(15);
	
	private int prix;
	
	private CB(int prix) {
		this.prix = prix;
	}

	public int getPrix() {
		return prix;
	}
	
}
