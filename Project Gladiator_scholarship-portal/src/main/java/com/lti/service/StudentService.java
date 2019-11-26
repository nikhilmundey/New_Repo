package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Institute;
import com.lti.entity.Scheme;
import com.lti.entity.ScholarshipApplication;
import com.lti.entity.StudentAcademic;
import com.lti.entity.StudentBankDetails;
import com.lti.entity.StudentBasicDetails;
import com.lti.entity.StudentDocument;
import com.lti.entity.StudentReg;
import com.lti.repository.GenericDao;
import com.lti.repository.StudentDao;

@Service
public class StudentService {

	@Autowired
	private GenericDao gdao;
	
	@Autowired
	private StudentDao studentdao;
	

	public void register(StudentReg studentReg) {
		studentReg.setStudentId(studentReg.getStudentId());
		gdao.add(studentReg);
	}

	public StudentReg checkLogin(String studentEmail, String studentPassword) {

		Long count = studentdao.readLogin(studentEmail, studentPassword);
		if(count == 1) {
			StudentReg studentReg = studentdao.readStudentDetails(studentEmail);
			return studentReg;
		}
		else {
			return null; //instead throw some exception
		}

	}

	public void addStudentBasic(StudentBasicDetails studentBasic) {
		gdao.add(studentBasic);
	}

	public void addAcademic(StudentAcademic studentAcademic) {

		gdao.add(studentAcademic);
	}

	public void addBank(StudentBankDetails studentBank) {

		gdao.add(studentBank);
	}

	public void addDoc(StudentDocument studentDoc) {

		gdao.add(studentDoc);
	}
	
	public List <Scheme> viewScheme(){
		
		List<Scheme> sobj = studentdao.readScheme();
			return sobj;
	}



	public void chooseScheme(ScholarshipApplication scholarshipApply) {
		gdao.add(scholarshipApply);
	}
}
