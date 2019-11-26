package com.lti.test;

import java.time.LocalDate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.ModelMap;

import com.lti.entity.Institute;
import com.lti.entity.Scheme;
import com.lti.entity.ScholarshipApplication;
import com.lti.entity.StudentBasicDetails;
import com.lti.entity.StudentReg;
import com.lti.repository.GenericDao;

public class StudentTest {

	@Test
	public void addStudent()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericDao gdao=(GenericDao) ctx.getBean(GenericDao.class);
		Institute ins= (Institute) gdao.fetchById(Institute.class,701 );

		StudentReg studentReg = new StudentReg();
		studentReg.setStudentaadhar(878787878787878L);
		studentReg.setStudentDistrict("Pune");
		studentReg.setStudentDOB(LocalDate.of(1997, 01, 01));
		studentReg.setStudentEmail("abc@yahoo.com");
		studentReg.setStudentGender("Male");
		studentReg.setStudentMobileNo(9090900990L);
		studentReg.setStudentName("Student1");
		studentReg.setStudentPassword("password1");
		studentReg.setStudentState("Maharashtra");
		studentReg.setInstitute(ins);
		gdao.add(studentReg);
	}
	

	@Test
	public void addStudentBasic()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericDao gdao=(GenericDao) ctx.getBean(GenericDao.class);
		//Institute ins= (Institute) gdao.fetchById(Institute.class,701 );
		StudentReg studentReg= (StudentReg) gdao.fetchById(StudentReg.class, 724 );

		StudentBasicDetails studBasic = new StudentBasicDetails();
		
		studBasic.setCommunity("Marathi");
		studBasic.setReligion("Hindu");
		studBasic.setFatherName("Dilip");
		studBasic.setMotherName("Varsha");
		studBasic.setIsDisabled("No");
		studBasic.setTypeOfDisability("NA");
		studBasic.setFatherProfession("Service");
		studBasic.setMotherProfession("Housemaker");
		studBasic.setFatherIncome(454554);
		studBasic.setMaritalStatus("Unmarried");
		studBasic.setLocality("Kothrud");
		studBasic.setCity("Pune");
		studBasic.setState("Maharashtra");
		studBasic.setPincode(444607);
		studBasic.setStudentReg(studentReg);
		gdao.add(studBasic);
	}
	

	@Test
	public void applyforscheme(ModelMap model)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericDao gdao=(GenericDao) ctx.getBean(GenericDao.class);
		Scheme scheme= (Scheme) gdao.fetchById(Scheme.class, 2 );
		StudentReg s=(StudentReg) gdao.fetchById(StudentReg.class, 1101);
		ScholarshipApplication sa = new ScholarshipApplication();
		sa.setReason("na");
		sa.setStudent(s);
		sa.setScheme(scheme);
		gdao.add(sa);
		
	}
		
	
}
