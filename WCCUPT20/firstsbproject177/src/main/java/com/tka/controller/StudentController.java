package com.tka.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.FacultySubject;
import com.tka.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	@GetMapping("firstapi")
	public String welcomeMessage() {
		return "message-data";
	}

	
	
	
	@GetMapping("allcarcompanies")
	public ArrayList<String> allcars() {
		ArrayList<String> alcars = new ArrayList<>();
		alcars.add("maruti");
		alcars.add("hyundai");
		alcars.add("tata");
		return alcars;
	}

	@GetMapping("allFacultiessubNoReact")
	public ArrayList<FacultySubject> allfacsubjectswithoutreact() {
		// studentService = new StudentService();
		ArrayList<FacultySubject> facultySubjects = studentService.allfacsubjects();
		return facultySubjects;
	}

}
