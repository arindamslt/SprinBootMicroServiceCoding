package com.arindam.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;

public class RegisterDto {
	@NotBlank(message="USERNAME IS MANDATORY")
private String uname;
	@NotBlank(message="PASSWORD IS MANDATORY")
private String pass;
	@NotBlank(message="NAME IS MANDATORY")
private String nm;
	@Email(message="EMAIL MUST BE VALID")
private String email;
	@NotBlank(message="PHONE NUMBER IS MANDATORY")
private String phno;
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getNm() {
	return nm;
}
public void setNm(String nm) {
	this.nm = nm;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}

}
