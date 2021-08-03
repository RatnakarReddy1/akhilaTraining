package training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException {
		
		 Connection conn = DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/akhila", "root", "123456");

	            if (conn != null) {
	                System.out.println("Connected to the database!");
	            } else {
	                System.out.println("Failed to make connection!");
	            }
 
	}

}
