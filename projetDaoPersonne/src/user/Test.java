package user;

import java.sql.SQLException;
import java.util.ArrayList;

import model.DaoPersonne;
import model.Personne;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// testSelect();
		testSelectById(1);
		testSelectByNom("DUP");
		// testDelete();
	}
	
	static void testInsert() throws ClassNotFoundException, SQLException {
		new DaoPersonne().insert(new Personne(20, "tata", "titi", 54));
	}
	
	static void testUpdate() throws ClassNotFoundException, SQLException {
		new DaoPersonne().update(new Personne(20, "tata", "titOUOUOAAAU", 54));
	}
	
	static void testDelete() throws ClassNotFoundException, SQLException {
		new DaoPersonne().delete(20);
	}
	
	static void testSelect() throws ClassNotFoundException, SQLException {
		System.out.println("ID\tNOM\tPRENOM\tAGE");
		ArrayList<Personne> personnes = new DaoPersonne().select();
		for (Personne p : personnes) {
			System.out.println(p.getId() + "\t" + p.getNom() + "\t" + p.getPrenom() + "\t" + p.getAge());
		}
	}
	
	static void testSelectByNom(String str) throws ClassNotFoundException, SQLException {
		System.out.println("ID\tNOM\tPRENOM\tAGE");
		ArrayList<Personne> personnes = new DaoPersonne().selectByNomLike(str);
		for (Personne p : personnes) {
			System.out.println(p.getId() + "\t" + p.getNom() + "\t" + p.getPrenom() + "\t" + p.getAge());
		}
	}
	
	static void testSelectById(int id) throws ClassNotFoundException, SQLException {
		Personne p = new DaoPersonne().selectById(id);
		System.out.println((p == null) ? "KO" : p);
	}
	
	
}
