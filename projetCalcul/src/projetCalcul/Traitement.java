package projetCalcul;

import java.util.Scanner;

public class Traitement {
	static void tpCalcul() {		
		Scanner clavierDbl = new Scanner(System.in);
		Scanner clavierStr = new Scanner(System.in);
		
		System.out.println("veuillez saisir le 1er opérande : ");
		double a = clavierDbl.nextDouble();
		System.out.println("veuillez saisir le 2nd opérande : ");
		double b = clavierDbl.nextDouble();
		System.out.println("veuillez saisir l'opérateur (+, -, *, /) : ");
		String operator = clavierStr.nextLine();
		
		System.out.println(calcul(a, b, operator));
		
		clavierStr.close();
		clavierDbl.close();
	}
	
	static double calcul(double a, double b, String operator) {
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
				System.out.println("l'opérateur sélectionné n'est pas valide");
				break;
		}
		return result;
	}
	
	static double add(double a, double b) {
		return a + b;
	}
	
	static double remove(double a, double b) {
		return a - b;
	}
	
	static double mult(double a, double b) {
		return a * b;
	}
	
	static double divide(double a, double b) {
		double result = 0.0;
		if (b != 0) {
			result = a / b;
		} else {
			System.out.println("le 2nd operande doit être différent de zéro dans le cas d'une division");
		}
		return result;
	}
}
