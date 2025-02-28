package com.ig.evergreen.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtility {
	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ig","root","root");
		return connection;
	}
	
}
