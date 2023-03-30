package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoArticle {
	
	static private String login = new Credentials().getLogin();
	static private String pwd = new Credentials().getPwd();
	
	public void insert(Article a) throws ClassNotFoundException, SQLException {
		String sql = "insert into articles values (?, ?, ?);";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp-obs1", login, pwd);
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, a.getRef());
		ps.setString(2, a.getMarque());
		ps.setInt(3, a.getPrix());
		ps.executeUpdate();
		conn.close();
	}
	
	public void update(Article p) throws ClassNotFoundException, SQLException {
		String sql = "update articles set marque = ?, prix = ? where ref = ?;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp-obs1", login, pwd);

		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, p.getMarque());
		ps.setInt(2, p.getPrix());
		ps.setInt(3, p.getRef());
		ps.executeUpdate();
		conn.close();
	}
	
	public void delete(int ref) throws ClassNotFoundException, SQLException {
		String sql = "delete from articles where ref = ?;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp-obs1", login, pwd);
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, ref);
		ps.executeUpdate();
		conn.close();
	}
	
	public Article selectByRef(int ref) throws ClassNotFoundException, SQLException {
		Article article = new Article();
		String sql = "select * from articles where ref = ?;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp-obs1", login, pwd);
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, ref);
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {
			article = new Article(
				rs.getInt("ref"),
				rs.getString("marque"),
				rs.getInt("prix")
			);
		}
		
		conn.close();
		return article;
	}
	
	public ArrayList<Article> selectAll() throws ClassNotFoundException, SQLException {
		ArrayList<Article> articles = new ArrayList<Article>();
		String sql = "select * from articles;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp-obs1", login, pwd);
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while (rs.next()) {
			Article p = new Article(
				rs.getInt("ref"),
				rs.getString("marque"),
				rs.getInt("prix")
			);
			articles.add(p);
		}
		
		conn.close();
		return articles;
	}
	
	public ArrayList<Article> selectByPrix(int prixMin, int prixMax) throws ClassNotFoundException, SQLException {
		ArrayList<Article> articles = new ArrayList<Article>();
		String sql = "select * from articles where prix >  ?  AND prix < ?;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp-obs1", login, pwd);
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, prixMin);
		ps.setInt(2, prixMax);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			Article p = new Article(
				rs.getInt("ref"),
				rs.getString("marque"),
				rs.getInt("prix")
			);
			articles.add(p);
		}
		
		conn.close();
		return articles;
	}
	
	public ArrayList<Article> selectByMarqueLike(String str) throws ClassNotFoundException, SQLException {
		// TODO: finish here
		ArrayList<Article> articles = new ArrayList<Article>();
		String sql = "select * from articles where marque LIKE ?;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp-obs1", login, pwd);
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, "%" + str + "%");
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			Article p = new Article(
				rs.getInt("ref"),
				rs.getString("marque"),
				rs.getInt("prix")
			);
			articles.add(p);
		}
		
		conn.close();
		return articles;
	}
	
}
