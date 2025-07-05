package com.arindam.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix = "myapp")
public class Employee {
private String eid;
private String ename;
private String desig;
private List<String> colleagues;
private Set<String> phno;
private Map<String,Integer> strengths;
private Properties clients;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String eid, String ename, String desig, List<String> colleagues, Set<String> phno,
		Map<String, Integer> strengths, Properties clients) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.desig = desig;
	this.colleagues = colleagues;
	this.phno = phno;
	this.strengths = strengths;
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
public String getDesig() {
	return desig;
}
public void setDesig(String desig) {
	this.desig = desig;
}
public List<String> getColleagues() {
	return colleagues;
}
public void setColleagues(List<String> colleagues) {
	this.colleagues = colleagues;
}
public Set<String> getPhno() {
	return phno;
}
public void setPhno(Set<String> phno) {
	this.phno = phno;
}
public Map<String, Integer> getStrengths() {
	return strengths;
}
public void setStrengths(Map<String, Integer> strengths) {
	this.strengths = strengths;
}
public Properties getClients() {
	return clients;
}
public void setClients(Properties clients) {
	this.clients = clients;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", desig=" + desig + ", colleagues=" + colleagues + ", phno="
			+ phno + ", strengths=" + strengths + ", clients=" + clients + "]";
}

}
