package com;

import java.util.List;

public class Theatre {
	private String theateId;
	private String address;
	private String theatreName;
	private List<Theatre> theatre;
	public String getTheateId() {
		return theateId;
	}
	public void setTheateId(String theateId) {
		this.theateId = theateId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public List<Theatre> getTheatre() {
		return theatre;
	}
	public void setTheatre(List<Theatre> theatre) {
		this.theatre = theatre;
	}
	

}
