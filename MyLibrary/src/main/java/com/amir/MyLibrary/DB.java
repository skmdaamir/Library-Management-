package com.amir.MyLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	public static Connection getConnection() throws SQLException{
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.SQLServerDriver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:1433;databaseName=test", "sa", "password_123");
		}catch
		(ClassNotFoundException e)
		{
			e.printStackTrace();
			}
		return con;
	}

}
