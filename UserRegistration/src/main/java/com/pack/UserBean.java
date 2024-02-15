package com.pack;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserBean implements Serializable
{
	private String uName,uPword,fName,lName,uAddr,uMailId;
	private long uPhno;
	public UserBean() {}
	
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPword() {
		return uPword;
	}
	public void setuPword(String uPword) {
		this.uPword = uPword;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getuAddr() {
		return uAddr;
	}
	public void setuAddr(String uAddr) {
		this.uAddr = uAddr;
	}
	public String getuMailId() {
		return uMailId;
	}
	public void setuMailId(String uMailId) {
		this.uMailId = uMailId;
	}
	public long getuPhno() {
		return uPhno;
	}
	public void setuPhno(long uPhno) {
		this.uPhno = uPhno;
	}
	
	

}
