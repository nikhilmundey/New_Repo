package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="STUDENT_ACADEMIC")
public class StudentAcademic {

	@Id
	@GeneratedValue
	@Column(name="ID")
	private int academicId;
	
//	@Column(name="INSTITUTE_NAME")
//	private String instituteName;
	
	@Column(name="PRESENT_COURSE")
	private String presentCourse;
	
	@Column(name="PRESENT_COURSE_YEAR")
	private int presentCourseYear;
	
	@Column(name="MODE_OF_STUDY")
	private String modeOfStudy;
	
	@Column(name="CLASS_START_DATE")
	private LocalDate classStartDate;
	
	@Column(name="UNIVERSITY_NAME")
	private String universityName;
	
	@Column(name="PREVIOUS_COURSE")
	private String previousCourse;
	
	@Column(name="PREVIOUS_PASSING_YEAR")
	private int previousPassingYear;
	
	@Column(name="ROLL_NO_10")
	private String rollNoTenth;
	
	@Column(name="BOARD_NAME_10")
	private String boardNameTenth;
	
	@Column(name="PASSING_YEAR_10")
	private int passingYearTenth;
	
	@Column(name="MARKS_10")
	private int marksTenth;
	
	@Column(name="ROLL_NO_12")
	private String rollNoTwelth;
	
	@Column(name="BOARD_NAME_12")
	private String boardNameTwelth;

	@Column(name="PASSING_YEAR_12")
	private int passingYearTwelth;
	
	@Column(name="MARKS_12")
	private int marksTwelth;
	
	@Column(name="ADMISSION_FEE")
	private double admissionFee;
	
	@Column(name="TUTION_FEE")
	private double tuitionFee;
	
	@Column(name="OTHER_FEE")
	private double otherFee;

	@OneToOne
	@JoinColumn(name="STUDENT_ID")
	private StudentReg studentReg;
	
	public StudentReg getStudentReg() {
		return studentReg;
	}

	public void setStudentReg(StudentReg studentReg) {
		this.studentReg = studentReg;
	}

	public int getAcademicId() {
		return academicId;
	}

	public void setAcademicId(int academicId) {
		this.academicId = academicId;
	}

//	public String getInstituteName() {
//		return instituteName;
//	}
//
//	public void setInstituteName(String instituteName) {
//		this.instituteName = instituteName;
//	}

	public String getPresentCourse() {
		return presentCourse;
	}

	public void setPresentCourse(String presentCourse) {
		this.presentCourse = presentCourse;
	}

	public int getPresentCourseYear() {
		return presentCourseYear;
	}

	public void setPresentCourseYear(int presentCourseYear) {
		this.presentCourseYear = presentCourseYear;
	}

	public String getModeOfStudy() {
		return modeOfStudy;
	}

	public void setModeOfStudy(String modeOfStudy) {
		this.modeOfStudy = modeOfStudy;
	}

	public LocalDate getClassStartDate() {
		return classStartDate;
	}

	public void setClassStartDate(LocalDate classStartDate) {
		this.classStartDate = classStartDate;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getPreviousCourse() {
		return previousCourse;
	}

	public void setPreviousCourse(String previousCourse) {
		this.previousCourse = previousCourse;
	}

	public int getPreviousPassingYear() {
		return previousPassingYear;
	}

	public void setPreviousPassingYear(int previousPassingYear) {
		this.previousPassingYear = previousPassingYear;
	}

	public String getRollNoTenth() {
		return rollNoTenth;
	}

	public void setRollNoTenth(String rollNoTenth) {
		this.rollNoTenth = rollNoTenth;
	}

	public String getBoardNameTenth() {
		return boardNameTenth;
	}

	public void setBoardNameTenth(String boardNameTenth) {
		this.boardNameTenth = boardNameTenth;
	}

	public int getPassingYearTenth() {
		return passingYearTenth;
	}

	public void setPassingYearTenth(int passingYearTenth) {
		this.passingYearTenth = passingYearTenth;
	}

	public int getMarksTenth() {
		return marksTenth;
	}

	public void setMarksTenth(int marksTenth) {
		this.marksTenth = marksTenth;
	}

	public String getRollNoTwelth() {
		return rollNoTwelth;
	}

	public void setRollNoTwelth(String rollNoTwelth) {
		this.rollNoTwelth = rollNoTwelth;
	}

	public String getBoardNameTwelth() {
		return boardNameTwelth;
	}

	public void setBoardNameTwelth(String boardNameTwelth) {
		this.boardNameTwelth = boardNameTwelth;
	}

	public int getPassingYearTwelth() {
		return passingYearTwelth;
	}

	public void setPassingYearTwelth(int passingYearTwelth) {
		this.passingYearTwelth = passingYearTwelth;
	}

	public int getMarksTwelth() {
		return marksTwelth;
	}

	public void setMarksTwelth(int marksTwelth) {
		this.marksTwelth = marksTwelth;
	}

	public double getAdmissionFee() {
		return admissionFee;
	}

	public void setAdmissionFee(double admissionFee) {
		this.admissionFee = admissionFee;
	}

	public double getTuitionFee() {
		return tuitionFee;
	}

	public void setTuitionFee(double tuitionFee) {
		this.tuitionFee = tuitionFee;
	}

	public double getOtherFee() {
		return otherFee;
	}

	public void setOtherFee(double otherFee) {
		this.otherFee = otherFee;
	}
	
	
}
	