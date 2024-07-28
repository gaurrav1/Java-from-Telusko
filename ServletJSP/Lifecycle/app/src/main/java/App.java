

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/aav")
public class App extends HttpServlet {

    static {
        System.out.println("Servlet class is loaded.");
    }

    public App() {
        System.out.println("Servlet object is created.");
    }

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("Servlet is initialized.");
    }

    public void destroy() {
        System.out.println("Servlet is destroyed.");
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("Servlet is servicing.");
        super.service(request, response);
    }
}
