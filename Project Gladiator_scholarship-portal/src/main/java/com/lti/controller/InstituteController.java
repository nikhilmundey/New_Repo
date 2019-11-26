package com.lti.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.mail.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.lti.entity.Institute;
import com.lti.entity.StudentReg;
import com.lti.service.InstituteService;


@Controller
@SessionAttributes("institute")
public class InstituteController {

	
	@Autowired
	private InstituteService instituteService;

	@RequestMapping(path="register.lti",method=RequestMethod.POST)
		
	public String register(Institute institute, 
			@RequestParam("instituteEstbCertFile") MultipartFile esc, 
			@RequestParam("instituteAffCertFile") MultipartFile afc ){
		
			String path = "d:/upload/";
			String finalpath = path + esc.getOriginalFilename();
			String finalpath1 = path + afc.getOriginalFilename();

			
			try {
				esc.transferTo(new File(finalpath));
				afc.transferTo(new File(finalpath1));

			} 
			
			catch (IOException e) {
				e.printStackTrace();
			}
			
			institute.setInstituteEstbCert(esc.getOriginalFilename());
			institute.setInstituteAffCert(afc.getOriginalFilename());		
			
			
			instituteService.register(institute);
			return "home.jsp";
		}
	
	@RequestMapping(path="studentregister.lti", method=RequestMethod.GET)
	public String getInstDetails(Map m){
		
	    List<Institute> obj	= instituteService.getinsdetail();
	    	m.put("insdetails", obj);
	    	return "StudentRegister.jsp";
	    	
	    }
		
	@RequestMapping(path="institutelogin.lti",method=RequestMethod.POST)
	public String instituteLogin(
			@RequestParam("instituteCode") String instituteCode,
			@RequestParam("institutePass") String password,
			ModelMap model){
		
		try{
			 Institute institute=instituteService.checkLogin(Integer.parseInt(instituteCode), password);
			 model.put("institute", institute);
			 return "institutehome.jsp";
			 
		}
		catch (Exception e){
			
			model.put("message", "Invalid code/password");
			return "institutelogin.jsp";	
		}
}

//	@RequestMapping(path="view.lti", method=RequestMethod.GET)
//	public String viewApplications(@RequestParam("instituteCode")int instCode, ModelMap model)
//	{
//		Institute institute=(Institute) model.get("institute");
//		System.out.println("fdf");
//		List <StudentReg> list=instituteService.viewApplications(701);
//		model.put("slist", list);
//		return "viewApplication.jsp";
//	}
//}
		
	@RequestMapping(path="view.lti", method=RequestMethod.GET)
	public String viewApplications(ModelMap model)
	{
		Institute i=(Institute) model.get("institute");
		List<StudentReg> slist=instituteService.viewApplicationsService(i);
		model.addAttribute("slist", slist);
		return "viewApplication.jsp";
	}
	
	@RequestMapping(path="viewFullForm.lti", method=RequestMethod.GET)
	public String viewFullForms(ModelMap model)
	{
		Institute i=(Institute) model.get("institute");
		List<StudentReg> flist=instituteService.viewFullFormsService(i);
		model.addAttribute("flist", flist);
		return "viewFullForm.jsp";
	}
	
	@RequestMapping(path="viewStudentDetails.lti",method=RequestMethod.GET)
	public String viewFullDetails(@RequestParam("studentId") int studentId,Model model){
		
		StudentReg studentReg = instituteService.findStudentByStudentId(studentId);
		
		model.addAttribute("student", studentReg);
		return "fulldetailsForm.jsp";
	}
	
	
	//read Scholarship applicationfrom using student id
	
}