package redirect;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class App extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("username");
        String password = req.getParameter("password");

        if (name.equals("admin") && password.equals("admin")) {
            res.sendRedirect("/app-1.0/index.jsp");
        } else {
            res.sendRedirect("/app-1.0/error.jsp");
        }
    }
}
