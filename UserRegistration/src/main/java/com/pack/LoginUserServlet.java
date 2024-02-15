package com.pack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/loginUser")
public class LoginUserServlet extends HttpServlet 
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
	{
		String userName = req.getParameter("uName");
		String userPword =  req.getParameter("uPassword");
		
		UserBean ub = new LoginUserDAO().login(userName , userPword);
		
		if(ub==null)
		{
			req.setAttribute("msg", "Invalid Login Process");
			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			rd.forward(req, res);
			
		}
		else
		{
//			System.out.println("User Details are valid");
			
			ServletContext sct = req.getServletContext();
			sct.setAttribute("ubean", ub);
		
		 Cookie ck = new Cookie("name", ub.getfName());
		 
			res.addCookie(ck);
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, res);
		}
	}
}
