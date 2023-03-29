package projetException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		testDivv2();
	}
	
	static void testDivv2() {
		Scanner clavier = new Scanner(System.in);
		try {
			System.out.println("saisir nb1");
			int nb1 = clavier.nextInt();
			System.out.println("saisir nb2");
			int nb2 = clavier.nextInt();
			int resultat = Calcul.div(nb1, nb2);
			System.out.println("resultat: " + resultat);
		} catch (ArithmeticException e) {
			System.out.println("Erreur de dénominateur");
			System.out.println(e.getMessage());
		} catch (NumeratorException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("dans finally");
			clavier.close();
		}
		System.out.println("A bientôt");
	}
	
	static void testDiv() {
		Scanner clavier = new Scanner(System.in);
		try {
			System.out.println("saisir nb1");
			int nb1 = clavier.nextInt();
			System.out.println("saisir nb2");
			int nb2 = clavier.nextInt();
			int resultat = Calcul.div(nb1, nb2);
			System.out.println("resultat: " + resultat);
		} catch (ArithmeticException e) {
			System.out.println("Erreur de dénominateur");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("dans finally");
			clavier.close();
		}
		System.out.println("A bientôt");
	}
	
	static void test3() {
		Scanner clavier = new Scanner(System.in);
		try {
			System.out.println("saisir nb1");
			int nb1 = clavier.nextInt();
			System.out.println("saisir nb2");
			int nb2 = clavier.nextInt();
			int resultat = nb1 / nb2;
			System.out.println("resultat: " + resultat);
		} catch (ArithmeticException e) {
			System.out.println("erreur de dénominateur: ");
			System.out.println(e);
		} catch (InputMismatchException e) {
			System.out.println("erreur de saisie: ");
			System.out.println(e);
		} catch (Exception e) {
			System.out.println("erreur: ");
			System.out.println(e);
		}
		System.out.println("A bientôt");
		clavier.close();
	}
	
	static void test2() {
		int[] tab = {1, 2, 3};
		System.out.println(tab[3]);
	}
	
	static void test1() {
		Scanner clavier = new Scanner(System.in);
		try {
			System.out.println("saisir age");
			int age = clavier.nextInt();
			System.out.println("vous avez " + age + " an(s)");
		} catch(Exception e) {
			System.out.println("problème de saisie");
			System.out.println(e);
		}
		System.out.println("A bientôt");
		clavier.close();
	}
	
}
