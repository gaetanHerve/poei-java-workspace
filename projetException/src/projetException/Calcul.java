package projetException;

public class Calcul {
	
	static int div(int a, int b) throws NumeratorException {
		if (b == 0) {
			throw new ArithmeticException("Attention à la division par zéro");
		} else if (a == 0){
			throw new NumeratorException("Attention au numérateur 0", "voici la solution");
		}
		return a / b;
	}
	
}
