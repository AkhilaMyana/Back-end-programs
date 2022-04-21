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
 * Servlet implementation class HibernateProjectTask5
 */
@WebServlet("/HibernateProjectTask5")
public class HibernateProjectTask5 extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HibernateManager5 hm5 = new HibernateManager5();
        PrintWriter writer = response.getWriter();
        boolean b1 = hm5.connect();
        ArrayList al = hm5.getData();
        for(int i=0;i<al.size();i++) {
            writer.println(HibernateManager5.al1.get(i));
            writer.println(HibernateManager5.al2.get(i));
            writer.println(HibernateManager5.al3.get(i));
            writer.println("------");
        }
        
    }
}