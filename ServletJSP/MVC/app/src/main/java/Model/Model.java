package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
    private String username;
    private String email;
    private String password;
    private Connection connection;
    private PreparedStatement preparedStatement;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public int registerUser() {
        int affectedRows = 0;
        Config config = new Config();
        try {
            connection = config.getConnection();

            String query = "insert into users(username, email, password) values(?, ?, ?)";

            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);

            preparedStatement.executeUpdate();
            affectedRows = preparedStatement.getUpdateCount();

        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                config.closeConnection(connection, preparedStatement);
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return affectedRows;
    }
}
