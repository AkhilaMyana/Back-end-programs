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
		Student s= new Student();
		s.setSid(4);
		s.setSname("Ram");
		boolean b1= hm.connect();
		boolean b2= hm.insert(s);
		PrintWriter pw=response.getWriter();
		if(b1==true &&b2==true)
		{
			pw.println("Hibernate configurations are up and running");
			pw.println("Hibernate has added your data to database");
		}
		else
		{
			pw.println("Could not complete Hibernate configurations set up");
		}
	}
}
