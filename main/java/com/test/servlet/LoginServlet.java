package com.test.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	
       
    

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String username = req.getParameter("username");
		String Password = req.getParameter("password");
		
		if(username.equals("sathvik") && Password.equals("password123")){
			System.out.println("Valid information");
			res.sendRedirect("welcome.html");
		}
		else
		{
			System.out.println("invalid username or password");
			RequestDispatcher rd= req.getRequestDispatcher("login.jsp");
			req.setAttribute("error","Invalid user and password");
			rd.forward(req, res);
			//res.sendRedirect("login.jsp");
		}
	}


}
