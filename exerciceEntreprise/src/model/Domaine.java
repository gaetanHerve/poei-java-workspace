package model;

public enum Domaine {
	alimentaire(7), artisanat(15), biologie(12), informatique(21), BTP(18), publique(5);
	
	private int taxe;
	
	private Domaine(int taxe) {
		this.taxe = taxe;
	}

	public int getTaxe() {
		return taxe;
	}

	public void setTaxe(int taxe) {
		this.taxe = taxe;
	}
	
}
