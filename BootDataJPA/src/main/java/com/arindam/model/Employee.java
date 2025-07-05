package com.arindam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@Column(length = 10)
private String eid;
	@Column(length = 25)
private String ename;
	@Column(length = 25)
private String desig;
	@Column(length = 25)
private String deptnm;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String eid, String ename, String desig, String deptnm) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.desig = desig;
		this.deptnm = deptnm;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getDeptnm() {
		return deptnm;
	}
	public void setDeptnm(String deptnm) {
		this.deptnm = deptnm;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", desig=" + desig + ", deptnm=" + deptnm + "]";
	}
	
}
