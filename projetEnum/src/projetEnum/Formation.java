package projetEnum;

public enum Formation {
	java(1000, "Paris"),
	cpp(100, "Nantes"),
	python(2000, "Rennes"),
	csharp();
	
	private int prix;
	private String lieu;
	
	private Formation() {}
	
	private Formation(int prix) {
		this.prix = prix;
	}
	
	private Formation(int prix, String lieu) {
		this.prix = prix;
		this.lieu = lieu;
	}
	
	public int getPrix() {
		return prix;
	}
	
	public String getLieu() {
		return lieu;
	}
	
	
	public String toString() {
		return "Formation " + this.name() + ", " + this.prix + " euros, " + this.lieu;
	}
}
