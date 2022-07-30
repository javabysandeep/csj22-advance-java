import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "authFilter",urlPatterns = "/servlet1")
public class AuthenticationFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init method");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    // pre-processing
        response.setContentType("text/html");
        response.getWriter().println("Filter pre-processing");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if("abc".equals(username)&&"abc".equals(password)){
            chain.doFilter(request,response);
        } else{
            response.getWriter().println("Filter post-processing");
            response.getWriter().println("Invalid Credentials");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            requestDispatcher.include(request,response);
        }
    }

    @Override
    public void destroy() {
        System.out.println("filter destroy method");
    }
}
