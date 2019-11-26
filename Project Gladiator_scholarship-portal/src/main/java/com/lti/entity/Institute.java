package com.lti.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="INSTITUTE")
public class Institute {

	@Id
	@GeneratedValue
	@Column(name="INSTITUTE_CODE")
	private int instituteCode;
	
	@Column(name="INSTITUTE_CATEGORY")
	private String instituteCategory;
	
	@Column(name="INSTITUTE_NAME")
	private String instituteName;
	
	@Column(name="INSTITUTE_DISE_CODE")
	private int instituteDISECode;
	
	@Column(name="UNIVERSITY_NAME")
	private String universityName;
	
	@Column(name="INSTITUTE_PASSWORD")
	private String institutePass;
	
	@Column(name="INSTITUTE_ESTB_CERT")
	private String instituteEstbCert;
	
	@Column(name="INSTITUTE_AFF_CERT")
	private String instituteAffCert;
	
	@Column(name="INSTITUTE_LOCATION")
	private String instituteLoc;
	
	@Column(name="INSTITUTE_CITY")
	private String instituteCity;
	
	@Column(name="INSTITUTE_STATE")
	private String instituteState;
	
	@Column(name="INSTITUTE_PINCODE")
	private int institutePincode;
	
	@Column(name="STATUS_ID")
	private String stautsId;

	@OneToMany(mappedBy="institute", cascade=CascadeType.ALL)
	private List <StudentReg> students;
	
	public int getInstituteCode() {
		return instituteCode;
	}

	public void setInstituteCode(int instituteCode) {
		this.instituteCode = instituteCode;
	}

	public String getInstituteCategory() {
		return instituteCategory;
	}

	public void setInstituteCategory(String instituteCategory) {
		this.instituteCategory = instituteCategory;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public int getInstituteDISECode() {
		return instituteDISECode;
	}

	public void setInstituteDISECode(int instituteDISECode) {
		this.instituteDISECode = instituteDISECode;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getInstitutePass() {
		return institutePass;
	}

	public void setInstitutePass(String institutePass) {
		this.institutePass = institutePass;
	}

	public String getInstituteEstbCert() {
		return instituteEstbCert;
	}

	public void setInstituteEstbCert(String instituteEstbCert) {
		this.instituteEstbCert = instituteEstbCert;
	}

	public String getInstituteAffCert() {
		return instituteAffCert;
	}

	public void setInstituteAffCert(String instituteAffCert) {
		this.instituteAffCert = instituteAffCert;
	}

	public String getInstituteLoc() {
		return instituteLoc;
	}

	public void setInstituteLoc(String instituteLoc) {
		this.instituteLoc = instituteLoc;
	}

	public String getInstituteCity() {
		return instituteCity;
	}

	public void setInstituteCity(String instituteCity) {
		this.instituteCity = instituteCity;
	}

	public String getInstituteState() {
		return instituteState;
	}

	public void setInstituteState(String instituteState) {
		this.instituteState = instituteState;
	}

	public int getInstitutePincode() {
		return institutePincode;
	}

	public void setInstitutePincode(int institutePincode) {
		this.institutePincode = institutePincode;
	}

	public String getStautsId() {
		return stautsId;
	}

	public void setStautsId(String stautsId) {
		this.stautsId = stautsId;
	}

	public List<StudentReg> getStudents() {
		return students;
	}

	public void setStudents(List<StudentReg> students) {
		this.students = students;
	}

	
}