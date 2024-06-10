package com.tka.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.WC20WorldCupDao;
import com.tka.entity.CrickStaff;

@Service
public class WC20WorldCupService {
	@Autowired
	WC20WorldCupDao cupDao;

	public int allIndianCricketStaffCount() {
		List<CrickStaff> crickStaffs = cupDao.allIndianCricketStaffList();
		return crickStaffs.size();
	}

	public int allIndianCricketMedStaffCount() {
		List<CrickStaff> crickStaffs = cupDao.allIndianCricketStaffList();
		// yaha logic likhenge filtering ka
		ArrayList<CrickStaff> alCrickStaffNew = new ArrayList<CrickStaff>();
		for (CrickStaff crickStaff : crickStaffs) {
			if (crickStaff.getStaffDept().equals("Med")) {
				alCrickStaffNew.add(crickStaff);
			}
		}
		return alCrickStaffNew.size();
	}

	public HashMap<String, String> getAgeandNameofStaff() {
		HashMap<String, String> ageNameMap = new HashMap<String, String>();
		List<CrickStaff> crickStaffs = cupDao.allIndianCricketStaffList();
		for (CrickStaff crickStaff : crickStaffs) {
			ageNameMap.put(crickStaff.getStaffName(), crickStaff.getStaffAge());
		}
		return ageNameMap;
	}

	public String fetchStaffNamewithMaxYears() {
		List<CrickStaff> crickStaffs = cupDao.allIndianCricketStaffList();
		//bcci no of years
		//name
		TreeMap<String, String> ageNameMap = new TreeMap<String, String>();
		for (CrickStaff crickStaff : crickStaffs) {
			ageNameMap.put(crickStaff.getStaffNoOfYearsToBCCI(), crickStaff.getStaffName());
		}
		//your code goes here
		System.err.println(ageNameMap);
		String nameOfperson =ageNameMap.get("13");
		return nameOfperson;
	}

}





