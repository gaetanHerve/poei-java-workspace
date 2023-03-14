package model;

public class Compte {
	private String numero;
	private Double solde;
	private String banque;
	
	public Compte() {}

	public Compte(String numero, Double solde, String banque) {
		this.numero = numero;
		this.solde = solde;
		this.banque = banque;
	}
	
	public String getBanque() {
		return banque;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + ", banque=" + banque + "]";
	}
	
}
