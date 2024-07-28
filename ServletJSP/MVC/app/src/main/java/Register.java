import java.io.IOException;
import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;

import Model.Model;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(name = "App", value = "/register")
public class Register extends HttpServlet{
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username =request.getParameter("username");
        String email =request.getParameter("email");
        String password =request.getParameter("password");
    
        HttpSession session = request.getSession();
        session.setAttribute("username", username);
    
        Model model = new Model();
    
        model.setUsername(username);
        model.setEmail(email);
        model.setPassword(password);
    
        int affectedRows = model.registerUser();
    
        if (affectedRows > 0) {
                
                response.sendRedirect("/mvc/success.jsp");
                System.out.println("User registered successfully");
        } else {
                response.sendRedirect("/mvc/failure.jsp");
                System.out.println("User registration failed");
        }
    }
    
    @Override
    public void destroy() {
        try {
            AbandonedConnectionCleanupThread.checkedShutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.destroy();
    }
}
