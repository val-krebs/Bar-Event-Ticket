package dk.easv.bareventticket.dal.db;

import dk.easv.bareventticket.be.User;
import dk.easv.bareventticket.dal.interfaces.IUserDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO implements IUserDAO {

    private DatabaseConnector connector = new DatabaseConnector();

    @Override
    public User getUser(String username, String password) throws Exception {

        String sql = "SELECT * FROM Users WHERE username = ? AND password = ?";

        try (Connection conn = connector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("role")
                );
            }
        }
        return null;
    }
}