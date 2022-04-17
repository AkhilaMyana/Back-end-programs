

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCode1
 */
@WebServlet("/ServletCode1")
public class ServletCode1 implements Servlet {
    
    ServletConfig config=null;
    
     public void service(ServletRequest req,ServletResponse res)
     throws IOException,ServletException{
         System.out.println(getServletInfo());
         System.out.println(getServletConfig());
         res.setContentType("text/html");
         PrintWriter pwriter=res.getWriter();
         pwriter.print("<html>");
         pwriter.print("<body>");
         pwriter.print("In the service() method<br>");
         pwriter.print("</body>");
         pwriter.print("</html>");
     }
     public void destroy(){
         System.out.println("In destroy() method");
     }

     @Override
     public ServletConfig getServletConfig(){
         return config;
     }
     public String getServletInfo(){
         return "This is a sample servlet info";
     }
   
   @Override
   public void init(ServletConfig config) throws ServletException {
       this.config=config;
       System.out.println("Initialization complete");
       
   }
}