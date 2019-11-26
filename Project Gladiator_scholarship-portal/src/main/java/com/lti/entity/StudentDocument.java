package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="STUDENT_DOCUMENT")
public class StudentDocument {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int docId;

	@Column(name="DOMICILE_CERTIFICATE")
	private String domicileCertificate;
	
	@Column(name="STUDENT_PHOTOGRAPH")
	private String studentPhotograph;
	
	@Column(name="INSTITUTE_ID_CARD")
	private String instituteIdCard;
	
	@Column(name="CASTE_CERTIFICATE")
	private String casteCertificate;
	
	@Column(name="PREVIOUS_YEAR_MARKSHEET")
	private String previousYearMarksheet;
	
	@Column(name="FEE_RECEIPT")
	private String feeReceipt;
	
	@Column(name="BANK_PASSBOOK")
	private String bankPassbook;
	
	@Column(name="AADHAR_CARD")
	private String aadharCard;
	
	@Column(name="CLASS_10_MARKSHEET")
	private String classTenthMarksheet;
	
	@Column(name="CLASS_12_MARKSHEET")
	private String classTwelthMarksheet;
	
	@OneToOne
	@JoinColumn(name="STUDENT_ID")
	private StudentReg studentReg;

	public StudentReg getStudentReg() {
		return studentReg;
	}

	public void setStudentReg(StudentReg studentReg) {
		this.studentReg = studentReg;
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getDomicileCertificate() {
		return domicileCertificate;
	}

	public void setDomicileCertificate(String domicileCertificate) {
		this.domicileCertificate = domicileCertificate;
	}

	public String getStudentPhotograph() {
		return studentPhotograph;
	}

	public void setStudentPhotograph(String studentPhotograph) {
		this.studentPhotograph = studentPhotograph;
	}

	public String getInstituteIdCard() {
		return instituteIdCard;
	}

	public void setInstituteIdCard(String instituteIdCard) {
		this.instituteIdCard = instituteIdCard;
	}

	public String getCasteCertificate() {
		return casteCertificate;
	}

	public void setCasteCertificate(String casteCertificate) {
		this.casteCertificate = casteCertificate;
	}

	public String getPreviousYearMarksheet() {
		return previousYearMarksheet;
	}

	public void setPreviousYearMarksheet(String previousYearMarksheet) {
		this.previousYearMarksheet = previousYearMarksheet;
	}

	public String getFeeReceipt() {
		return feeReceipt;
	}

	public void setFeeReceipt(String feeReceipt) {
		this.feeReceipt = feeReceipt;
	}

	public String getBankPassbook() {
		return bankPassbook;
	}

	public void setBankPassbook(String bankPassbook) {
		this.bankPassbook = bankPassbook;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getClassTenthMarksheet() {
		return classTenthMarksheet;
	}

	public void setClassTenthMarksheet(String classTenthMarksheet) {
		this.classTenthMarksheet = classTenthMarksheet;
	}

	public String getClassTwelthMarksheet() {
		return classTwelthMarksheet;
	}

	public void setClassTwelthMarksheet(String classTwelthMarksheet) {
		this.classTwelthMarksheet = classTwelthMarksheet;
	}
	
	
}