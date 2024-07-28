package Model;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {

    public Connection getConnection() throws SQLException{

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        
        String url = "jdbc:mysql://localhost:3306/learning";
        String username = "gaurav";
        String password = "NGaurav@113";
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    public void closeConnection(Connection connection, Statement statement) throws SQLException{
        statement.close();
        connection.close();
    }

}