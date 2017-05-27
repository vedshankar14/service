package com.honeywell.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class MovieDetials implements Serializable{
	
	private static final long serialVersionUID = 7295517829270382188L;
	
	private List<String> showtimes;
    private List<Date> dates;
    private List<String> movies;
    private int seatleft;
	
    
    public List<String> getShowtimes() {
		return showtimes;
	}
	public void setShowtimes(List<String> showtimes) {
		this.showtimes = showtimes;
	}
	public List<Date> getDates() {
		return dates;
	}
	public void setDates(List<Date> dates) {
		this.dates = dates;
	}
	public List<String> getMovies() {
		return movies;
	}
	public void setMovies(List<String> movies) {
		this.movies = movies;
	}
	public int getSeatleft() {
		return seatleft;
	}
	public void setSeatleft(int seatleft) {
		this.seatleft = seatleft;
	}
	
	
	@Override
	public String toString() {
		return "MovieDetials [showtimes=" + showtimes + ", dates=" + dates
				+ ", movies=" + movies + ", seatleft=" + seatleft
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
    
    

}
