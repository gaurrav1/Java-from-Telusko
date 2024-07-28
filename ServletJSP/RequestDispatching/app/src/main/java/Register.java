import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(name = "Register", value = "/register")
public class Register extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String username = req.getParameter("username").toString();
        String password = req.getParameter("password").toString();



        HttpSession session = req.getSession(false);
        session.setMaxInactiveInterval(10000); // Max inactive time in seconds
        
        session.setAttribute("username", username);
        session.setAttribute("password", password);

        session.setAttribute("username", username);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/welcome");
        requestDispatcher.forward(req, res);
        
    }
    
}
