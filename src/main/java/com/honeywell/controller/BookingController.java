package com.honeywell.controller;

import com.honeywell.model.BookingDetails;
import com.honeywell.model.UserDetails;
import com.honeywell.service.BookingService;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public void getSeats(@RequestParam int id) {
        bookingService.getSeats(id);
    }

    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    public UserDetails getUserDetails(@RequestParam int userId) {
       return bookingService.getUserDetails(userId);
    }



}
