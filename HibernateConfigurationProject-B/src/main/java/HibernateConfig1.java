import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import p1.HibernateManager;

/**
 * Servlet implementation class HibernateConfig1
 */
@WebServlet("/HibernateConfig1")
public class HibernateConfig1 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HibernateManager hm= new HibernateManager();
		PrintWriter pw=response.getWriter();
		boolean b1= hm.connect();
		ArrayList al=hm.getData();
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
