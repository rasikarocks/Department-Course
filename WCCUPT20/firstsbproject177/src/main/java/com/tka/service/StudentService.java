package com.tka.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.StudentDao;
import com.tka.entity.FacultySubject;

@Service
public class StudentService {
	@Autowired
	StudentDao dao;

//create new list to add filtered facultysubjects obj
	public ArrayList<FacultySubject> allfacsubjects() {
//dao = new StudentDao();

		ArrayList<FacultySubject> al = dao.allfacsubjects();
		ArrayList<FacultySubject> alFiltered = new ArrayList<FacultySubject>();
		for (FacultySubject facultySubject : al) {
			if (!facultySubject.getFacSubName().equals("react")) {
				alFiltered.add(facultySubject);
			}
		}
		return alFiltered;
	}

}
