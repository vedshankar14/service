package com.honeywell.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.honeywell.service.SeatInformationService;

@RestController
@RequestMapping("/service")
public class SeatInformationController {
	
	@Autowired
	private SeatInformationService seatInformationService;
	
	@GetMapping("/getSeatInfo")
	public List<String> getSeatInformation() {
		List<String> list = new ArrayList<String>();
		list.add("Hello");
        
        return list;
	}

}
