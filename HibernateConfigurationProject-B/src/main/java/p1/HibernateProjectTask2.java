package p1;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HibernateProjectTask2
 */
@WebServlet("/HibernateProjectTask2")
public class HibernateProjectTask2 extends HttpServlet {
	    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        HibernateManager2 hm2 = new HibernateManager2();
	        PrintWriter writer = response.getWriter();
	        boolean b1 = hm2.connect();
	        ArrayList al = hm2.getData();
	        for(int i=0;i<al.size();i++) {
	            writer.println(HibernateManager2.al1.get(i));
	            writer.println(HibernateManager2.al2.get(i));
	            writer.println(HibernateManager2.al3.get(i));
	            writer.println(HibernateManager2.al4.get(i));
	            writer.println("------");
	        }
	        
	    }
}
