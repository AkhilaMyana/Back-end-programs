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
 * Servlet implementation class HibernateProjectTask1
 */
@WebServlet("/HibernateProjectTask1")
public class HibernateProjectTask1 extends HttpServlet {
	    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        HibernateManager1 hm1 = new HibernateManager1();
	        PrintWriter writer = response.getWriter();
	        boolean b1 = hm1.connect();
	        ArrayList al = hm1.getData();
	        for(int i=0;i<al.size();i++) {
	            writer.println(HibernateManager1.al1.get(i));
	            writer.println(HibernateManager1.al2.get(i));
	            writer.println(HibernateManager1.al3.get(i));
	            writer.println(HibernateManager1.al4.get(i));
	            writer.println("------");
	        }
	        
	    }
}
