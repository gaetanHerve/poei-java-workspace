package projet1;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		testAffiche();
	}
	
	static void testAffiche() {
		affiche();
		affiche("Tout le monde");
	}
	
	static void affiche(String str) {
		System.out.println("hello " + str);
	}
	
	static void affiche() {
		System.out.println("hello à toustes");
	}
	
	static void testAdd() {
		int x = add(10, 20);
		System.out.println(x);
		System.out.println(add(10, 20));
	}
	
	static int add(int a, int b) {
		return a + b;
	}
	
	static void testSwap() {
		int nb1 = 10;
		int nb2 = 20;
		System.out.println(nb1 + " " + nb2);
		swap(nb1, nb2);
		System.out.println(nb1 + " " + nb2);
	}
	
	static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}
	
	static void testSomme() {
		somme(1, 3);
		somme(10, 20);
	}
	
	static void somme(int nb1, int nb2) {
		int res = nb1 + nb2;
		System.out.println(res);
	}
	
	static void testPrintInfo() {
		String nom = "Toto";
		String prenom = "Titi";
		int age = 56;
		printInfo(nom, prenom, age);
	}
	
	static void printInfo(String nom, String prenom, int age) {
		System.out.println("coucou " + nom + " " + prenom + " " + age);
	}
	
	static void testPrint() {
		String nom = "Yasmine";
		print(nom);
		nom = "Corentin";
		print(nom);
		nom = "Chlo�";
		print(nom);
	}
	
	static void print(String str) {
		System.out.println("coucou " + str);
	}
	
	
	static void testRandom() {
		Random r = new Random();
		int nb = r.nextInt(10);
		System.out.println(nb);
	}
	
	static void testWhile() {
		int s = 0;
		int i = 0;
		do  {
			s += i;
			i++;
		} while (i < 10);
		System.out.println("Somme = " + s);
	}
	
	static void testDoWhile() {
		int s = 0;
		int i = 0;
		while (i < 10) {
			s += i;
			i++;
		}
		System.out.println("Somme = " + s);
	}
	
	static void testForv3() {
		for (int i=0; i < 10; i++) {
			if (i == 5)
				continue;
			System.out.println("i: " + i);
		}
		
	}
	
	static void testForv2() {
		int x = 10;
		for (int i=0; i < 10; i++) {
			x--;
			if (x == 5)
				break;
		}
		System.out.println("x: " + x);
	}
	
	static void testForv1() {
		Scanner clavier = new Scanner(System.in);
		
		int nb =  clavier.nextInt();
		
		for (int i=0; i < nb; i++) {
			System.out.println("coucou " + (i+1));
		}
		System.out.println("� bient�t");
		
		clavier.close();
	}
	
	static void testSwitch() {
		System.out.println("Donner un nombre");
		Scanner clavier = new Scanner(System.in);
		
		int nb = clavier.nextInt();
		String result = "";
		
		switch (nb) {
		case 1:
			result = "Lundi";
			result += "\nD�but de semaine";
			break;
		case 2:
			result = "Mardi";
			break;
		case 3:
			result = "Mercredi";
			break;
		case 4:
			result = "Jeudi";
			break;
		case 5:
			result = "Vendredi";
			break;
		case 6:
			result = "fin de semaine";
		case 7:
			result += result == "" ? "WE" : "\nWE";
			break;
		default:
			result = "Erreur de saisie";
			break;
		}
		
		System.out.println(result);
		clavier.close();
	}
	
	static void testTernairev1() {
		int a = 10;
		int b = 10;
		String result = (a == b) ? "OK" : "KO";
		System.out.println(result);
	}
	
	static void testIfv6() {
		String str1 = "toto";
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("str2?");
		String str2 = clavier.nextLine();
		
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("OK");
		} else {
			System.out.println("KO");
		}
		
		clavier .close();
	}
	
	
	static void testIfv5() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("a?");
		int a = clavier.nextInt();
		System.out.println("b?");
		int b = clavier.nextInt();
		System.out.println("c?");
		int c = clavier.nextInt();
		
		
		String maxValue;
		if (a > b && a > c)
			maxValue = "a";
		else if (b > c)
			maxValue = "b";
		else
			maxValue = "c";
		
		
		
		System.out.println("valeur max : " + maxValue);
		clavier.close();
	}
	
	
	static void testIfv4() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("a?");
		int a = clavier.nextInt();
		System.out.println("b?");
		int b = clavier.nextInt();
		
		if (a < b || a > b)
			System.out.println("a et b diff�rents");
		else
			System.out.println("a et b �gaux");
		clavier.close();
	}
	
	static void testIfv1() {
		int a = 10;
		int b = 10;
		if (a == b) System.out.println("OK");
		else System.out.println("KO");
		System.out.println("A bient�t");
	}
	
	static void testIfv2() {
		int a = 10;
		int b = 10;
		if (a == b) {
			System.out.println("OK");
			System.out.println("test r�ussi");
		}
		else {
			System.out.println("KO");
			System.out.println("�chec test");
		}
		System.out.println("A bient�t");
	}
	
	static void testIfv3() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("a?");
		int a = clavier.nextInt();
		System.out.println("b?");
		int b = clavier.nextInt();
		
		if (a < b)
			System.out.println("a < b");
		else if (a > b)
			System.out.println("a > b");
		else
			System.out.println("a et b �gaux");
		clavier.close();
	}
	
	
	
	
	
	

	static void test1() {
		double x = Math.pow(2, 3);
		System.out.println(x);
		int maxInt = Integer.MAX_VALUE;
		long maxLong = Long.MAX_VALUE;
		System.out.println("maxInt: " + maxInt);
		System.out.println("maxLong: " + maxLong);
		// Array l1;
		// ArrayList l2;
	}

	static void test2() {
		String str = "test";
		int a  = 10;
		double b = 10.5;
		boolean c = true;
		char d = 'a';
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("Je suis la classe " + str);
	}
	
	static void test4() {
		String str1 = "bonjour";
		String str2 = "toto";
		String str3 = str1 + "\n" + str2;
		System.out.println(str3);
	}
	
	static void test5() {
		String str = "bonjour";
		str += " toto";
		System.out.println(str);
	}
	
	static void test6 () {
		System.out.println("nom?");
		Scanner clavier = new Scanner(System.in);
		String nom = clavier.nextLine();
		System.out.println("coucou " + nom);
		clavier.close();
	}
	
	static void test7() {
		System.out.println("age ?");
		Scanner clavier = new Scanner(System.in);
		double age = clavier.nextDouble();
		System.out.println("age: " + age);
		clavier.close();
	}
	
	static void test10() {
		int a = 5;
		int b;
		b = a++;
		System.out.println(a);
		System.out.println(b);
		
		b = ++a;
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
