package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Institute;
import com.lti.entity.ScholarshipApplication;
import com.lti.entity.StudentReg;

@Repository
public class InstituteDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public List <StudentReg> fetchStudentByInstituteCode(int i){
		
		String ql="select s from StudentReg as s where s.institute=:inst";
		Query q =entityManager.createQuery(ql);
		q.setParameter("inst", i);
		List <StudentReg> students = q.getResultList();
		return students;
	}
	 
	@Transactional
	public List<Institute> getinsdetail(){      //dropdown of colleges on student application form
	
		String ql="select i from Institute i";
		Query q =entityManager.createQuery(ql);
		
		List<Institute> obj = q.getResultList();
				return obj;	
	}
	
	
	@Transactional
	public Institute readLogin(int instituteCode, String password){
		Query q = entityManager.createQuery("Select i from Institute i where i.instituteCode=:instituteCode and i.institutePass=:password");
		q.setParameter("instituteCode", instituteCode);
		q.setParameter("password", password);
		Institute institute = (Institute) q.getSingleResult();
		
		return institute;
		
	}
	
	@Transactional
	public List<StudentReg> readApplications(Institute i) //to view student id and name 
	{
		int icode= i.getInstituteCode();
		String sql="Select s from StudentReg s left join fetch s.studentAcademic left join fetch s.studentBankDetails left join fetch s.studentBasicDetails left join fetch s.studentDocumentDetails  where s.institute.instituteCode=:instCode";
		Query query=entityManager.createQuery(sql);
		query.setParameter("instCode", icode);
		List<StudentReg> slist = query.getResultList();
		return slist; 
	}
	
	public StudentReg readStudentByStudentId(int studentId){
		String sql="Select s from StudentReg s left join fetch s.studentAcademic left join fetch s.studentBankDetails left join fetch s.studentBasicDetails left join fetch s.studentDocumentDetails  where s.studentId=:studId";
		Query query=entityManager.createQuery(sql);
		query.setParameter("studId", studentId);
		StudentReg student = (StudentReg) query.getSingleResult();
		
		//StudentReg studentReg = entityManager.find(StudentReg.class, studentId);
		return student;
	}
	
//	@Transactional
//	public List<StudentReg> readEntireApplications(Institute i) // to view entire data of student 
//	{
//		int icode= i.getInstituteCode();
//		String sql="Select s from StudentReg s left join fetch s.studentAcademic left join fetch s.studentBankDetails left join fetch s.studentBasicDetails left join fetch s.studentDocumentDetails  where s.institute.instituteCode=:instCode";
//		Query query=entityManager.createQuery(sql);
//		query.setParameter("instCode", icode);
//		List<StudentReg> slist = query.getResultList();
//		return slist;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	//dheraj sir code
	
	
	
//	public int approveStudentApplicationFormStatus(int studentId){
//		
//		 select s from ScholarshipApplication s where s.studentId=:studId;
//		
//		//select s from ScholarshipApplication s inner join fetch s.student b where b.studentId = :studId;
//		Query.setParameter("studeId", studentId);
//		sholarshipApplication = query.getSingleResult();
//		
//		select s from status where s.statusName=:statusName;
//		Query.setParameter("statusName","APPROVED");
//		
//		scholarshipAppplication.setStatus()
//		
//		
//		return
//		
//		
//		
//	}
//	
//public int approveStudentApplicationFormStatus(int studentId){
//		
//		
//		ScholarshipApplication scholarshipApplication = ( 
//		
//		select s from ScholarshipApplication s inner join fetch s.student b where b.studentId = :studId;
//		Query
//		
//		
//		select s from status where statusID=:
//		return
//		
//		
//		
//	}
//	
}