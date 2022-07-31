import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CookieReaderController",urlPatterns = "/read")
public class CookieReaderController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        Cookie[] cookies = req.getCookies();
        PrintWriter writer = resp.getWriter();
        writer.println("I have saved following cookies on your system.");

        writer.print("<table>");
        for (Cookie cookie:cookies) {
            writer.print("<tr>");

            writer.print("<td>");
            writer.print(cookie.getName());
            writer.print("<td>");

            writer.print("<td>");
            writer.print(cookie.getValue());
            writer.print("<td>");

            writer.print("/<tr>");
        }
        writer.print("</table>");
    }
}
