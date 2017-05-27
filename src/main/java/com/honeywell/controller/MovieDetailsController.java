package com.honeywell.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.honeywell.model.MovieDetials;
import com.honeywell.service.MovieDetailsService;

@RestController
@RequestMapping("/movie")
public class MovieDetailsController {
	
	@Autowired
	private MovieDetailsService movieService;
	
	@GetMapping("/getEmployees")
	public List<MovieDetials> getMovieDetails() {
		return movieService.getMovieDetails();
	}

}
