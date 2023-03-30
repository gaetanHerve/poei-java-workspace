package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Article;
import model.Credentials;

public class DaoArticleMysql implements DaoArticle {
	
	static private String login = new Credentials().getLogin();
	static private String pwd = new Credentials().getPwd();

	@Override
	public List<Article> findAll() throws ClassNotFoundException, SQLException {
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

	@Override
	public Article findById(Integer ref) throws ClassNotFoundException, SQLException {
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
				rs.getInt("prix")
			);
		}
		
		conn.close();
		return article;
	}

	@Override
	public void create(Article a) throws ClassNotFoundException, SQLException {
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

	@Override
	public void update(Article a) throws ClassNotFoundException, SQLException {
		String sql = "update articles set marque = ?, prix = ? where ref = ?;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp-obs1", login, pwd);

		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, a.getMarque());
		ps.setInt(2, a.getPrix());
		ps.setInt(3, a.getRef());
		ps.executeUpdate();
		conn.close();
	}

	@Override
	public void delete(Article a) throws ClassNotFoundException, SQLException {
		String sql = "delete from articles where ref = ?;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp-obs1", login, pwd);
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, a.getRef());
		ps.executeUpdate();
		conn.close();
	}

}
