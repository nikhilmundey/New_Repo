package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_BASIC_DETAILS")
public class StudentBasicDetails {

	@Id
	@GeneratedValue
	@Column(name="ID")
	private int basicDetailId;
	
	@Column(name="COMMUNITY")
	private String community;
	
	@Column(name="RELIGION")
	private String religion;
	
	@Column(name="FATHER_NAME")
	private String fatherName;
	
	@Column(name="MOTHER_NAME")
	private String motherName;
	
	@Column(name="IS_DISABLED")
	private String isDisabled;
	
	@Column(name="TYPE_OF_DISABILITY")
	private String typeOfDisability;
	
	@Column(name="FATHER_PROFESSION")
	private String fatherProfession;
	
	@Column(name="MOTHER_PROFESSION")
	private String motherProfession;
	
	@Column(name="FATHER_INCOME")
	private double fatherIncome;
	
	@Column(name="MARITAL_STATUS")
	private String maritalStatus;
	
	@Column(name="LOCALITY")
	private String locality;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="PINCODE")
	private int pincode;
	
	@OneToOne
	@JoinColumn(name="STUDENT_ID")
	private StudentReg studentReg;


	public StudentReg getStudentReg() {
		return studentReg;
	}

	public void setStudentReg(StudentReg studentReg) {
		this.studentReg = studentReg;
	}

	public int getBasicDetailId() {
		return basicDetailId;
	}

	public void setBasicDetailId(int basicDetailId) {
		this.basicDetailId = basicDetailId;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getIsDisabled() {
		return isDisabled;
	}

	public void setIsDisabled(String isDisabled) {
		this.isDisabled = isDisabled;
	}

	public String getTypeOfDisability() {
		return typeOfDisability;
	}

	public void setTypeOfDisability(String typeOfDisability) {
		this.typeOfDisability = typeOfDisability;
	}

	public String getFatherProfession() {
		return fatherProfession;
	}

	public void setFatherProfession(String fatherProfession) {
		this.fatherProfession = fatherProfession;
	}

	public String getMotherProfession() {
		return motherProfession;
	}

	public void setMotherProfession(String motherProfession) {
		this.motherProfession = motherProfession;
	}

	public double getFatherIncome() {
		return fatherIncome;
	}

	public void setFatherIncome(double fatherIncome) {
		this.fatherIncome = fatherIncome;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}