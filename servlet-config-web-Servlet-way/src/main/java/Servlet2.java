import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "servlet2",
        urlPatterns = "/servlet2",
        initParams = {
                @WebInitParam(name = "username", value = "servlet2Username"),
                @WebInitParam(name = "password", value = "servlet2Pass"),
        }
)
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        ServletConfig servletConfig = getServletConfig();
        ServletContext servletContext = getServletContext();
        writer.println("Servlet1--> ServletConfig Object: Username ->"+ servletConfig.getInitParameter("username"));
        writer.println("Servlet1--> ServletConfig Object: Password ->"+ servletConfig.getInitParameter("password"));
        writer.println("Servlet1--> ServletConText Object Username : ->"+ servletContext.getInitParameter("dbUserName"));
        writer.println("Servlet1--> ServletConText Object: Password ->"+ servletContext.getInitParameter("password"));
    }
}
