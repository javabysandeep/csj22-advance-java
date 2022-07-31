import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "cookie",urlPatterns = "/cookie")
public class CookieController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h2>Thanks for visiting. We have set the cookies.</h2>");
        Cookie cookie1 = new Cookie("state","MH");
        Cookie cookie2 = new Cookie("country","India");
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
    }
}
