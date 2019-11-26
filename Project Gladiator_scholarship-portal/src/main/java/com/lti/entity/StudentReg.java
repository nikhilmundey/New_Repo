package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="STUDENT_REG")
public class StudentReg {

	@Id
	@GeneratedValue
	@Column(name="STUDENT_ID")
	private int studentId;
	
	@Column(name="STUDENT_NAME")
	private String studentName;
	
	@Column(name="STUDENT_DOB")
	private LocalDate studentDOB;
	
	@Column(name="STUDENT_GENDER")
	private String studentGender;
	
	@Column(name="STUDENT_MOBILE_NO")
	private long studentMobileNo;
	
	@Column(name="STUDENT_EMAIL")
	private String studentEmail;
	
	@Column(name="STUDENT_AADHAR_NO")
	private long studentaadhar;
	
	@Column(name="STUDENT_PASSWORD")
	private String studentPassword;
	
	@Column(name="STUDENT_STATE")
	private String studentState;
	
	@Column(name="STUDENT_DISTRICT")
	private String studentDistrict;

	@ManyToOne
	@JoinColumn(name="INSTITUTE_CODE")
	private Institute institute;
	
	@OneToOne(mappedBy="studentReg")
	//@NotFound(action=NotFoundAction.IGNORE)
	private StudentAcademic studentAcademic;
	
	@OneToOne(mappedBy="studentReg")
	//@NotFound(action=NotFoundAction.IGNORE)

	private StudentBankDetails studentBankDetails;
	
	@OneToOne(mappedBy="studentReg")
	//@NotFound(action=NotFoundAction.IGNORE)

	private StudentBasicDetails studentBasicDetails;
	
	@OneToOne(mappedBy="studentReg")
	//@NotFound(action=NotFoundAction.IGNORE)

	private StudentDocument studentDocumentDetails;
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public LocalDate getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(LocalDate studentDOB) {
		this.studentDOB = studentDOB;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	
	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	
	public String getStudentState() {
		return studentState;
	}

	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}

	public String getStudentDistrict() {
		return studentDistrict;
	}

	public void setStudentDistrict(String studentDistrict) {
		this.studentDistrict = studentDistrict;
	}

	public long getStudentMobileNo() {
		return studentMobileNo;
	}

	public void setStudentMobileNo(long studentMobileNo) {
		this.studentMobileNo = studentMobileNo;
	}

	public long getStudentaadhar() {
		return studentaadhar;
	}

	public void setStudentaadhar(long studentaadhar) {
		this.studentaadhar = studentaadhar;
	}

	public Institute getInstitute() {
		return institute;
	}

	public void setInstitute(Institute institute) {
		this.institute = institute;
	}

	public StudentAcademic getStudentAcademic() {
		return studentAcademic;
	}

	public void setStudentAcademic(StudentAcademic studentAcademic) {
		this.studentAcademic = studentAcademic;
	}

	public StudentBankDetails getStudentBankDetails() {
		return studentBankDetails;
	}

	public void setStudentBankDetails(StudentBankDetails studentBankDetails) {
		this.studentBankDetails = studentBankDetails;
	}

	public StudentBasicDetails getStudentBasicDetails() {
		return studentBasicDetails;
	}

	public void setStudentBasicDetails(StudentBasicDetails studentBasicDetails) {
		this.studentBasicDetails = studentBasicDetails;
	}

	public StudentDocument getStudentDocumentDetails() {
		return studentDocumentDetails;
	}

	public void setStudentDocumentDetails(StudentDocument studentDocumentDetails) {
		this.studentDocumentDetails = studentDocumentDetails;
	}

	
}
