package io.explait.data;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String username = "root";
	String passwrd = "abc";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("We are in the Servlet service method");
		
		String uname = request.getParameter("username");
		String pwd = request.getParameter("passwrd");
		
		String msg = " ";  
		
		if(uname.equals(username)  && pwd.equals(passwrd) ){
			msg = "Hello "+uname+ "! Your log was successfull";
			
		}else{
			msg = "Your username and/or password are not correct!";
		}
		
		response.setContentType("text/HTML");
		PrintWriter out = response.getWriter();
		out.print("<font size='6' color='red'>"+msg+"</font>");
		
			
	}

}
