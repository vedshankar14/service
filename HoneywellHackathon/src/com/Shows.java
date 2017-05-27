package com;

import java.util.List;

public class Shows {
	
	private String theatreId;
	private String movieID;
	private List<Shows> shows;
	public String getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(String theatreId) {
		this.theatreId = theatreId;
	}
	
	public List<Shows> getShows() {
		return shows;
	}
	public void setShows(List<Shows> shows) {
		this.shows = shows;
	}
	public String getMovieID() {
		return movieID;
	}
	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}

}
