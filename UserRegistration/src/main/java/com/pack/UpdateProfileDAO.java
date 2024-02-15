package com.pack;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProfileDAO 
{
	public int k=0;
	public int update(UserBean ub)
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement
					("update user57 set ADDR=?, MAILID=?, PHN=? where UNAME=? and PWORD=?");
			ps.setString(1,ub.getuAddr() );
			ps.setString(2, ub.getuMailId());
			ps.setLong(3, ub.getuPhno());
			ps.setString(4, ub.getuName());
			ps.setString(5, ub.getuPword());
			
			k= ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return k;
	}
}
