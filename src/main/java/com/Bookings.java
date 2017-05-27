package com;

import java.util.List;

public class Bookings {

	private String userID;
	private String theatreId;
	private String movieName;
	private int noOfSeats;
	private String showTiming;
	private String date;
	private List<Bookings> bookings;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(String theatreId) {
		this.theatreId = theatreId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String getShowTiming() {
		return showTiming;
	}
	public void setShowTiming(String showTiming) {
		this.showTiming = showTiming;
	}
	
	public List<Bookings> getBookings() {
		return bookings;
	}
	public void setBookings(List<Bookings> bookings) {
		this.bookings = bookings;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
