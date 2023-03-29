package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	static private String password = "EDC705edc!!";
	
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