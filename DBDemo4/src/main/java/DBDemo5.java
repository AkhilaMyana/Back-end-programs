

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
 * Servlet implementation class DBDemo5
 */
@WebServlet("/DBDemo5")
public class DBDemo5 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			PrintWriter pw =response.getWriter();
			Class.forName("com.mysql.jdbc.Driver");
	        System.out.println("driver loaded");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simpli", "root", "Akhila@11");
	        System.out.println("Connection established");
	        PreparedStatement pstmt= con.prepareStatement("delete from demo where id=?");
	        pstmt.setInt(1, 5);
	        int x= pstmt.executeUpdate();
	        if(x>0)
	        {
	        	pw.println("Value deleted");
	        }
	        else
	        {
	        	pw.println("Could not delete the values");
	        }
	        
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println("Exception Handled");
		}
	}

}
