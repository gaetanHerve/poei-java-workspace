package user;

import java.sql.SQLException;
import java.util.List;

import dao.*;
import model.*;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		test1();
	}
	
	static void test1() throws ClassNotFoundException, SQLException {
		DaoArticle articleDao = new DaoArticleMysql();
		int testRef = 66;
		testDelete(articleDao, new Article(testRef));
		testSelectAll(articleDao);
		System.out.println("\n-- INSERT --");
		testInsert(articleDao, new Article(testRef, "marque66", 66));
		testSelectByRef(articleDao, testRef);
		System.out.println("\n-- UPDATE --");
		testUpdate(articleDao, new Article(testRef, "marque66", 99));
		testSelectByRef(articleDao, testRef);
	}
	
	static void testInsert(Dao dao, Object obj) throws ClassNotFoundException, SQLException {
		dao.create(obj);
	}
	
	static void testUpdate(Dao dao, Object obj) throws ClassNotFoundException, SQLException {
		dao.update(obj);
	}
	
	static void testDelete(Dao dao, Object obj) throws ClassNotFoundException, SQLException {
		dao.delete(obj);
	}
	
	static void testFindAll(Dao dao) throws ClassNotFoundException, SQLException {
		System.out.println(dao.findAll());
	}
	
	static void testSelectAll(Dao dao) throws ClassNotFoundException, SQLException {
		System.out.println("----- SELECT ALL -----");
		List<Article> items = dao.findAll();
		displayItemsList(items);
	}
	
	static void testSelectByRef(Dao dao, int ref) throws ClassNotFoundException, SQLException {
		System.out.println("----- SELECT BY REF -----");
		Object obj = dao.findById(ref);
		System.out.println((obj == null) ? "KO" : obj);
	}
	
	// Je vous laisse le soin de réfléchir à comment généraliser la fonction suivante si vous voulez :)
	static void displayItemsList(List<Article> articles) {
		System.out.println("REF\tMARQUE\tPRIX");
		if (articles.size() == 0) {
			System.out.println("Aucun résultat");
		} else {
			for (Article a : articles) {
				System.out.println(a.getRef() + "\t" + a.getMarque() + "\t" + a.getPrix());
			}
		}
		
	}

}