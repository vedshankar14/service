package com.honeywell.hackathon.service;

import com.honeywell.hackathon.model.BookingDetails;
import com.honeywell.hackathon.model.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    public void book(BookingDetails bookingDetails) {

    }

    public int getSeats(int id ) {
        return 1;
    }

    public UserDetails getUserDetails(int userId) {
        return new UserDetails();
    }
}
