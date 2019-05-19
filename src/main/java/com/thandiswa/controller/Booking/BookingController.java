package com.thandiswa.controller.Booking;

import com.thandiswa.domain.Booking.Booking;
import com.thandiswa.factory.Booking.BookingFactory;
import com.thandiswa.service.Impl.Booking.BookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    @Qualifier("ServiceBookingImpl")
    private BookingServiceImpl service;

    @GetMapping("/create/{treatmentType}")
    @ResponseBody
    public Booking create(@PathVariable  String treatmentType, double totalPrice){
        Booking booking = BookingFactory.getBooking(treatmentType,totalPrice);
        return service.create(booking);
    }

    @PostMapping("/update")
    @ResponseBody
    public Booking update(Booking booking){
        return service.update(booking);
    }

    @PostMapping("/delete")
    @ResponseBody
    public void delete(String reservationID){
        service.delete(reservationID);
    }

    @PostMapping("/read")
    @ResponseBody
    public Booking read(String reservationID){
        return service.read(reservationID);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Booking> getAll(){
        return service.getAll();
    }

}
