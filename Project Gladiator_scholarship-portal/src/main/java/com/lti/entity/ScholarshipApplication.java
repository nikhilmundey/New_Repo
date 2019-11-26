package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="SCHOLARSHIP_APPLICATION_FORM")
public class ScholarshipApplication {
	
	@Id
	@GeneratedValue
	@Column(name="APPLICATION_ID")
	private int applicationId;
	
	
	@Column(name="REASON")
	private String reason;
	
	@OneToOne
	@JoinColumn(name="STUDENT_ID")
	private StudentReg student;
	
	@OneToOne
	@JoinColumn(name="STATUS_ID")
	private Status status;
	
	@OneToOne 
	@JoinColumn(name="SCHEME_ID")
	private Scheme scheme;

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public StudentReg getStudent() {
		return student;
	}

	public void setStudent(StudentReg student) {
		this.student = student;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Scheme getScheme() {
		return scheme;
	}

	public void setScheme(Scheme scheme) {
		this.scheme = scheme;
	}
	

	
}