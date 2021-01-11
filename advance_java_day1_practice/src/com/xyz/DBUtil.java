package com.xyz;

import java.sql.*;

public class DBUtil {
	public static Connection getMySqlDbConnection() {
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String dbUserName = "root";
		String dbPassword = "1";
		Connection con = null;
		try {
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url, dbUserName, dbPassword);
			
		} catch (Exception e) {
			System.out.println("Exception while creating Db Connection: " + e);
		}
		return con;
	}
}