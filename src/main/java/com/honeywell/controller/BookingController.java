package com.honeywell.controller;

import com.honeywell.model.BookingDetails;
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

    @RequestMapping(value = "/book/", method = RequestMethod.POST)
    public void getSeats(@RequestParam int id) {
        bookingService.getSeats(id);
    }

}
