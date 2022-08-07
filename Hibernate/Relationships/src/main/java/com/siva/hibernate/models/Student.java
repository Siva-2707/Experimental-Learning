package com.siva.hibernate.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Student {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private int enrollmentId;
	private String name;
	
	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	@JoinColumn(name = "guide_id")
	private Guide guide;
	
	public Student(int enrollmentId, String name, Guide guide) {
		super();
		this.enrollmentId = enrollmentId;
		this.name = name;
		this.guide = guide;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEnrollmentId() {
		return enrollmentId;
	}
	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public Guide getGuide() {
		return guide;
	}


	public void setGuide(Guide guide) {
		this.guide = guide;
	}
	
	
	
}
