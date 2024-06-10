package com.tka.entity;

public class FacultySubject {
	int facId;
	String facSubName;
	
	public int getFacId() {
		return facId;
	}
	public void setFacId(int facId) {
		this.facId = facId;
	}
	@Override
	public String toString() {
		return "FacultySubject [facId=" + facId + ", facSubName=" + facSubName + "]";
	}
	public FacultySubject(int facId, String facSubName) {
		super();
		this.facId = facId;
		this.facSubName = facSubName;
	}
	public FacultySubject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFacSubName() {
		return facSubName;
	}
	public void setFacSubName(String facSubName) {
		this.facSubName = facSubName;
	}
}
