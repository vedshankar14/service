package com.honeywell.service;

import com.honeywell.model.BookingDetails;
import com.honeywell.model.UserDetails;
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
