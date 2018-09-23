package com.training.ocp.jdbc.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Pavel Seda
 *
 */
public class DBConnection {

	private static volatile Connection connection;

	public static Connection getConnection() {
		if (connection == null) {
			synchronized (DBConnection.class) {
				if (connection == null) {
					try {
						connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jcert1", "postgres", "postgre");
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return connection;
	}

}
