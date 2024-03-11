package com.learning.core.day5;

public class Student
{ String name;
  long phoneno;
  String passportNo;
  int licenseNo;
  String panCardNo;
  int voterid;
  
  public Student(String name, long phoneno, int licenseNo, int voterid) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.licenseNo = licenseNo;
		this.voterid = voterid;
	}
  public Student(String name, long phoneno, int licenseNo, String panCardNo) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.licenseNo = licenseNo;
		this.panCardNo = panCardNo;
	}
   public Student(String name, long phoneno, String passportNo) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.passportNo = passportNo;
	}
@Override
public String toString() {
	return "Student [name=" + name + ", phoneno=" + phoneno + ", passportNo=" + passportNo + ", licenseNo=" + licenseNo
			+ ", panCardNo=" + panCardNo + ", voterid=" + voterid + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
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
  
  

}