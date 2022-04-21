import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JDBCServlet")
public class JDBCServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PrintWriter writer = response.getWriter();
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");
            writer.println("Driver is loaded");
            writer.println("<br><br>");
            InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
            Properties p = new Properties();
            p.load(in);
            //DriverManager.getConnection(p.getProperty("url"), p.getProperty("userid"),p.getProperty("pwd"));
            DriverManager.getConnection("jdbc:mysql://localhost:3306/Simpli", "root", "Akhila@11");
            System.out.println("Connection established");
            writer.println("Connection established");
            writer.println("<br><br>");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
