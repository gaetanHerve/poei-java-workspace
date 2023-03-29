package model;

public class CompteSimple {
	private String titulaire;
	protected int solde;
	private static final int commission = 1;
	private static final int cadeau = 20;
	
	
	public CompteSimple(String titulaire) {
		this.titulaire = titulaire;
		cadeauArrivee();
	}
	
	public CompteSimple(String titulaire, int solde) {
		this.titulaire = titulaire;
		this.solde = solde;
		cadeauArrivee();
	}

	public boolean crediter(int somme) {
		boolean operationOk = false;
		if (authorizeOperation(somme, "crédit")) {
			this.solde += (somme - getCommission());
			operationOk = true;
		}
		return operationOk;
	}
	
	public boolean debiter(int somme) {
		boolean operationOk = false;
		if (authorizeOperation(somme, "débit")) {
			this.solde -= (somme + getCommission());
			operationOk = true;
		}
		return operationOk;
	}
	
	protected boolean authorizeOperation(int somme, String operationType) {
		boolean authorized = false;
		switch(operationType) {
			case "crédit":
				authorized = (somme > 0 && (this.solde + (somme - getCommission())) > 0);
				break;
			case "débit":
				authorized = (somme > 0 && (this.solde - (somme + getCommission())) > 0);
				break;
			default:
				break;
		}
		return authorized;
	}
	
	public boolean virement(int somme, CompteSimple destinataire) {
		boolean operationOk = false;
		if (this.authorizeOperation(somme, "débit") && destinataire.authorizeOperation(somme, "crédit")) {
			this.debiter(somme);
			destinataire.crediter(somme);
			operationOk = true;
		}
		return operationOk;
	}
	
	private void cadeauArrivee() {
		this.solde += cadeau;
	}

	public String getTitulaire() {
		return titulaire;
	}
	
	protected int getCommission() {
		return commission;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " titulaire=" + titulaire + ", solde=" + solde;
	}
	
}
