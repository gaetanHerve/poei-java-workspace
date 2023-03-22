package projetCollections;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		test3();
	}
	
	static void test3( ) {
		ArrayList<Personne> liste = new ArrayList<Personne>(10);
		liste.add(new Personne("DUPOND", "avec un D", 54));
		liste.add(new Personne("DUPONT", "avec un T", 54));
		liste.add(new Personne("DUPONG", "avec un G", 54));
		System.out.println(liste);
		//liste.clear();
		Personne testGet = liste.get(0);
		System.out.println(testGet);
		liste.add(null);
		System.out.println(liste);
	}
	
	static void test2( ) {
		ArrayList<Integer> liste = new ArrayList<Integer>(10);
		liste.add(5);
		liste.add(50);
		liste.add(878);
		System.out.println(liste);
		//liste.clear();
		int testGet = liste.get(0);
		System.out.println(testGet);
		liste.add(null);
		System.out.println(liste);
	}
	
	static void test1() {
		ArrayList<Integer> liste = new ArrayList<Integer>();
		
		liste.add(1);
		liste.add(2);
		liste.add(3);
		liste.add(4);
		
		for (int i: liste) {
			System.out.println(i);
		}
	}
	
}
