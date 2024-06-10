package com.tka.entity;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Faculty {

	int facultyId;
	String facultyName;
	int facultyExpYears;
	List<Subject> subNames;

	public int getFacultyId() {
		return facultyId;
	}

	public Faculty() {
		super();
	}

	public Faculty(int facultyId, String facultyName, int facultyExpYears, List<Subject> subNames) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.facultyExpYears = facultyExpYears;
		this.subNames = subNames;
	}

	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", facultyExpYears="
				+ facultyExpYears + ", subNames=" + subNames + "]";
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public int getFacultyExpYears() {
		return facultyExpYears;
	}

	public void setFacultyExpYears(int facultyExpYears) {
		this.facultyExpYears = facultyExpYears;
	}

	public List<Subject> getSubNames() {
		return subNames;
	}

	public void setSubNames(List<Subject> subNames) {
		this.subNames = subNames;
	}
}
