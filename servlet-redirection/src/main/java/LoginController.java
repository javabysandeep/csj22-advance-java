import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginController", urlPatterns = "/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        PrintWriter writer = resp.getWriter();
        if ("abc".equals(username) && "abc".equals(password)) {
//            redirect  to welcomeCOntroller
           // RequestDispatcher requestDispatcher = req.getRequestDispatcher("welcome");
            //requestDispatcher.forward(req,resp);
            resp.sendRedirect("welcome");
        } else{
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
            writer.print("<h1> Invalid Credentials</h1>");
            requestDispatcher.forward(req,resp);
        }
    }
}
