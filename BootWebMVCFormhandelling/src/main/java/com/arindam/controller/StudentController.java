package com.arindam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.arindam.bean.Student;

@Controller
public class StudentController {
	@GetMapping("/")
public String showStudentPage()
{
	return "Student";
}
	@PostMapping("/register")
	public String showData(@ModelAttribute Student student,Model model)
	{
		model.addAttribute(student);
		return "Show";
		
	}
}
