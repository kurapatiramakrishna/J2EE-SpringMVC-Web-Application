package org.jsp.springMVC.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.jsp.springMVC.dao.StudentDao;
import org.jsp.springMVC.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//This class Will Manage Entire Application request
@Controller
public class ApplicationController 
{
	@Autowired
	private StudentDao dao;
	//to map method with url 
	//Handler Mapping
	@RequestMapping("/register")
	public String displayRegistrationFile()
	{
		return "Registration";
	}
	//To perform Registration
	//public String displayRegistrationDetails(@RequestParam("rollNo") int rollNo, 
	//@RequestParam("name") String name, 
	//@RequestParam("percentage") double percentage) { }

	
	//If you are using post method in jsp then this method synatax is used method = RequestMethod.POST and path = "/displayDetails",
	//If you are using get method in jsp then this method synatax is used method = RequestMethod.GET and path = "/displayDetails",
	@RequestMapping(path = "/displayDetails", method = RequestMethod.POST)
	@ResponseBody
	public String displayRegistrationDetails(@ModelAttribute Student s1)
	{
		//Fetch Data From Student Object
		int id = s1.getRollNo();
		String n = s1.getName();
		double per = s1.getPercentage();
		String st = s1.getStream();
		System.out.println(s1.toString());
		dao.register(s1);   //int record = dao.register(s1);
		return  s1.toString(); //return "Id : "+id+", Name : "+n+", and Percentage : "+per;   //you can use return "";  // return s1.toString()
	}
	
	// to map method with url
	//Handler mapping 
	@RequestMapping("/login")
	public String displayLoginFile()
	{
		return "Login";
	}
	
	//to map method with url
	//Handler mapping
	@RequestMapping("/signup")
	public  String displaySignUpFile()
	{
		return "SignUp";
	}
	
	@RequestMapping("/Update")
	public  String displayUpadteFile()
	{
		return "Update";
	}
	
	@RequestMapping("/print")
	@ResponseBody
	public String printMessage()
	{
		String message="print message method executed..";
		return message;
	}
	
	
	
	@RequestMapping("/UserDetails")
	public String displayUserDetailsForm(Model model)
	{
		//to Transfer data From Controller To View
		model.addAttribute("pageNo", 102);
		Student s1 = new Student();
		s1.setRollNo(105);
		s1.setName("RK");
		s1.setPercentage(98);
		s1.setStream("MPCS");
		model.addAttribute("object", s1);
		//Only return jsp file without extension
		//If you are using InternalResourceViewResolver Class, then you need to return without extension - return "UserDetails";
		//If you are not using InternalResourceViewResolver Class, then you need to return with extension - return "UserDetails.jsp";
		return "UserDetails";
	}
	
	
	@RequestMapping("/date")
	public  String displayDateFile()
	{
		return "dateForm";
	}
	
	
	 @RequestMapping("/performLogin")
	public ModelAndView performLoginOperation(@RequestParam("rn") int rollNo,Model model)
	{
		System.out.println("RollNo ="+rollNo);
		Student student1=dao.loginOperation(rollNo);
		//model.addAttribute("studentObject",student1);
		//return "mainpage";s
		ModelAndView mv=new ModelAndView();
		//to transfer data from controller to view
		mv.addObject("studentObject", student1);
		//to provide jsp file name/viewname
		mv.setViewName("MainPage");
		//model.addAttribute("studentObject", student1);
		return mv;
	}
	
	
	@RequestMapping("/displaydate")
	@ResponseBody
	public String displayDate(@RequestParam("user") String userName)
	{
	  Date date = new Date();
	  SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy");
	  String currentDate = dateFormat.format(date);
	  System.out.println("Date method executed..");
	  return "Username: " + userName + ", date: " + currentDate;
	}
}
