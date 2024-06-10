package com.tka.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.tka.dao.FacultyDao;
import com.tka.entity.Faculty;
import com.tka.entity.Subject;

@Service
public class FacultyService {
	@Autowired
	FacultyDao facultyDao;

	public ArrayList<String> allSubjects() {
		ArrayList<String> alSub = new ArrayList<String>();
		ArrayList<Faculty> facSubjects = facultyDao.facultySubjects();
		for (Faculty faculty : facSubjects) {
			List<Subject> subList = faculty.getSubNames();
			for (Subject subject : subList) {
				alSub.add(subject.getSubName());
			}
		}
		return alSub;
	}

	public String highestExpPersonName() {
		ArrayList<Faculty> facSubjects = facultyDao.facultySubjects();
		for (Faculty faculty : facSubjects) {
			
		}
		return null;
	}

}
