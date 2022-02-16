package de.telekom.sea7.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



public class DbConnection {
	
	public Connection connection;
	
	public void initConnection() throws SQLException {
		Properties connectionProps = new Properties();
		connectionProps.put("user", "admin");
		connectionProps.put("password", "toll");
		connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bank", connectionProps);
		System.out.println("Connected to database");
	}

}
