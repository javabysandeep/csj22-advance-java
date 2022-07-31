import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        ServletConfig servletConfig = getServletConfig();
        ServletContext servletContext = getServletContext();
        writer.println("Servlet1--> ServletConfig Object: Username ->"+ servletConfig.getInitParameter("username"));
        writer.println("Servlet1--> ServletConText Object Username : ->"+ servletContext.getInitParameter("dbUserName"));
        writer.println("Servlet1--> ServletConText Object: Password ->"+ servletContext.getInitParameter("password"));
    }
}
