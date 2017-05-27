package com.honeywell.hackathon.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.honeywell.model.BookingDetails;
import com.honeywell.model.UserDetails;
import com.honeywell.service.BookingService;

@RestController
@RequestMapping("/service")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @RequestMapping(value = "/book/", method = RequestMethod.POST)
    public void bookSeats(@RequestBody BookingDetails bookingDetails) {
         bookingService.book(bookingDetails);
    }

    @RequestMapping(value = "/bookDetails/", method = RequestMethod.GET)
    public int getSeats(@RequestParam int id) {
        return bookingService.getSeats(id);
    }

    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    public UserDetails getUserDetails(@RequestParam int userId) {
       return bookingService.getUserDetails(userId);
    }



}
