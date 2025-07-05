package com.arindam.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value="emp")
public class Employee {
	@Value("${eid}")
private String eid;
	@Value("${ename}")
private String ename;
	@Value("${colleague}")
private List<String> colleague;
	@Value("${phno}")
private Set<String> phno;
	@Value("#{${strength}}")
private Map<String,Integer> strength;
	@Value("#{${clients}}")
private Properties clients;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String eid, String ename, List<String> colleague, Set<String> phno, Map<String, Integer> strength,
		Properties clients) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.colleague = colleague;
	this.phno = phno;
	this.strength = strength;
	this.clients = clients;
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
public List<String> getColleague() {
	return colleague;
}
public void setColleague(List<String> colleague) {
	this.colleague = colleague;
}
public Set<String> getPhno() {
	return phno;
}
public void setPhno(Set<String> phno) {
	this.phno = phno;
}
public Map<String, Integer> getStrength() {
	return strength;
}
public void setStrength(Map<String, Integer> strength) {
	this.strength = strength;
}
public Properties getClients() {
	return clients;
}
public void setClients(Properties clients) {
	this.clients = clients;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", colleague=" + colleague + ", phno=" + phno + ", strength="
			+ strength + ", clients=" + clients + "]";
}


}
