package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	
	static private String login = new Credentials().getLogin();
	static private String password = new Credentials().getPwd();
	
	public String selectAll() throws ClassNotFoundException, SQLException {
		String result = "ID\tMARQUE\tPRIX\n";
		String sql = "select * from articles;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp-obs1", login, password);
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while (rs.next()) {
			result +=
				rs.getObject(1) + "\t" +
				rs.getObject(2) + "\t" +
				rs.getObject(3) + "\n";
		}
		
		conn.close();
		return result;
	}
	
	public String selectByRef(int ref) throws ClassNotFoundException, SQLException {
		String result = "ID\tMARQUE\tPRIX\n";
		String sql = "select * from articles where ref = " + ref + ";";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp-obs1", login, password);
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		if (rs.next()) {
			result +=
				rs.getObject(1) + "\t" +
				rs.getObject(2) + "\t" +
				rs.getObject(3) + "\n";
		}
		
		conn.close();
		return result;
	}
	
	public String selectByMarque(String str) throws ClassNotFoundException, SQLException {
		String result = "ID\tMARQUE\tPRIX\n";
		String sql = "select * from articles where marque LIKE '%" + str + "%';";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp-obs1", login, password);
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while (rs.next()) {
			result +=
				rs.getObject(1) + "\t" +
				rs.getObject(2) + "\t" +
				rs.getObject(3) + "\n";
		}
		
		conn.close();
		return result;
	}
	
	public String selectByPrix(int prixMin, int prixMax) throws ClassNotFoundException, SQLException {
		String result = "ID\tMARQUE\tPRIX\n";
		String sql = "select * from articles where prix > " + prixMin + " AND prix < " + prixMax + ";";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp-obs1", login, password);
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while (rs.next()) {
			result +=
				rs.getObject(1) + "\t" +
				rs.getObject(2) + "\t" +
				rs.getObject(3) + "\n";
		}
		
		conn.close();
		return result;
	}
	
	public void insert(int ref, String marque, int prix) throws ClassNotFoundException, SQLException {
		String sql = "insert into articles values (" + ref + ", '" + marque + "', " + prix +");";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp-obs1", "root", password);
		
		Statement st = conn.createStatement();
		st.executeUpdate(sql);
		conn.close();
	}
	
	public void update(int ref, String marque, int prix) throws ClassNotFoundException, SQLException {
		String sql = "update articles set marque = '" + marque + "', prix =" + prix + " where ref = " + ref;
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp-obs1", "root", password);
		
		Statement st = conn.createStatement();
		st.executeUpdate(sql);
		conn.close();
	}
	
	public void delete(int ref) throws ClassNotFoundException, SQLException {
		String sql = "delete from articles where ref="+ref+";";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp-obs1", "root", password);
		System.out.println("CONNEXION OK");
		
		Statement st = conn.createStatement();
		st.executeUpdate(sql);
		conn.close();
	}
}