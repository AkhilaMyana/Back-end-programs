

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBOperations
 */
@WebServlet("/DBOperations")
public class DBOperations extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			PrintWriter pw =response.getWriter();
			Class.forName("com.mysql.jdbc.Driver");
	        System.out.println("driver loaded");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "Akhila@11");
	        System.out.println("Connection established");
	        String s1=request.getParameter("pid");
	        int pid=Integer.parseInt(s1);
	        PreparedStatement pstmt= con.prepareStatement("select* from Product_Details where pid=?");
	        pstmt.setInt(1, pid);
	        ResultSet res=pstmt.executeQuery(); 
	        while(res.next()==true)
	        {
	        	pw.println("Product details are:");
	        	pw.println(res.getInt(1));
	        	pw.println(res.getString(2));
	        	pw.println(res.getInt(3));
	        	pw.println(res.getInt(4));
	        	pw.println(res.getString(5));
	        }
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println("Exception Handled");
		}
	}

}
