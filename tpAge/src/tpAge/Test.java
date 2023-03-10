package tpAge;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		tpAge();
	}
	
	static void tpAge() {
		Scanner clavierStr = new Scanner(System.in);
		Scanner clavierInt = new Scanner(System.in);
		
		System.out.println("nom ?");
		String nom = clavierStr.nextLine();
		
		System.out.println("age ?");
		int age = clavierInt.nextInt();
		
		String result = Info.getInfos(age, nom);
		
		System.out.println(result);
		clavierInt.close();
		clavierStr.close();
	}
}
