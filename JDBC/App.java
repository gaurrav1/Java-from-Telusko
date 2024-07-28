
import connect.Config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Connection connect = null;
        PreparedStatement stmt = null;

        try {
            // String query = "CREATE TABLE user (id INT, name VARCHAR(255), age INT, PRIMARY KEY(id));";

            // String query = "INSERT INTO user (id, name, age) VALUES (?,?,?)";
            // stmt.setInt(1, 1);
            // stmt.setString(2, "Gaurav");
            // stmt.setInt(3, 19);

            String query = "SELECT * FROM user WHERE id = ?";

            connect = Config.getConnection();
            stmt = connect.prepareStatement(query);

            stmt.setInt(1, 1);

            boolean status = stmt.execute();
            System.out.println(status + " --\t[true: executeQuery(), false: executeUpdate()]\n");

            System.out.println("Query has been executed, now lets check result...");

            if(status){
                ResultSet rs = stmt.getResultSet();
                if(rs.next())
                    System.out.println("Id: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ", age: " + rs.getInt(3));
                else
                    System.out.println("Nothing found");
            }
            else{
                int count = stmt.getUpdateCount();
                if(count>0)
                    System.out.println(count + "row(s) affected");
                else 
                    System.out.println("Nothing changed");
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                Config.closeConnection(connect, stmt);
            } catch (SQLException e) {
                System.out.println(e);
            }
        } 

    }
}
