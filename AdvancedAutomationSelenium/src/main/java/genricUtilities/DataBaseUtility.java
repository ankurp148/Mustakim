package genricUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility implements IAutoConstants {
	Driver dbdriver;
	Connection connection;
	Statement statement;
	ResultSet result;

	//eastablishing connection with database
	public void establishingConnections() {
		try {
			dbdriver = new Driver();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			DriverManager.registerDriver(dbdriver);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//reading database
	public ArrayList readingDataFromDataBase(String query, String columnName) {
		ArrayList list = new ArrayList();
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			result = statement.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while (result.next()) {
				list.add(result.getString(columnName));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//closing connection
	public void closingConnection()
	{
		try {
			connection.close();
		} catch (SQLException e) {
		  e.printStackTrace();
		}
	}

}
