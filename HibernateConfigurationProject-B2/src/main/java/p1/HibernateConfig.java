package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HibernateConfig
 */
@WebServlet("/HibernateConfig")
public class HibernateConfig extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HibernateManager hm= new HibernateManager();
		boolean b= hm.connect();
		PrintWriter pw=response.getWriter();
		if(b==true)
		{
			pw.println("Hibernate configurations are up and running");
		}
		else
		{
			pw.println("Could not complete Hibernate configurations set up");
		}
	}
}
