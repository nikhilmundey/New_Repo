package com.lti.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.entity.Institute;
import com.lti.entity.StudentReg;
import com.lti.repository.GenericDao;
import com.lti.repository.InstituteDao;


public class InstituteTest {
	@Test
	public void addInstituteTest() {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericDao gdao=(GenericDao) ctx.getBean(GenericDao.class);
		Institute inst = new Institute();
		inst.setInstituteCategory("abc");
		inst.setInstituteName("bbd");
		inst.setInstituteDISECode(123);
		inst.setUniversityName("sgbau");
		inst.setInstitutePass("aa");
		inst.setInstituteEstbCert("hjgjasdg");
		inst.setInstituteAffCert("gdqgd");
		inst.setInstituteLoc("akola");
		inst.setInstituteCity("Pune");
		inst.setInstituteState("dfhf");
		inst.setInstitutePincode(444001);
		inst.setStautsId("approved");
		
		gdao.add(inst);
	
	}
	
	@Test
	public void showStudentByInstituteCode(){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		InstituteDao fet=(InstituteDao) ctx.getBean("rep");
		List<StudentReg> stud=fet.fetchStudentByInstituteCode(701);
		for (StudentReg studentReg : stud) {
			
			System.out.println(studentReg.getStudentName());
		}
		
	}
}