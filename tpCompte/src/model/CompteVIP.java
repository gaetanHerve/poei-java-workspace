package model;

public class CompteVIP extends CompteSimple {
	// pas de commissions / découverts autorisés / sans CB
	
	public CompteVIP(String titulaire) {
		super(titulaire);
	}
	
	public CompteVIP(String titulaire, int solde) {
		super(titulaire, solde);
	}
	
}
