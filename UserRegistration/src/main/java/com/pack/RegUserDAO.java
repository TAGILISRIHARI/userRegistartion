package com.pack;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegUserDAO 
{
	public int k=0;
	public int register(UserBean ub)
	{
		try 
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into user57 values(?,?,?,?,?,?,?)");
			ps.setString(1, ub.getuName());
			ps.setString(2, ub.getuPword());
			ps.setString(3, ub.getfName());
			ps.setString(4, ub.getlName());
			ps.setString(5, ub.getuAddr());
			ps.setString(6, ub.getuMailId());
			ps.setLong(7, ub.getuPhno());
			k=ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return k;
	}

}
