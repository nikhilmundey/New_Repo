package com.lti.test;

import java.time.LocalDate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.entity.StudentAcademic;
import com.lti.entity.StudentBankDetails;
import com.lti.entity.StudentBasicDetails;
import com.lti.entity.StudentDocument;
import com.lti.entity.StudentReg;
import com.lti.repository.GenericDao;

public class TestStudentDetails {

	@Test
	public void addBankDetails()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericDao gdao=(GenericDao) ctx.getBean(GenericDao.class);
		StudentReg  studentReg= (StudentReg) gdao.fetchById(StudentReg.class,723 );
		
		StudentBankDetails studentBank = new StudentBankDetails();
		studentBank.setAccountNo(1000000007887878d);
		studentBank.setBankDetailId(111);
		studentBank.setBankName("HDFC");
		studentBank.setIfscCode("HDFC111");
		
		
		studentBank.setStudentReg(studentReg);
		gdao.add(studentBank);
	
	}
	
	@Test
	public void addBasicDetails()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericDao gdao=(GenericDao) ctx.getBean(GenericDao.class);
		StudentReg  studentReg= (StudentReg) gdao.fetchById(StudentReg.class,723 );
		
		StudentBasicDetails studentBasic = new StudentBasicDetails();
		studentBasic.setCity("Mumbai");
		studentBasic.setCommunity("Gujrati");
		studentBasic.setReligion("Hindu");
		studentBasic.setFatherName("FatherName1");
		studentBasic.setMotherName("MotherName1");
		studentBasic.setIsDisabled("No");
		studentBasic.setTypeOfDisability("NA");
		studentBasic.setFatherProfession("Prof1");
		studentBasic.setMotherProfession("Prof1");
		studentBasic.setFatherIncome(5050000);
		studentBasic.setMaritalStatus("Unmarried");
		studentBasic.setLocality("Koperkhairane");
		studentBasic.setState("Maharashtra");
		studentBasic.setPincode(400704);
	
		studentBasic.setStudentReg(studentReg);
		gdao.add(studentBasic);
	}
	
	@Test
	public void addAcademicDetails()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericDao gdao=(GenericDao) ctx.getBean(GenericDao.class);
		StudentReg  studentReg= (StudentReg) gdao.fetchById(StudentReg.class,723 );
		
		StudentAcademic studentAcademic = new StudentAcademic();
		//studentAcademic.setInstituteName("inst1");
		studentAcademic.setPresentCourse("Course1");
		studentAcademic.setPresentCourseYear(2019);
		studentAcademic.setModeOfStudy("Fulltime");
		studentAcademic.setClassStartDate(LocalDate.of(2018, 01, 01));
		studentAcademic.setUniversityName("uni 1");
		studentAcademic.setPresentCourse("previous course1");
		studentAcademic.setPreviousPassingYear(2017);
		studentAcademic.setRollNoTenth("Tenth111");
		studentAcademic.setBoardNameTenth("SSC");
		studentAcademic.setPassingYearTenth(2015);
		studentAcademic.setMarksTenth(90);
		studentAcademic.setRollNoTwelth("Twelth111");
		studentAcademic.setBoardNameTwelth("HSC");
		studentAcademic.setPassingYearTwelth(2017);
		studentAcademic.setMarksTwelth(80);
		studentAcademic.setAdmissionFee(600000);
		studentAcademic.setTuitionFee(50000);
		studentAcademic.setOtherFee(500);
		
		studentAcademic.setStudentReg(studentReg);
		gdao.add(studentAcademic);

	}
	
	@Test
	public void addDocument(){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericDao gdao=(GenericDao) ctx.getBean(GenericDao.class);
		StudentReg  studentReg= (StudentReg) gdao.fetchById(StudentReg.class,723);
		
		StudentDocument studentDocument = new StudentDocument();
		studentDocument.setDomicileCertificate("domicileCertificate");
		studentDocument.setStudentPhotograph("studentPhotograph");
		studentDocument.setInstituteIdCard("instituteIdCard");
		studentDocument.setCasteCertificate("casteCertificate");
		studentDocument.setPreviousYearMarksheet("previousYearMarksheet");
		studentDocument.setFeeReceipt("feeReceipt");
		studentDocument.setBankPassbook("bankPassbook");
		studentDocument.setAadharCard("aadharCard");
		studentDocument.setClassTenthMarksheet("classTenthMarksheet");
		studentDocument.setClassTwelthMarksheet("classTwelthMarksheet");
	    
		studentDocument.setStudentReg(studentReg);
		gdao.add(studentDocument);
	}
}
