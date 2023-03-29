package tpCalculException;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		testTpCalcul();
	}
	
	static void testTpCalcul() {		
		Scanner clavierDbl = new Scanner(System.in);
		Scanner clavierStr = new Scanner(System.in);
		
		System.out.println("veuillez saisir le 1er opérande : ");
		double a = clavierDbl.nextDouble();
		System.out.println("veuillez saisir le 2nd opérande : ");
		double b = clavierDbl.nextDouble();
		System.out.println("veuillez saisir l'opérateur (+, -, *, /) : ");
		String operator = clavierStr.nextLine();
		
		try {
			System.out.println(Traitement.calcul(a, b, operator));
		} catch (OperateurException | NegatifException e) {
			System.out.println(e);
		} catch (ArithmeticException e){
			System.out.println(e.getMessage());
		}
		
		clavierStr.close();
		clavierDbl.close();	
	}

}
