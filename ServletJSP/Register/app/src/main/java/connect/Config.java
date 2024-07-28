package connect;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
    
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        
        String url = "jdbc:mysql://localhost:3306/learning";
        String username = "gaurav";
        String password = "NGaurav@113";
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
        
    }

    public void closeConnection(Connection connection, Statement statement) throws SQLException {
        statement.close();
        connection.close();
    }

}
