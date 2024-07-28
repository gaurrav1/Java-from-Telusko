import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(name = "Home", value = "/home")
public class App extends HttpServlet{
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.getWriter().println("Hello from Home" + "\nWelcome, " + req.getSession(false).getAttribute("username"));
    }
}
