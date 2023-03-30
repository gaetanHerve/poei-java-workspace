package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoPersonne {
	
	static private String login = new Credentials().getLogin();
	static private String pwd = new Credentials().getPwd();
	
	public void insert(Personne p) throws ClassNotFoundException, SQLException {
		String sql = "insert into personnes values (?, ?, ?, ?);";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-obs1", login, pwd);
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, p.getId());
		ps.setString(2, p.getNom());
		ps.setString(3, p.getPrenom());
		ps.setInt(4, p.getAge());
		ps.executeUpdate();
		conn.close();
	}
	
	public void update(Personne p) throws ClassNotFoundException, SQLException {
		String sql = "update personnes set nom = ? , prenom = ? , age = ? where id = ?;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-obs1", login, pwd);

		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, p.getNom());
		ps.setString(2, p.getPrenom());
		ps.setInt(3, p.getAge());
		ps.setInt(4, p.getId());
		ps.executeUpdate();
		conn.close();
	}
	
	public void delete(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-obs1", login, pwd);
		
		String sql = "delete from personnes where id = ?;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ps.executeUpdate();
		conn.close();
	}
	
	public Personne selectById(int id) throws ClassNotFoundException, SQLException {
		Personne personne = null;
		String sql = "select * from personnes where id = ?;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-obs1", login, pwd);
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {
			personne = new Personne(
				rs.getInt("id"),
				rs.getString(2),
				rs.getString(3),
				rs.getInt(4)
			);
		}
		
		conn.close();
		return personne;
	}
	
	public ArrayList<Personne> select() throws ClassNotFoundException, SQLException {
		ArrayList<Personne> personnes = new ArrayList<Personne>();
		String sql = "select * from personnes;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-obs1", login, pwd);
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while (rs.next()) {
			Personne p = new Personne(
				rs.getInt("id"),
				rs.getString("nom"),
				rs.getString("prenom"),
				rs.getInt("age")
			);
			personnes.add(p);
		}
		
		conn.close();
		return personnes;
	}
	
	
	public ArrayList<Personne>selectByNomLike(String str) throws ClassNotFoundException, SQLException {
		ArrayList<Personne> personnes = new ArrayList<Personne>();
		String sql = "select * from personnes where nom LIKE ?;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-obs1", login, pwd);
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, "%" + str + "%");
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			Personne p = new Personne(
				rs.getInt("id"),
				rs.getString("nom"),
				rs.getString("prenom"),
				rs.getInt("age")
			);
			personnes.add(p);
		}
		
		conn.close();
		return personnes;
	}
	
}
