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
@WebServlet("/updateProfile")
public class UpdateProfileServlet extends HttpServlet 
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res )throws IOException,ServletException
	{
		Cookie c[] = req.getCookies();
		if(c==null)
		{
			req.setAttribute("msg", "Session expired Login Again");
			RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
			rd.forward(req, res);
		}
		else
		{
			ServletContext sct = req.getServletContext();
			UserBean ub = (UserBean)sct.getAttribute("ubean");
			
			ub.setuAddr(req.getParameter("uAddr"));
			ub.setuMailId(req.getParameter("uMailId"));
			ub.setuPhno(Long.parseLong(req.getParameter("uPhno")));
			
			int k = new UpdateProfileDAO().update(ub);
			String fName = c[0].getValue();
			req.setAttribute("fname", fName);
			
			if(k>0)
			{
				req.setAttribute("msg", "Profile updated sucessfully");
				RequestDispatcher rd = req.getRequestDispatcher("UpdateProfile.jsp");
				rd.forward(req, res);
						
			}
		}
	}
}
