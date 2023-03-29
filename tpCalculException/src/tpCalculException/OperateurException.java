package tpCalculException;

public class OperateurException extends Exception {
	private static final long serialVersionUID = -2046088407615059763L;
	private String saisie;
	
	public OperateurException(String saisie) {
		super("problème avec l'opérateur");
		this.saisie = saisie;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + ": " + this.getMessage() + "\n Vous avez saisi : " + saisie;
	}
	
}
