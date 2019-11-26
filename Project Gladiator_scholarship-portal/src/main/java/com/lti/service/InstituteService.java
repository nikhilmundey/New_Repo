package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Institute;
import com.lti.entity.StudentReg;
import com.lti.repository.GenericDao;
import com.lti.repository.InstituteDao;

@Service
public class InstituteService {

	@Autowired
	private GenericDao gdao;
	
	@Autowired
	private InstituteDao instituteDao;
	
	public void register(Institute institute){
		            
		gdao.add(institute);

	}

	public List <Institute> getinsdetail(){
		
		List<Institute> serobj = instituteDao.getinsdetail();
			return serobj;
	}


	public Institute checkLogin(int instituteCode, String password) {
		
		Institute institute=instituteDao.readLogin(instituteCode, password);
		return institute;

	}
	
	
	public List <StudentReg> viewApplicationsService(Institute i)
	{
		List<StudentReg> slist = instituteDao.readApplications(i);
		return slist;
	}

	public List<StudentReg> viewFullFormsService(Institute i) {
		List<StudentReg> flist = instituteDao.readApplications(i);
		return flist;
	}
	
	public StudentReg findStudentByStudentId(int studentId){
		return instituteDao.readStudentByStudentId(studentId);
	}
}
