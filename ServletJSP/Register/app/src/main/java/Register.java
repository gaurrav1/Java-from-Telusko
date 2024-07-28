import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import connect.Config;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/register")
public class Register extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("From Register.java");
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        Config config = new Config();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = config.getConnection();
            String query = "insert into users (username, email, password) values (?, ?, ?)";
            statement = connection.prepareStatement(query);

            statement.setString(1, username);
            statement.setString(2, email);
            statement.setString(3, password);

            int affectedRows = statement.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("User registered successfully");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                config.closeConnection(connection, statement);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        // res.getWriter().println("User registered successfully");
        HttpSession session = req.getSession(true);
        session.setAttribute("username", username);
        req.getRequestDispatcher("/home").forward(req, res);
        
    }
    
}
