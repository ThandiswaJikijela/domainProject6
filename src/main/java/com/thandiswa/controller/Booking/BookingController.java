package com.thandiswa.controller.Booking;

import com.thandiswa.domain.Booking.Booking;
import com.thandiswa.factory.Booking.BookingFactory;
import com.thandiswa.service.Impl.Booking.BookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/spa/booking")
public class BookingController {

    @Autowired
    private BookingServiceImpl service;
    private Map<String, String> values;

    @GetMapping("/create/{reservationID}")
    public @ResponseBody
    Booking create(@PathVariable String reservationID, String treatmentType, Double totalPrice){
        values = new HashMap<String,String>();
        Booking booking = BookingFactory.getBooking(values,reservationID,treatmentType,totalPrice);
        return service.create(booking);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Booking> getAll(){
        return service.getAll();
    }
}
