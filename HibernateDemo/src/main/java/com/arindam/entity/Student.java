package com.arindam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@Column(length =5)
private Integer rollno;
	@Column(length = 25)
private String sname;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(Integer rollno, String sname) {
	super();
	this.rollno = rollno;
	this.sname = sname;
}
public Integer getRollno() {
	return rollno;
}
public void setRollno(Integer rollno) {
	this.rollno = rollno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", sname=" + sname + "]";
}

}
