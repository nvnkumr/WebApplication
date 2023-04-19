package web.webapplication.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	public static Connection initializeDatabase() throws SQLException, ClassNotFoundException
	{ 
		//Initialize all the information regarding
		// Database Connection
		String dbDriver= "com.mysql.jdbc.Driver";
		String dbURL ="jdbc:mysql://localhost:3306/";
		//Database name to access
		String dbName="trail";
		String dbUsername="root";
		String dbPassword="localcop";
	    Class.forName(dbDriver);
		Connection con= DriverManager.getConnection(dbURL+dbName, dbUsername,dbPassword);
		
		return con;
		
	}

}