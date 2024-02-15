package com.pack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/editProfile")
public class EditProfileServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		
		Cookie c[] = req.getCookies();
		if(c==null)
		{
			req.setAttribute("msg", "Session expired Login again");
			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			rd.forward(req, res);
		}
		else
		{
			String fName = c[0].getValue();
			req.setAttribute("fname", fName);
			RequestDispatcher rd = req.getRequestDispatcher("EditProfile.jsp");
			rd.forward(req, res);
		}
	}
}
