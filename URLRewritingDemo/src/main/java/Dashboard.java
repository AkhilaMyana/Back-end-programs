

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
         PrintWriter out = response.getWriter();
         out.println("<html><body>");
         
         String userId = request.getParameter("userid");
         if (userId == null ) {
             out.println("No UserId was found in the URL.<br>");
         } else {
             out.println("UserId obtained from URL Rewriting:" + userId + "<br>");
         }
         out.println("</body></html>");
    }
}

