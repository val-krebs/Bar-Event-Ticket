package dk.easv.bareventticket.dal.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

    private final String url = "jdbc:sqlserver://localhost;databaseName=EventDB;encrypt=true;trustServerCertificate=true";
    private final String user = "your_username";
    private final String password = "your_password";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}