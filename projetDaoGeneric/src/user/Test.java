package user;

import java.sql.SQLException;

import dao.Dao;
import dao.DaoClient;
import dao.DaoClientMysql;
import dao.DaoPersonne;
import dao.DaoPersonneMysql;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		test1();
	}
	
	static void test1() throws ClassNotFoundException, SQLException {
		DaoPersonne x = new DaoPersonneMysql();
		DaoClient y = new DaoClientMysql();
		testFindAll(x);
		testFindAll(y);
	}
	
	static void testFindAll(Dao dao) throws ClassNotFoundException, SQLException {
		System.out.println(dao.findAll());
	}
	
	
}
