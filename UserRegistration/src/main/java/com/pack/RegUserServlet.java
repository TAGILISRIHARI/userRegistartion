package com.pack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/registerUser")
public class RegUserServlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
	{
		UserBean ub = new UserBean();
		ub.setuName(req.getParameter("uName"));
		ub.setuPword(req.getParameter("uPassword"));
		ub.setfName(req.getParameter("ufName"));
		ub.setlName(req.getParameter("ulName"));
		ub.setuAddr(req.getParameter("uAddr"));
		ub.setuMailId(req.getParameter("uMailId"));
		ub.setuPhno(Long.parseLong(req.getParameter("uPhnNo")));
		
		 int k = new RegUserDAO().register(ub);
		 if(k>0)
		 {
			 req.setAttribute("msg", "Registration was sucess");
			 RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
			 rd.forward(req, res);
		 }
	}
}
