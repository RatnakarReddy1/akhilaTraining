package training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		String selectQuery = "select * from new_table";
		conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/akhila", "root", "123456");

		if (conn != null) {
			System.out.println("Connected to the database!");
		} else {
			System.out.println("Failed to make connection!");
		}
		//insert data
		stmt = (Statement) conn.createStatement();
		String query1 = "INSERT INTO new_table " + "VALUES (6, 'John', 'john','john')";
		stmt.executeUpdate(query1);
		System.out.println("Record Inserted Successfully");
		
		//Select data
		ResultSet result = stmt.executeQuery(selectQuery);
		while(result.next()) {
			System.out.println("Id - " +result.getInt("id"));
			System.out.println("Name - " +result.getString("name"));
		}
		conn.close();

	}

}
