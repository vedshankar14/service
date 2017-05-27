package com.honeywell.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.honeywell.model.MovieDetials;
import com.honeywell.service.MovieDetailsService;

@RestController
@Path("/movie")
public class MovieDetailsController {
	
	@Autowired
	private MovieDetailsService movieService;
	
	@GET
	@Path(value = "/getMovieDetails")
	@Produces(MediaType.APPLICATION_JSON)
	public List<MovieDetials> getMovieDetails() {
		return movieService.getMovieDetails();
	}

}
