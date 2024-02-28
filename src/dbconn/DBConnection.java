package dbconn;

import java.sql.*;

public class DBConnection {
 private static Connection conn = null;
 public static Connection getConnection() {
	 System.out.println("getConnection..");
	 try {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		 System.out.println("Connection success...");
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	return conn;
 }
	
	public static void main(String[] args) {
		System.out.println("conn...."+DBConnection.getConnection());
	

	}

}
