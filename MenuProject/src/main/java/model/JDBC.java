package model;

import java.sql.*;

public class JDBC {
	private String driver="com.mysql.cj.jdbc.Driver";
	private String jdbcUrl="jdbc:mysql://192.168.0.197/foodmenu?";
	private String userName="root";
	private String userPass="a123456B+";
	Connection conn;
	
	public JDBC() {
		try {
			Class.forName(driver);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public  static JDBC getDB() {
		return new JDBC();
	}
	
	public Connection getConnection() {
		try {
			conn = DriverManager.getConnection(jdbcUrl,userName,userPass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void close(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void close(PreparedStatement ps) {
		if(ps != null) {
			try {
				ps.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void close(Statement st) {
		if(st != null) {
			try {
				st.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void close(ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
