package com.arindam.bean;

public class Student {
private String rollno;
private String sname;
private String dept;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String rollno, String sname, String dept) {
	super();
	this.rollno = rollno;
	this.sname = sname;
	this.dept = dept;
}
public String getRollno() {
	return rollno;
}
public void setRollno(String rollno) {
	this.rollno = rollno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", sname=" + sname + ", dept=" + dept + "]";
}

}
