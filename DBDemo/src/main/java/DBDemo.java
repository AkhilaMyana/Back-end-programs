

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBDemo
 */
@WebServlet("/DBDemo")
public class DBDemo extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			PrintWriter pw =response.getWriter();
			Class.forName("com.mysql.jdbc.Driver");
	        System.out.println("driver loaded");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Akhila@11");
	        System.out.println("Connection established");
	        Statement stmt = con.createStatement();
	        int x=stmt.executeUpdate("CREATE DATABASE SimpliSample");
	        if(x>0)
	        {
	        	pw.println("Database created");
	        }
	        else
	        {
	        	pw.println("Unable to create Database");
	        }
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught");
		}
	}

}
