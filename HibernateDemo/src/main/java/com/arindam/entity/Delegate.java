package com.arindam.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Delegate {
	@Id
	@Column(length = 10)
private String delgid;
	@Column(length = 25)
private String delgnm;
	public Delegate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Delegate(String delgid, String delgnm) {
		super();
		this.delgid = delgid;
		this.delgnm = delgnm;
	}
	public String getDelgid() {
		return delgid;
	}
	public void setDelgid(String delgid) {
		this.delgid = delgid;
	}
	public String getDelgnm() {
		return delgnm;
	}
	public void setDelgnm(String delgnm) {
		this.delgnm = delgnm;
	}
	@Override
	public String toString() {
		return "Delegate [delgid=" + delgid + ", delgnm=" + delgnm + "]";
	}
	
}
