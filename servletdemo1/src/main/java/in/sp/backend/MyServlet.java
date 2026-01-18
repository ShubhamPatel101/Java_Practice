package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")
public class MyServlet extends HttpServlet   {
	
	protected void service(HttpServletRequest req , HttpServletResponse res)throws IOException, ServletException{
			String myname = req.getParameter("name1");
			String myemail = req.getParameter("email1");
            System.out.println("name:"+ myname);   
            System.out.println("email:"+ myemail);   
            
            PrintWriter out = res.getWriter();
            out.print("name:"+ myname);
            out.print("email:"+ myemail);
	}
}