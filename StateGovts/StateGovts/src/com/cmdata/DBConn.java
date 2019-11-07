package com.cmdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	private static final String DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
	
	private static final String USERNAME = "Stategov";
	
	private static final String PASSWORD = "123";
	
	private static Connection connection = null;
	
	public static Connection openConnection() {
		if (connection != null)
            return connection;
        else {
            try {
                Class.forName(DRIVER);
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } 
            return connection;
        }
	}
	
	
}