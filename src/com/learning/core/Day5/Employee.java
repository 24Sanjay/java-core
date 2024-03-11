package com.learning.core.day5;

public class Employee 
{  String name;
   long phoneNo;
   String passportNo;
   int licenseNo;
   String panCardNo;
   int voterid;
   int employeeid;
   
   public Employee(String name, long phoneNo, int licenseNo, int voterid, int employeeid) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.licenseNo = licenseNo;
		this.voterid = voterid;
		this.employeeid = employeeid;
	}
public Employee(String name, long phoneNo, int licenseNo, String panCardNo, int employeeid) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.licenseNo = licenseNo;
		this.panCardNo = panCardNo;
		this.employeeid = employeeid;
	}
public Employee(String name, long phoneNo, String passportNo, int employeeid) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.passportNo = passportNo;
		this.employeeid = employeeid;
	}
@Override
public String toString() {
	return "Employee [name=" + name + ", phoneNo=" + phoneNo + ", passportNo=" + passportNo + ", licenseNo=" + licenseNo
			+ ", panCardNo=" + panCardNo + ", voterid=" + voterid + ", employeeid=" + employeeid + super.toString() + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}
public String getPassportNo() {
	return passportNo;
}
public void setPassportNo(String passportNo) {
	this.passportNo = passportNo;
}
public int getLicenseNo() {
	return licenseNo;
}
public void setLicenseNo(int licenseNo) {
	this.licenseNo = licenseNo;
}
public String getPanCardNo() {
	return panCardNo;
}
public void setPanCardNo(String panCardNo) {
	this.panCardNo = panCardNo;
}
public int getVoterid() {
	return voterid;
}
public void setVoterid(int voterid) {
	this.voterid = voterid;
}
public int getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
}
   
   
}
