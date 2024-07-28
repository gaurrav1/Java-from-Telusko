import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(name = "FirstServlet", value = "/welcome")
public class App extends HttpServlet{
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("In /welcome");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/second");
        // requestDispatcher.forward(req, res); // Second servlet will response
        requestDispatcher.include(req, res); // Both servlets will response

        

        res.getWriter().println("Hello from FirstServlet" + "\nWelcome, " + req.getSession(false).getAttribute("username"));
    }
}
