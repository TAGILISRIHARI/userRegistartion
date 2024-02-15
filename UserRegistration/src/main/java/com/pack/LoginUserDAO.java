package com.pack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginUserDAO 
{
	public UserBean ub=null;
	public UserBean login(String uName,String uPword)
	{
		try
		{
			//Creating COnnection
			Connection con = DBConnection.getCon();
			//Preparing Statement
			PreparedStatement ps = con.prepareStatement("select * from user57 where UNAME=? and PWORD=?");
			//Loading data into ResultSet
			ps.setString(1, uName);
			ps.setString(2, uPword);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				ub=new UserBean();
				ub.setuName(rs.getString(1));
				ub.setuPword(rs.getString(2));
				ub.setfName(rs.getString(3));
				ub.setlName(rs.getString(4));
				ub.setuAddr(rs.getString(5));
				ub.setuMailId(rs.getString(6));
				ub.setuPhno(rs.getLong(7));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ub;
	}
}
