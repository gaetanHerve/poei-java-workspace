package tpCalculException;

public class NegatifException extends Exception {
	private static final long serialVersionUID = -3927759730108674978L;
	private double negativeNb;
	
	public NegatifException(double negativeNb) {
		super("Les 2 nombres doivent être positifs.");
		this.negativeNb = negativeNb;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + ": " + getMessage() + " Or vous avez saisi " + negativeNb;
	}
}
