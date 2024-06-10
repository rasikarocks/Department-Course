package com.tka.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.tka.entity.Faculty;
import com.tka.entity.Subject;

@Repository
public class FacultyDao {
	public ArrayList<Faculty> facultySubjects() {
		ArrayList<Faculty> alFacultywithSub = new ArrayList<Faculty>();

		ArrayList<Subject> alSub = new ArrayList<Subject>();
		alSub.add(new Subject(1, "JAVA"));
		alSub.add(new Subject(2, "PYTHON"));
		Faculty faculty1 = new Faculty(1, "RAM", 5, alSub);

		ArrayList<Subject> alSub2 = new ArrayList<Subject>();
		alSub2.add(new Subject(3, "REACT"));
		alSub2.add(new Subject(4, "MERN"));
		Faculty faculty2 = new Faculty(1, "SHYAM", 16, alSub2);

		alFacultywithSub.add(faculty1);
		alFacultywithSub.add(faculty2);
		return alFacultywithSub;
	}
}
