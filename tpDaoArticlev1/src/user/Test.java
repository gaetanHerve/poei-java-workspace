package user;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import model.*;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		testInsert(new Article(67, "marque76", 34));
		testSelectAll();
		testUpdate(new Article(67, "marque76", 98));
		testSelectAll();
		testDelete(67);
		testSelectAll();
 		testSelectByPrix();
		testSelectByMarque();
	}
	
	static void testSelectAll() throws ClassNotFoundException, SQLException {
		System.out.println("----- SELECT ALL -----");
		ArrayList<Article> articles = new DaoArticle().selectAll();
		for (Article a : articles) {
			System.out.println(a);
		}
	}
	
	static void testSelectByRef() throws ClassNotFoundException, SQLException {
		System.out.println("----- SELECT BY REF -----");
		System.out.println(new DaoArticle().selectByRef(1));
	}
	
	static void testSelectByPrix() throws ClassNotFoundException, SQLException {
		System.out.println("----- SELECT BY PRIX -----");
		Scanner clavier = new Scanner(System.in);
		System.out.println("prix min :");
		int prixMin = clavier.nextInt();
		System.out.println("prix max :");
		int prixMax = clavier.nextInt();
		ArrayList<Article> articles = new DaoArticle().selectByPrix(prixMin, prixMax);
		for (Article a : articles) {
			System.out.println(a);
		}
	}
	
	static void testSelectByMarque() throws ClassNotFoundException, SQLException {
		System.out.println("----- SELECT BY MARQUE -----");
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir une partie du nom de la marque :");
		String str = clavier.nextLine();
		ArrayList<Article> articles = new DaoArticle().selectByMarqueLike(str);
		for (Article a : articles) {
			System.out.println(a);
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
		
		clavierInt.close();
		clavierStr.close();
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