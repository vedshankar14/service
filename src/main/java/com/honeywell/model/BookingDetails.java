package com.honeywell.model;

import java.io.Serializable;

public class BookingDetails implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1424371252074440451L;
	
	private int userId;
	private int theatreId;
	private String movieName;
	private int noOfSeats;
	private String showTiming;
	private String seatNumbers;
	
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the theatreId
	 */
	public int getTheatreId() {
		return theatreId;
	}
	/**
	 * @param theatreId the theatreId to set
	 */
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	/**
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}
	/**
	 * @param movieName the movieName to set
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	/**
	 * @return the noOfSeats
	 */
	public int getNoOfSeats() {
		return noOfSeats;
	}
	/**
	 * @param noOfSeats the noOfSeats to set
	 */
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	/**
	 * @return the showTiming
	 */
	public String getShowTiming() {
		return showTiming;
	}
	/**
	 * @param showTiming the showTiming to set
	 */
	public void setShowTiming(String showTiming) {
		this.showTiming = showTiming;
	}
	/**
	 * @return the seatNumbers
	 */
	public String getSeatNumbers() {
		return seatNumbers;
	}
	/**
	 * @param seatNumbers the seatNumbers to set
	 */
	public void setSeatNumbers(String seatNumbers) {
		this.seatNumbers = seatNumbers;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BookingDetails [userId=" + userId + ", theatreId=" + theatreId
				+ ", movieName=" + movieName + ", noOfSeats=" + noOfSeats
				+ ", showTiming=" + showTiming + ", seatNumbers=" + seatNumbers
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
