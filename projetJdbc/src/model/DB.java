package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	
	static private String login = new Credentials().getLogin();
	static private String password = new Credentials().getPwd();
	
	public String select() throws ClassNotFoundException, SQLException {
		String result = "ID\tNOM\tPRENOM\tAGE\n";
		String sql = "select * from personnes;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-obs1", login, password);
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while (rs.next()) {
			result +=
				rs.getObject(1) + "\t" +
				rs.getObject(2) + "\t" +
				rs.getObject(3) + "\t"+
				rs.getObject(4) + "\n";
		}
		
		conn.close();
		return result;
	}
	
	public String selectById(int id) throws ClassNotFoundException, SQLException {
		String result = "ID\tNOM\tPRENOM\tAGE\n";
		String sql = "select * from personnes where id = " + id + ";";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-obs1", login, password);
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		if (rs.next()) {
			result +=
				rs.getObject(1) + "\t" +
				rs.getObject(2) + "\t" +
				rs.getObject(3) + "\t"+
				rs.getObject(4) + "\n";
		}
		
		conn.close();
		return result;
	}
	
	public String selectByNomLike(String str) throws ClassNotFoundException, SQLException {
		String result = "ID\tNOM\tPRENOM\tAGE\n";
		String sql = "select * from personnes where nom LIKE '%" + str + "%';";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-obs1", login, password);
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while (rs.next()) {
			result +=
				rs.getObject(1) + "\t" +
				rs.getObject(2) + "\t" +
				rs.getObject(3) + "\t"+
				rs.getObject(4) + "\n";
		}
		
		conn.close();
		return result;
	}
	
	public void insert(int id, String nom, String prenom, int age) throws ClassNotFoundException, SQLException {
		String sql = "insert into personnes values (" + id + ", '" + nom + "', '" + prenom + "', " + age +");";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-obs1", login, password);
		System.out.println("CONNEXION OK");
		
		Statement st = conn.createStatement();
		st.executeUpdate(sql);
		conn.close();
	}
	
	public void update(int id, String nom, String prenom, int age) throws ClassNotFoundException, SQLException {
		String sql = "update personnes set nom = '" + nom + "', prenom = '" + prenom + "', age =" + age + " where id = " + id;
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-obs1", login, password);
		
		Statement st = conn.createStatement();
		st.executeUpdate(sql);
		conn.close();
	}
	
	public void delete(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-obs1", login, password);
		
		String sql = "delete from personnes where id="+id+";";
		Statement st = conn.createStatement();
		st.executeUpdate(sql);
		conn.close();
	}
	
	public void testConnexion() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db-obs1", login, password);
		System.out.println("CONNEXION OK");
		conn.close();
	}
}