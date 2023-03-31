package user;

import model.*;

public class Test {
	
	public static void main(String[] args) {
		test1TpFg();
		test2TpFg();
	}
	
	static void test1TpFg() {
		System.out.println("\n----- TEST 1 -----");
		
		Rectangle rect = new Rectangle(5, 7);
		Carre carre = new Carre(10);
		Cercle cercle = new Cercle(5);
		
		System.out.println(rect);
		System.out.println(carre);
		System.out.println(cercle);
	}
	
	static void test2TpFg() {
		System.out.println("\n----- TEST 2 -----");
		
		FG[] formes = {
				new Rectangle(8, 3),
				new Carre(11),
				new Cercle(9)
			};
		for (FG forme : formes) {
			System.out.println(forme);
		}
	}

}
