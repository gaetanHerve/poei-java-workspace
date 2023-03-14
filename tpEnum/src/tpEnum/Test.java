package tpEnum;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		testTPEnum();
	}
	
	static void testTPEnum() {
		Plat[] carte = Plat.values();
		
		System.out.println("\nChoisir une pizza de la carte:");
		for (Plat p : carte)
			System.out.print(p.name() + "\t");
		
		System.out.println();
		
		Scanner clavier = new Scanner(System.in);
		String saisie = clavier.nextLine();
		
		Plat result = Plat.valueOf(saisie.toLowerCase());
		System.out.println("réponse: " + result);
		
		clavier.close();
	}

}
