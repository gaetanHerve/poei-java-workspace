package tpCalculException;

public class Traitement {
	
	static double calcul(double a, double b, String operator) throws OperateurException, NegatifException {
		double result = 0.0;

		switch(operator) {
			case "+":
				result = add(a, b);
				break;
			case "-":
				result = remove(a, b);
				break;
			case "*":
				result = mult(a, b);
				break;
			case "/":
				result = divide(a, b);
				break;
			default:
				throw new OperateurException(operator);
		}
		return result;
	}
	
	static void checkNegatives(double a, double b) throws NegatifException {
		if (a < 0) throw new NegatifException(a);
		if (b < 0) throw new NegatifException(b);
	}
	
	static double add(double a, double b) throws NegatifException {
		checkNegatives(a, b);
		return a + b;
	}

	static double remove(double a, double b) throws NegatifException {
		checkNegatives(a, b);
		return a - b;
	}

	static double mult(double a, double b) throws NegatifException {
		checkNegatives(a, b);
		return a * b;
	}

	static double divide(double a, double b) throws NegatifException {
		if (b == 0)
			throw new ArithmeticException("Attention! Le dénominateur doit être différent de zéro");
		checkNegatives(a, b);
		return a / b;
	}
	
}
