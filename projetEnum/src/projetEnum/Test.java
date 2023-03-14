package projetEnum;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		test4();
	}
	
	static void test4() {
		Formation[] tab = Formation.values();
		
		System.out.println("\nChoisir parmis la liste:");
		for (Formation f : tab)
			System.out.print(f.name() + "\t");
		
		System.out.println();
		
		Scanner clavier = new Scanner(System.in);
		String saisie = clavier.nextLine();
		
		Formation result = Formation.valueOf(saisie.toLowerCase());
		System.out.println("réponse: " + result);
	}
	
	static void test3() {
		Formation f = Formation.java;
		System.out.println(f);
		System.out.println(f.getPrix());
		System.out.println(f.getLieu());
	}
	
	static void test2() {
		System.out.println(Formation.java);
		System.out.println(Formation.java.getPrix());
		System.out.println(Formation.java.getLieu());
		
		System.out.println(Formation.csharp);
		System.out.println(Formation.csharp.getPrix());
	}
	
	static void test1() {
		System.out.println(Semaine.dimanche);
		System.out.println(Semaine.dimanche.ordinal());
		System.out.println(Semaine.dimanche.compareTo(Semaine.mardi));
		
		Semaine s = Semaine.samedi;
		System.out.println(s);
	}

}
