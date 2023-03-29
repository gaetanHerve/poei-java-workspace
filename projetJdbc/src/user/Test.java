package user;

import java.sql.SQLException;
import java.util.Scanner;

import model.*;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		testConnexion();
		// testUpdate(17, "Toto", "Titi", 12);
		// testSelect();
		// testSelectById(3);
		testSelectByNomLike();
	}
	
	static void testSelectByNomLike() throws ClassNotFoundException, SQLException {
		Scanner clavier = new Scanner(System.in);
		System.out.println("Saisir une chaîne :");
		String nom = clavier.nextLine();
		System.out.println(new DB().selectByNomLike(nom));
	}
	
	static void testSelectById(int id) throws ClassNotFoundException, SQLException {
		System.out.println(new DB().selectById(id));
	}
	
	static void testSelect() throws ClassNotFoundException, SQLException {
		System.out.println(new DB().select());
	}
	
	static void testInsert(int id, String nom, String prenom, int age) throws ClassNotFoundException, SQLException {
		new DB().insert(id, nom, prenom, age);
	}
	
	static void testUpdate(int id, String nom, String prenom, int age) throws ClassNotFoundException, SQLException {
		new DB().update(id, nom, prenom, age);
	}
	
	static void testDelete(int id) throws ClassNotFoundException, SQLException {
		new DB().delete(id);
	}
	
	static void testConnexion() throws ClassNotFoundException, SQLException {
		new DB().testConnexion();;
	}

}