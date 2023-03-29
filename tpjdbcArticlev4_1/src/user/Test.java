package user;

import java.sql.SQLException;
import java.util.Scanner;

import model.DB;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// testSelectAll();
		// testSelectByRef();
		testSelectByPrix();
		// testSelectByMarque();
		// testInsert(154, "marque9", 12);
	}
	
	static void testSelectAll() throws ClassNotFoundException, SQLException {
		System.out.println("----- SELECT ALL -----");
		System.out.println(new DB().selectAll());
	}
	
	static void testSelectByRef() throws ClassNotFoundException, SQLException {
		System.out.println("----- SELECT BY REF -----");
		System.out.println(new DB().selectByRef(1));
	}
	
	static void testSelectByPrix() throws ClassNotFoundException, SQLException {
		System.out.println("----- SELECT BY PRIX -----");
		Scanner clavier = new Scanner(System.in);
		System.out.println("prix min :");
		int prixMin = clavier.nextInt();
		System.out.println("prix max :");
		int prixMax = clavier.nextInt();
		System.out.println(new DB().selectByPrix(prixMin, prixMax));
	}
	
	static void testSelectByMarque() throws ClassNotFoundException, SQLException {
		System.out.println("----- SELECT BY MARQUE -----");
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir une partie du nom de la marque :");
		String str = clavier.nextLine();
		System.out.println(new DB().selectByMarque(str));
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
		
		new DB().insert(ref, marque, prix);
		
		clavierInt.close();
		clavierStr.close();
	}
	
	static void testInsert(int ref, String marque, int prix) throws ClassNotFoundException, SQLException {
		new DB().insert(ref, marque, prix);
	}
	
	static void testUpdate(int ref, String marque, int prix) throws ClassNotFoundException, SQLException {
		new DB().update(ref, marque, prix);
	}
	
	static void testDelete(int ref) throws ClassNotFoundException, SQLException {
		new DB().delete(ref);
	}

}