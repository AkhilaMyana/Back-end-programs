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
 * Servlet implementation class HibernateProjectTask3
 */
@WebServlet("/HibernateProjectTask3")
public class HibernateProjectTask3 extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HibernateManager3 hm3 = new HibernateManager3();
        PrintWriter writer = response.getWriter();
        boolean b1 = hm3.connect();
        ArrayList all = hm3.getData();
        for(int i=0;i<all.size();i++) {
            writer.println(HibernateManager3.al1.get(i));
            writer.println(HibernateManager3.al2.get(i));
            writer.println(HibernateManager3.al3.get(i));
            writer.println(HibernateManager3.al4.get(i));
            writer.println("------");
        }
        
    }
}