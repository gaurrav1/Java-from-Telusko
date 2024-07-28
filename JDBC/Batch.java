
import connect.Config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Batch {

    public static void main(String[] args) throws Exception {
        Connection connect = null;
        PreparedStatement stmt = null;

        try {
            String query = "INSERT INTO user (id, name, age) VALUES (?,?,?)";
            
            connect = Config.getConnection();
            stmt = connect.prepareStatement(query);
            
            stmt.setInt(1, 2);
            stmt.setString(2, "Ram");
            stmt.setInt(3, 21);
            stmt.addBatch();

            stmt.setInt(1, 3);
            stmt.setString(2, "Shyam");
            stmt.setInt(3, 22);
            stmt.addBatch();

            stmt.setInt(1, 4);
            stmt.setString(2, "Naam");
            stmt.setInt(3, 34);
            stmt.addBatch();

            int[] count = stmt.executeBatch();
            if(count.length > 0)
                System.out.println("Rows affected: " + count.length);
            else
                System.out.println("Nothing changed");

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
