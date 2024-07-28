import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/firstServlet")
public class Serve extends HttpServlet {

    public Serve() {
        System.out.println("Servlet object has been constructed");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String message = request.getParameter("message");

        response.setContentType("text/html");
        try (PrintWriter writer = response.getWriter()) {
            writer.println("Hello! " + name);
            writer.println("<br>So sweet! " + message);
        }
    }
}
