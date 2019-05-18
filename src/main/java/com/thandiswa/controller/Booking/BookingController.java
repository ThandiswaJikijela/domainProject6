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
@RequestMapping("/spa/booking")
public class BookingController {

    //@Autowired
    //@Qualifier("ServiceImpl")
    private BookingServiceImpl service;
    private Map<String, String> values;

    /*@GetMapping("/create/{totalPrice}")
    @ResponseBody
    public Booking create(@PathVariable  Double totalPrice){
        values = new HashMap<>();
        values.put("treatmentType","Massage Treatment");
        Booking booking = BookingFactory.getBooking(values,totalPrice);
        return service.create(booking);
    }

    @PostMapping("/update")
    @ResponseBody
    public Booking update(Booking booking){
        return service.update(booking);
    }

    @PostMapping("/delete")
    @ResponseBody
    public void delete(String id){
        service.delete(id);
    }

    @PostMapping("/read")
    @ResponseBody
    public Booking read(String id){
        return service.read(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Booking> getAll(){
        return service.getAll();
    }

     */
}
