package tpEnum;

public enum Plat {
	napolitaine(8),
	Reine(10),
	Complete(12),
	indienne(13);
	
	private int prix;
	
	private Plat() {}
	
	private Plat(int prix) {
		this.prix = prix;
	}
	
	public int getPrix() {
		return prix;
	}
	
	public String toString() {
		return "Pizza " + this.name() + ", " + this.prix + " euros";
	}
}
