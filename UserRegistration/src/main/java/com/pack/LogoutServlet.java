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
@WebServlet("/logoutUser")
public class LogoutServlet extends HttpServlet 
{
	protected void doGet (HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
	{
		Cookie ck[] = req.getCookies();
		if(ck==null)
		{
			req.setAttribute("msg", "Session Expired Login Again");
		}
		else
		{
			ServletContext sct = req.getServletContext();
			sct.removeAttribute("ubean");
			ck[0].setMaxAge(0);
			res.addCookie(ck[0]);
			req.setAttribute("msg", "Logout was Success");
		}
		RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
		rd.forward(req, res);
		
	}
}
