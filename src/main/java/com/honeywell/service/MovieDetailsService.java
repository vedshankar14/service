package com.honeywell.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.honeywell.model.MovieDetials;

@Service
public class MovieDetailsService {

	public List<MovieDetials> getMovieDetails() {
		MovieDetials movieDetials = new MovieDetials();
		List<Date> dateList = new ArrayList<Date>();
		dateList.add(new Date());
		movieDetials.setDates(dateList);
		List<String> movies = new ArrayList<String>();
		movies.add("Sachin");
		movieDetials.setMovies(movies);
		movieDetials.setSeatleft(10);
		List<String> showTimes = new ArrayList<String>();
		showTimes.add("11:00 AM");
		showTimes.add("3:00 PM");
		showTimes.add("6:00 PM");
		showTimes.add("9:00 PM");
		movieDetials.setShowtimes(showTimes);
		
		List<MovieDetials> movieDetialsList = new ArrayList<MovieDetials>();
		movieDetialsList.add(movieDetials);
		return movieDetialsList;
	}

}
