package com;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentAdmissionController {
	
	// constraint on Mobile No to hide when display all of the Client information.
	// Customizing and binding  Date of Birth by using Property Editor class.
	// If Student forget to write Mr/Ms before entering name then it will add Ms. 
	// by default. This code is written in StudentNameEditor class which is extended from PropertyEditorSupport class.
	
	@InitBinder
	public void initbinder(WebDataBinder binder){
		
		binder.setDisallowedFields(new String []{"studentMobile"});
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy***MM**dd");
		binder.registerCustomEditor(Date.class, "birthDate", new CustomDateEditor(dateFormat,false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
		
	}
	
	@RequestMapping(value="/admission.html", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		
		ModelAndView mv= new ModelAndView("AdmissionForm");
		
		return mv;
	}
	
	// *BindingResults= if any error occurs when Student enter the data then BindingResult will return "Admission Form" page with Error Message.
	
	@RequestMapping(value="/submitAdmissionForm.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student") Student student, BindingResult result){
		
		if(result.hasErrors()){
			ModelAndView model= new ModelAndView("AdmissionForm");
			return model;	
		}
		
		ModelAndView mv= new ModelAndView("SubmitForm");
		
		return mv;
	}
	
	@ModelAttribute
	public void addingModelObjects(Model model){
		
		model.addAttribute("modelmessage", "Please Enter your data : ");
	}

	
}
