package com.arindam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Job {
	@Id
	@Column(length = 10)
private String jobid;
	@Column(length = 25)
private String jobnm;
	
	@ManyToOne
	@JoinColumn(name="com_id")
private Company comp;
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Job(String jobid, String jobnm, Company comp) {
		super();
		this.jobid = jobid;
		this.jobnm = jobnm;
		this.comp = comp;
	}
	public String getJobid() {
		return jobid;
	}
	public void setJobid(String jobid) {
		this.jobid = jobid;
	}
	public String getJobnm() {
		return jobnm;
	}
	public void setJobnm(String jobnm) {
		this.jobnm = jobnm;
	}
	public Company getComp() {
		return comp;
	}
	public void setComp(Company comp) {
		this.comp = comp;
	}
	@Override
	public String toString() {
		return "Job [jobid=" + jobid + ", jobnm=" + jobnm + ", comp=" + comp + "]";
	}
	
	
}
