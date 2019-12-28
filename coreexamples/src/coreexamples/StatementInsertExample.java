package coreexamples;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class StatementInsertExample {

	public static void main(String[] args) {
	
		Connection connection=null;
		Statement statement =null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc3","root","root");
			
			statement=connection.createStatement();
			
			ResultSet resultset=statement.executeQuery("select * from user ");
			while(resultset.next()) {
			
		System.out.println(resultset.getInt(1)+" "+resultset.getString(2)+" "+resultset.getString(3));
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		
	
		}

	}

}
 