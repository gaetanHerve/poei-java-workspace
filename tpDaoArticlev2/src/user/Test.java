package user;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import model.*;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int testRef = 66;
		testDelete(testRef);
		testSelectAll();
		System.out.println("\n-- INSERT --");
		testInsert(new Article(testRef, "marque66", 66));
		testSelectByRef(testRef);
		System.out.println("\n-- UPDATE --");
		testUpdate(new Article(testRef, "marque66", 99));
		testSelectByRef(testRef);
		System.out.println();
 		testSelectByPrix();
 		System.out.println();
		testSelectByMarque();
	}
	
	static void testSelectAll() throws ClassNotFoundException, SQLException {
		System.out.println("----- SELECT ALL -----");
		ArrayList<Article> articles = new DaoArticle().selectAll();
		displayArticlesArray(articles);
	}
	
	static void testSelectByRef(int ref) throws ClassNotFoundException, SQLException {
		System.out.println("----- SELECT BY REF -----");
		Article a = new DaoArticle().selectByRef(ref);
		System.out.println((a == null) ? "KO" : a);
	}
	
	static void testSelectByPrix() throws ClassNotFoundException, SQLException {
		System.out.println("----- SELECT BY PRIX -----");
		Scanner clavier = new Scanner(System.in);
		System.out.println("prix min :");
		int prixMin = clavier.nextInt();
		System.out.println("prix max :");
		int prixMax = clavier.nextInt();
		ArrayList<Article> articles = new DaoArticle().selectByPrix(prixMin, prixMax);
		displayArticlesArray(articles);
	}
	
	static void testSelectByMarque() throws ClassNotFoundException, SQLException {
		System.out.println("----- SELECT BY MARQUE -----");
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir une partie du nom de la marque :");
		String str = clavier.nextLine();
		ArrayList<Article> articles = new DaoArticle().selectByMarqueLike(str);
		displayArticlesArray(articles);
	}
	
	static void displayArticlesArray(ArrayList<Article> articles) {
		System.out.println("REF\tMARQUE\tPRIX");
		if (articles.size() == 0) {
			System.out.println("Aucun résultat");
		} else {
			for (Article a : articles) {
				System.out.println(a.getRef() + "\t" + a.getMarque() + "\t" + a.getPrix());
			}
		}
		
	}
	
	static void testInsertWithUserEntry() throws ClassNotFoundException, SQLException {
		int ref = 0;
		String marque = "";
		int prix = 0;
		
		Scanner clavierInt = new Scanner(System.in);
		Scanner clavierStr = new Scanner(System.in);
		
		System.out.println("saisir une référence(id) :");
		ref = clavierInt.nextInt();
		
		System.out.println("saisir une marque :");
		marque = clavierStr.nextLine();
		
		System.out.println("saisir un prix :");
		prix = clavierInt.nextInt();
		
		Article a = new Article(ref, marque, prix);
		new DaoArticle().insert(a);
	}
	
	static void testInsert(Article a) throws ClassNotFoundException, SQLException {
		new DaoArticle().insert(a);
	}
	
	static void testUpdate(Article a) throws ClassNotFoundException, SQLException {
		new DaoArticle().update(a);
	}
	
	static void testDelete(int ref) throws ClassNotFoundException, SQLException {
		new DaoArticle().delete(ref);
	}

}