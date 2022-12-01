package com.springmvcweb.studentmgmt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvcweb.studentmgmt.services.StudentService;

@Controller
public class PassingDataFromControllerToView {
	
	@Autowired
	private StudentService studentService;
	
	
	   @RequestMapping(value="/", method= RequestMethod.GET)
		public String useModelDemo(Model model) {
		   List<String> slist = new ArrayList<String>();
		   slist.add("Ram");
		   slist.add("Gautam");
		   slist.add("Hari");
		   
		   model.addAttribute("types","Model");
		   model.addAttribute("studentId",1);
		   model.addAttribute("slist",studentService.getAllStudents());
		   
			return "index"; //view bhitra ko index.jsp khojxa
		}
	   
	   @RequestMapping(value="/modelmap", method= RequestMethod.GET)
	   public String useModelMap(ModelMap modelMap) {
		   List<String> slist = new ArrayList<String>();
		   slist.add("Ram");
		   slist.add("Gautam");
		   slist.add("Hari");
		   
		   modelMap.addAttribute("types","ModelMap");
		   modelMap.addAttribute("studentId",1);
		   modelMap.addAttribute("slist",studentService.getAllStudents());
		 
		return "index";		   
	   }
	   
	   
	   @RequestMapping(value="/modelandview", method= RequestMethod.GET)
	   public ModelAndView useModelAndViewDemo() {
		   ModelAndView modelAndView = new ModelAndView();
		   List<String> slist = new ArrayList<String>();
		   slist.add("Ram");
		   slist.add("Gautam");
		   slist.add("Hari");
		   
		   modelAndView.addObject("types","ModelAndView");
		   modelAndView.addObject("studentId",1);
		   modelAndView.addObject("slist",studentService.getAllStudents());
		   modelAndView.setViewName("index");
		   
		   return modelAndView;
	   }
	   
	   
}
