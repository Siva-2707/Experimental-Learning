package com.siva.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="member")
public class Member  {
	@Id
	private int id;
	private String name;
	private boolean isMembershipActive;
	
	  public Member(){
	  
	  }
	  
	  public Member(int id, String name, boolean isMembershipActive) { 
	  this.id = id;
	  this.name = name; 
	  this.isMembershipActive = isMembershipActive;
	  }
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMembershipActive() {
		return isMembershipActive;
	}
	public void setMembershipActive(boolean isMembershipActive) {
		this.isMembershipActive = isMembershipActive;
	}
	
	
}
