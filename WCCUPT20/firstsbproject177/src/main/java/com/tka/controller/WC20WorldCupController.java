package com.tka.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.service.WC20WorldCupService;

@RestController
public class WC20WorldCupController {
	@Autowired
	WC20WorldCupService cupService;

	@GetMapping("totalcrickstaff")
	public int allIndianCricketStaffCount() {
		return cupService.allIndianCricketStaffCount();
	}
	@GetMapping("totalmedcrickstaff")
	public int allIndianCricketMedStaffCount() {
		return cupService.allIndianCricketStaffCount();
	}
	@GetMapping("agenamestaff")
	public HashMap<String, String>  fetchIndianCricketNamewithAge() {
		return cupService.getAgeandNameofStaff();
	}
	@GetMapping("maxyearstobcci")
	public String  fetchStaffNamewithMaxYears() {
		return cupService.fetchStaffNamewithMaxYears();
	}

}
