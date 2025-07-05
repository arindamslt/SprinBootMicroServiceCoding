package com.arindam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
	@Id
	@Column(length = 10)
private String compid;
	@Column(length = 25)
private String compnm;
	@Column(length = 25)
private String loc;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(String compid, String compnm, String loc) {
		super();
		this.compid = compid;
		this.compnm = compnm;
		this.loc = loc;
	}
	public String getCompid() {
		return compid;
	}
	public void setCompid(String compid) {
		this.compid = compid;
	}
	public String getCompnm() {
		return compnm;
	}
	public void setCompnm(String compnm) {
		this.compnm = compnm;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Company [compid=" + compid + ", compnm=" + compnm + ", loc=" + loc + "]";
	}
	

}
