package com.arindam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Register {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;
	@Column(length = 25)
	private String name;
	@Column(length = 30)
	private String email;
	@Column(length = 100)
	private String pwd;
	private Long phno;
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Register(Integer cid, String name, String email, String pwd, Long phno) {
		super();
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.phno = phno;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Register [cid=" + cid + ", name=" + name + ", email=" + email + ", pwd=" + pwd + ", phno=" + phno + "]";
	}
	

}
