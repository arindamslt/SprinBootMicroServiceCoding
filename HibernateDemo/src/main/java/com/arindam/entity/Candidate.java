package com.arindam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Candidate {
	@Id
	@Column(length = 10)
private String candid;
	@Column(length = 25)
private String candnm;
	@OneToOne
	@JoinColumn(name="adhar_id")
private Adhar adh;
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidate(String candid, String candnm, Adhar adh) {
		super();
		this.candid = candid;
		this.candnm = candnm;
		this.adh = adh;
	}
	public String getCandid() {
		return candid;
	}
	public void setCandid(String candid) {
		this.candid = candid;
	}
	public String getCandnm() {
		return candnm;
	}
	public void setCandnm(String candnm) {
		this.candnm = candnm;
	}
	public Adhar getAdh() {
		return adh;
	}
	public void setAdh(Adhar adh) {
		this.adh = adh;
	}
	@Override
	public String toString() {
		return "Candidate [candid=" + candid + ", candnm=" + candnm + ", adh=" + adh + "]";
	}

}
