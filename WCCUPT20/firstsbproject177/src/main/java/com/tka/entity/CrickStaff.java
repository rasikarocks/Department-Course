package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CrickStaff {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int staffId;
	String staffName;
	String staffDept;
	String staffAge;
	String staffNoOfYearsToBCCI;
	public CrickStaff(int staffId, String staffName, String staffDept, String staffAge, String staffNoOfYearsToBCCI) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffDept = staffDept;
		this.staffAge = staffAge;
		this.staffNoOfYearsToBCCI = staffNoOfYearsToBCCI;
	}
	public CrickStaff(String staffName, String staffDept, String staffAge, String staffNoOfYearsToBCCI) {
		super();
		this.staffName = staffName;
		this.staffDept = staffDept;
		this.staffAge = staffAge;
		this.staffNoOfYearsToBCCI = staffNoOfYearsToBCCI;
	}
	@Override
	public String toString() {
		return "CrickStaff [staffId=" + staffId + ", staffName=" + staffName + ", staffDept=" + staffDept
				+ ", staffAge=" + staffAge + ", staffNoOfYearsToBCCI=" + staffNoOfYearsToBCCI + "]";
	}
	public CrickStaff() {
		super();
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffDept() {
		return staffDept;
	}
	public void setStaffDept(String staffDept) {
		this.staffDept = staffDept;
	}
	public String getStaffAge() {
		return staffAge;
	}
	public void setStaffAge(String staffAge) {
		this.staffAge = staffAge;
	}
	public String getStaffNoOfYearsToBCCI() {
		return staffNoOfYearsToBCCI;
	}
	public void setStaffNoOfYearsToBCCI(String staffNoOfYearsToBCCI) {
		this.staffNoOfYearsToBCCI = staffNoOfYearsToBCCI;
	}

}
