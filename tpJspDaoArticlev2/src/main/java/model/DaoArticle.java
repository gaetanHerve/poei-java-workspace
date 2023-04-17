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
	
	public void insert(Article p) throws ClassNotFoundException, SQLException {
		String sql = "insert into articles values (?, ?, ?, ?);";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp-obs1", login, pwd);
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, p.getRef());
		ps.setString(2, p.getMarque());
		ps.setInt(3, p.getPrix());
		ps.setString(3, p.getCouleur());
		ps.executeUpdate();
		conn.close();
	}
	
	public void update(Article p) throws ClassNotFoundException, SQLException {
		String sql = "update articles set marque = ? , prix = ? , couleur = ? where ref = ?;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp-obs1", login, pwd);

		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(2, p.getMarque());
		ps.setInt(3, p.getPrix());
		ps.setString(2, p.getCouleur());
		ps.setInt(4, p.getRef());
		ps.executeUpdate();
		conn.close();
	}
	
	public void delete(int ref) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp-obs1", login, pwd);
		
		String sql = "delete from articles where ref = ?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, ref);
		ps.executeUpdate();
		conn.close();
	}
	
	public Article selectByRef(int ref) throws ClassNotFoundException, SQLException {
		Article article = null;
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
				rs.getInt("prix"),
				rs.getString("couleur")
			);
		}
		
		conn.close();
		return article;
	}
	
	public ArrayList<Article> select() throws ClassNotFoundException, SQLException {
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
				rs.getInt("prix"),
				rs.getString("couleur")
			);
			articles.add(p);
		}
		
		conn.close();
		return articles;
	}
	
	
	public ArrayList<Article>selectByMarqueLike(String str) throws ClassNotFoundException, SQLException {
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
				rs.getInt("prix"),
				rs.getString("couleur")
			);
			articles.add(p);
		}
		
		conn.close();
		return articles;
	}

}
