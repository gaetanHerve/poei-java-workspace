package projetCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Test {
	
	public static void main(String[] args) {
		test7();
	}
	
	static void test7() {
		
		HashMap<Personne, String> dico = new HashMap<Personne, String>();
		dico.put(new Personne("DUPOND", "D", 10), "75012");
		dico.put(new Personne("DUPONT", "T", 10), "13245");
		dico.put(new Personne("DUPONG", "G", 10), "99999");
		
		// Grace à la méthode Personne.equals(), on matche la clé juste grâce au(x) paramètres choisis dans equals 
		Personne p = new Personne("DUPONT");
		String cp = dico.get(p);
		System.out.println(cp);
	}
	
	
	static void test6() {
		Scanner clavier =  new Scanner(System.in);
		
		HashMap<String, String> dico = new HashMap<String, String>();
		dico.put("java", "c'est un langage objet");
		dico.put("C#", "c'est un langage objet");
		dico.put("JVM", "Java Virtual Machine");
		dico.put("jit compiler", "just in time!");
		dico.put("js", "c'est un langage web");
		Set<String> clesDico = dico.keySet();
		
		System.out.println("Choisir depuis la liste:");
		System.out.println(clesDico);
		String choix = clavier.nextLine();
		
		System.out.println("Réponse:");
		System.out.println(dico.get(choix));
		clavier.close();
	}
	
	static void test5() {
		HashMap<String, String> dico = new HashMap<String, String>();
		dico.put("java", "c'est un langage objet");
		dico.put("java", "c'est un langage objet2");
		dico.put("C#", "c'est un langage objet");
		dico.put("JVM", "Java Virtual Machine");
		dico.put("jit compiler", "just in time!");
		dico.put("js", "c'est un langage web");
		System.out.println(dico);
		System.out.println("-------------");
		System.out.println(dico.get("java"));
		System.out.println("-------------");
		
		Set<String> clesDico = dico.keySet();
		System.out.println(clesDico);
		
		
		System.out.println("-------------");
		Collection<String> valeursDico = dico.values();
		System.out.println(clesDico);
		
	}
	
	static void test4( ) {
		LinkedList<Personne> liste = new LinkedList<Personne>();
		liste.add(new Personne("DUPOND", "avec un D", 54));
		liste.add(new Personne("DUPONT", "avec un T", 54));
		liste.add(new Personne("DUPONG", "avec un G", 54));
		
		for (Personne personne : liste) {
			System.out.println(personne);
		}
		
		System.out.println("---------");
		Personne p = liste.poll();
		System.out.println("personne sortie " + p);
		
		System.out.println("---------");
		for (Personne personne : liste) {
			System.out.println(personne);
		}
		
		System.out.println("---------");
		Personne p2 = liste.peek();
		System.out.println("prochaine personne à sortir " + p2);
		
		System.out.println("---------");
		for (Personne personne : liste) {
			System.out.println(personne);
		}
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
