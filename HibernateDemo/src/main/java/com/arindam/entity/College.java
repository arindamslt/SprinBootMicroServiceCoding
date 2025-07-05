package com.arindam.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class College {
	@Id
	@Column(length = 10)
private String colgid;
	@Column(length = 25)
private String colgnm;
	@OneToMany
	@JoinColumn(name="colg_id")
private List<Student> students;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(String colgid, String colgnm, List<Student> students) {
		super();
		this.colgid = colgid;
		this.colgnm = colgnm;
		this.students = students;
	}
	public String getColgid() {
		return colgid;
	}
	public void setColgid(String colgid) {
		this.colgid = colgid;
	}
	public String getColgnm() {
		return colgnm;
	}
	public void setColgnm(String colgnm) {
		this.colgnm = colgnm;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "College [colgid=" + colgid + ", colgnm=" + colgnm + ", students=" + students + "]";
	}
	
}
