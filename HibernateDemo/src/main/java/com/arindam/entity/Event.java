package com.arindam.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Event {
	@Id
	@Column(length = 10)
private String evid;
	@Column(length = 25)
private String evnm;
	@ManyToMany
	@JoinTable(
			name="event_delegate",
			joinColumns= @JoinColumn(name="evid"),
			 inverseJoinColumns = @JoinColumn(name="delgid"))
private List<Delegate> delegates;
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Event(String evid, String evnm, List<Delegate> delegates) {
		super();
		this.evid = evid;
		this.evnm = evnm;
		this.delegates = delegates;
	}
	public String getEvid() {
		return evid;
	}
	public void setEvid(String evid) {
		this.evid = evid;
	}
	public String getEvnm() {
		return evnm;
	}
	public void setEvnm(String evnm) {
		this.evnm = evnm;
	}
	public List<Delegate> getDelegates() {
		return delegates;
	}
	public void setDelegates(List<Delegate> delegates) {
		this.delegates = delegates;
	}
	@Override
	public String toString() {
		return "Event [evid=" + evid + ", evnm=" + evnm + ", delegates=" + delegates + "]";
	}

}
