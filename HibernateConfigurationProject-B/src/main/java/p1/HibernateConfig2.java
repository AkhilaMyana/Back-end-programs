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
 * Servlet implementation class HibernateConfig2
 */
@WebServlet("/HibernateConfig2")
public class HibernateConfig2 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HibernateManager hm= new HibernateManager();
		PrintWriter pw=response.getWriter();
		boolean b1= hm.connect();
		ArrayList al=hm.getSpecificData(1);
		for(int i=0;i<al.size();i++)
		{
			pw.println("Data of student:"+(i+1));
			System.out.println(HibernateManager.al1.get(i));
			System.out.println(HibernateManager.al2.get(i));
			pw.println(HibernateManager.al1.get(i));
			pw.println(HibernateManager.al2.get(i));
			System.out.println("-------");
			pw.println("-------");
		}
	
	}

}
