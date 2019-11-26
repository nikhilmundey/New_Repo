package com.lti.controller;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.lti.entity.Institute;
import com.lti.entity.Scheme;
import com.lti.entity.ScholarshipApplication;
import com.lti.entity.StudentAcademic;
import com.lti.entity.StudentBankDetails;
import com.lti.entity.StudentBasicDetails;
import com.lti.entity.StudentDocument;
import com.lti.entity.StudentReg;
import com.lti.service.StudentService;

@Controller
@SessionAttributes("student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@RequestMapping(path = "studentregister.lti", method = RequestMethod.POST) // register a new student
	public String register(StudentReg studentReg,@RequestParam("sdob") String bdt )
	{
		
		LocalDate studentDOB = LocalDate.parse(bdt);     
		studentReg.setStudentDOB(studentDOB);          
		studentService.register(studentReg);
		return "home.jsp";
	}

	
	@RequestMapping(path="ss.lti",method=RequestMethod.POST) //login function for email n password
	public String studentLogin(
			@RequestParam("studentEmail") String studentEmail, 
			@RequestParam("studentPassword") String studentPassword,
			ModelMap model){


		StudentReg studentReg=studentService.checkLogin(studentEmail, studentPassword); //check login
		if(studentReg != null) {
			model.put("student", studentReg);
			return "afterlogin.jsp";
		}
		else {
			 model.put("message", "Invalid username/password");
			 return "studentlogin.jsp";
		 }
	}
	
	@RequestMapping(path = "studentbasic.lti", method = RequestMethod.POST) //add basic details
	public String addBasic(StudentBasicDetails studBasic, ModelMap model)
	{    
		StudentReg s=(StudentReg) model.get("student");
		studBasic.setStudentReg(s);
		
		studentService.addStudentBasic(studBasic);
		return "studAcademic.jsp";
	}
	
	@RequestMapping(path = "studentacademic.lti", method = RequestMethod.POST) // add academic details
	public String addAcademic(StudentAcademic studAcademic,@RequestParam("csd") String cd, ModelMap model)
	{
		StudentReg s=(StudentReg) model.get("student");
		studAcademic.setStudentReg(s);
		
	
		LocalDate classStartDate = LocalDate.parse(cd);    
		studAcademic.setClassStartDate(classStartDate); 
		
		studentService.addAcademic(studAcademic);
		return "bank.jsp";
	}
	
	
	@RequestMapping(path = "studentbank.lti", method = RequestMethod.POST)//add bank details
	public String addBank(StudentBankDetails studBank, ModelMap model)
	{   
		StudentReg s=(StudentReg) model.get("student");
		studBank.setStudentReg(s);
		studentService.addBank(studBank);
		return "stdDoc.jsp";
	}
	
	@RequestMapping(path = "studentdoc.lti", method = RequestMethod.POST)//upload doc
	public String addDoc(StudentDocument studDoc, ModelMap model, 
			@RequestParam("domicileCertificatefile") MultipartFile dom, 
			@RequestParam("studentPhotographfile") MultipartFile sp, 
			@RequestParam("instituteIdCardfile") MultipartFile Iicard, 
			@RequestParam("casteCertificatefile") MultipartFile caste, 
			@RequestParam("previousYearMarksheetfile") MultipartFile prevMarksheet, 
			@RequestParam("feeReceiptfile") MultipartFile fee,
			@RequestParam("bankPassbookfile") MultipartFile bank,
			@RequestParam("aadharCardfile") MultipartFile aadhar,
			@RequestParam("classTenthMarksheetfile") MultipartFile ten,
			@RequestParam("classTwelthMarksheetfile") MultipartFile twelth)
	{        
		StudentReg s=(StudentReg) model.get("student");
		studDoc.setStudentReg(s);
		
		String path = "d:/docs/";
		String finalpath = path + dom.getOriginalFilename();
		String finalpath1 = path + sp.getOriginalFilename();
		String finalpath2 = path + Iicard.getOriginalFilename();
		String finalpath3 = path + caste.getOriginalFilename();
		
		String finalpath4 = path + prevMarksheet.getOriginalFilename();
		String finalpath5 = path + fee.getOriginalFilename();
		String finalpath6 = path + bank.getOriginalFilename();
		String finalpath7 = path + aadhar.getOriginalFilename();
		String finalpath8 = path + ten.getOriginalFilename();
		String finalpath9 = path + twelth.getOriginalFilename();
		
		try {
			dom.transferTo(new File(finalpath));
			sp.transferTo(new File(finalpath1));
			Iicard.transferTo(new File(finalpath2));
			caste.transferTo(new File(finalpath3));
			prevMarksheet.transferTo(new File(finalpath4));
			fee.transferTo(new File(finalpath5));
			bank.transferTo(new File(finalpath6));
			aadhar.transferTo(new File(finalpath7));
			ten.transferTo(new File(finalpath8));
			twelth.transferTo(new File(finalpath9));
			

		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		studDoc.setDomicileCertificate(dom.getOriginalFilename());
		studDoc.setStudentPhotograph(sp.getOriginalFilename());
		studDoc.setInstituteIdCard(Iicard.getOriginalFilename());
		studDoc.setCasteCertificate(caste.getOriginalFilename());
		studDoc.setPreviousYearMarksheet(prevMarksheet.getOriginalFilename());
		studDoc.setFeeReceipt(fee.getOriginalFilename());
		studDoc.setBankPassbook(bank.getOriginalFilename());
		studDoc.setAadharCard(aadhar.getOriginalFilename());
		studDoc.setClassTenthMarksheet(ten.getOriginalFilename());
		studDoc.setClassTwelthMarksheet(twelth.getOriginalFilename());
		studentService.addDoc(studDoc);
		return "applyForScheme.jsp";  // It should go to Apply for schemes page
	}
	
	@RequestMapping(path="schemelist.lti", method=RequestMethod.GET) //view dropdown of schemes
	public String getSchemeList(Map m){
		
	    List<Scheme> obj	= studentService.viewScheme();
	    	m.put("schemelist", obj);
	    	return "applyForScheme.jsp";
	    	
	    }
	
	
	@RequestMapping(path="selectscheme.lti", method= RequestMethod.POST) //select scheme
	public String selectScheme(@RequestParam("scheme.schemeId") int schemeId, ModelMap model,ScholarshipApplication apply)
	{
		StudentReg s=(StudentReg) model.get("student");
		System.out.println(s.getStudentId());
		System.out.println(schemeId);
		studentService.chooseScheme(apply);
		apply.setStudent(s);
		return "successfullyApplied.jsp";	
		
	}
}
