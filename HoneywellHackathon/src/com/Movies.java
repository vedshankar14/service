package com;

import java.util.List;

public class Movies {
	private String movieID;
	private String movieName;
	private String showTiming;
	private int toatalSeats;
	private int availableSeats;
	private String date;
	private int price;
	private List<Movies> movies;
	public String getMovieID() {
		return movieID;
	}
	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getShowTiming() {
		return showTiming;
	}
	public void setShowTiming(String showTiming) {
		this.showTiming = showTiming;
	}
	public int getToatalSeats() {
		return toatalSeats;
	}
	public void setToatalSeats(int toatalSeats) {
		this.toatalSeats = toatalSeats;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public List<Movies> getMovies() {
		return movies;
	}
	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
