

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletResponse;


					
public class DisplayServlet extends HttpFilter implements Filter {
       
   
	
		// place your code here
		public String name_1 = "Harry";
	     String addr_2 = "Muddin Palya, Magadi Road."; 
	     String pin_3 = "abcd1234";
	    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	        // TODO Auto-generated method stub
	        // place your code here
	        String name = request.getParameter("name");
	        String addr = request.getParameter("aaddr");
	        String pin = request.getParameter("pin");
	        HttpServletResponse resp1 = null;
	        if(name.equals(name_1)==true && pin.equals(pin_3) == true) {
	            chain.doFilter(request, response);
	        }
	        else {
	            PrintWriter writer = resp1.getWriter();
	            writer.print("Validation failure");
	        }  
	    }
	}

	


