package com.arindam.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myapp")
public class Product {
private String pid;
private String pname;
private Integer pqty;
private Double price;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(String pid, String pname, Integer pqty, Double price) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pqty = pqty;
	this.price = price;
}
public String getPid() {
	return pid;
}
public void setPid(String pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Integer getPqty() {
	return pqty;
}
public void setPqty(Integer pqty) {
	this.pqty = pqty;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", pqty=" + pqty + ", price=" + price + "]";
}

}
