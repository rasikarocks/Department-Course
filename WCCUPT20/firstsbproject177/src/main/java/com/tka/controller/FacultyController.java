package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.service.FacultyService;

@RestController
public class FacultyController {
	@Autowired
	FacultyService facultyService;

	@GetMapping("facultysubjects")
	List<String> facultySubjects() {
		return facultyService.allSubjects();
	}
	@GetMapping("highestExpPerson")
	String highestExpPersonName() {
		return facultyService.highestExpPersonName();
	}

}
