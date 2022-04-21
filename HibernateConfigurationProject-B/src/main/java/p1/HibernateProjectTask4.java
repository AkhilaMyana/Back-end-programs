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
 * Servlet implementation class HibernateProjectTask4
 */
@WebServlet("/HibernateProjectTask4")
public class HibernateProjectTask4 extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HibernateManager4 hm4 = new HibernateManager4();
        PrintWriter writer = response.getWriter();
        boolean b1 = hm4.connect();
        ArrayList al = hm4.getData();
        for(int i=0;i<al.size();i++) {
            writer.println(HibernateManager4.al1.get(i));
            writer.println(HibernateManager4.al2.get(i));
            writer.println(HibernateManager4.al3.get(i));
            writer.println("------");
        }
        
    }
}