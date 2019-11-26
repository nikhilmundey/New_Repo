package com.lti.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.entity.Institute;
import com.lti.entity.StudentBankDetails;
import com.lti.entity.StudentReg;
import com.lti.repository.GenericDao;

public class TestBankDetails {

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
}
