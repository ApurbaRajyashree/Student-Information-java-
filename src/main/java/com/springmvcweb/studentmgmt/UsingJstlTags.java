package com.springmvcweb.studentmgmt;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvcweb.studentmgmt.models.Student;
import com.springmvcweb.studentmgmt.services.StudentService;

@Controller
public class UsingJstlTags {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping( value="/showjstlpage" , method= RequestMethod.GET)
	public String showjstlpage(ModelMap model) {
		
		model.addAttribute("using", "ModelMap");
		model.addAttribute("slist",studentService.getAllStudents());
		return "defaultjstl";
	}
	
	@RequestMapping( value="/showaddstudent" , method= RequestMethod.GET)
	public String showAddStudentForm() {
		return "addstudent";
	}
	
	@RequestMapping(value="/addstudentusingsevlet" , method=RequestMethod.POST)
	public String addStudentUsingHttpRequestSevlet(HttpServletRequest request, Model model) {
		Student student= new Student();
		student.setStudentId(new Random().nextInt());
		student.setFirstName(request.getParameter("firstName").toString());
		student.setLastName(request.getParameter("lastName").toString());
		student.setGender(request.getParameter("gender").toString());
		student.setMobileNo(request.getParameter("mobileNo").toString());
		student.setEmail(request.getParameter("email").toString());
		
		studentService.addStudent(student);
		
		model.addAttribute("using", "HttpRequestSevlet");
		model.addAttribute("slist",studentService.getAllStudents());
		return "defaultjstl";
	}
	
	@RequestMapping(value="/addstudentusingrequestparam" , method=RequestMethod.POST)
	public String addStudentUsingRequestParam(@RequestParam("firstName")String firstName,
			@RequestParam("lastName")String lastName,
			@RequestParam("gender")String gender,
			@RequestParam("mobileNo")String mobileNo,
			@RequestParam("email")String email,
			Model model) {
		
		Student student= new Student();
		student.setStudentId(new Random().nextInt());
		
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setGender(gender);
		student.setMobileNo(mobileNo);
		student.setEmail(email);		
		studentService.addStudent(student);
		
		model.addAttribute("using", "Request Param");
		model.addAttribute("slist",studentService.getAllStudents());
		return "defaultjstl";
	}
	
	@RequestMapping(value="/addstudentusingmodelattribute" , method=RequestMethod.POST)
	public String addStudentUsingModelAttribute(@ModelAttribute Student student, Model model) {
		
		student.setStudentId(new Random().nextInt());
		
		studentService.addStudent(student);
		
		model.addAttribute("using", "ModelAttribute");
		model.addAttribute("slist",studentService.getAllStudents());
		return "defaultjstl";
	}
}
