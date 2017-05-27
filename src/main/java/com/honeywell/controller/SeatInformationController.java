package com.honeywell.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.honeywell.service.SeatInformationService;

@RestController
public class SeatInformationController {
	
	@Autowired
	private SeatInformationService seatInformationService;
	
	@GetMapping("/getSeatInfo")
	public List<String> getSeatInformation() {
		
        
        return null;
	}

}
