package user;

import java.sql.SQLException;
import java.util.Scanner;

import model.DB;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// testInsert(20, "marque5", 54);
		// testUpdate(20, "marque5", 25);
		// testDelete(20);
		testInsertWithUserEntry();
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