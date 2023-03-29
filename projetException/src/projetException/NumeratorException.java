package projetException;

public class NumeratorException extends Exception {
	private static final long serialVersionUID = -2046088407615059763L;
	private String solution;
	
	public NumeratorException(String message, String solution) {
		super(message);
		this.solution = solution;
	}
	
	public NumeratorException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " " + getMessage() + "\n" + solution;
	}
	
	
}
