

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBDemo4
 */
@WebServlet("/DBDemo4")
public class DBDemo4 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			PrintWriter pw =response.getWriter();
			Class.forName("com.mysql.jdbc.Driver");
	        System.out.println("driver loaded");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simpli", "root", "Akhila@11");
	        System.out.println("Connection established");
	        PreparedStatement pstmt= con.prepareStatement("insert into demo values(?,?,?,?)");
	        pstmt.setInt(1, 5);
	        pstmt.setString(2, "Raina");
	        pstmt.setInt(3, 36);
	        pstmt.setString(4, "IndiaCements");
	        int x= pstmt.executeUpdate();
	        if(x>0)
	        {
	        	pw.println("Value inserted");
	        }
	        else
	        {
	        	pw.println("Could not insert the values");
	        }
	        
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
	}
}
