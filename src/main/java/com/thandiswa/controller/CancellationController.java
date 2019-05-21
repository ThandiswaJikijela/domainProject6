package com.thandiswa.controller;

import com.thandiswa.domain.Cancellation;
import com.thandiswa.factory.CancellationFactory;
import com.thandiswa.service.Impl.CancellationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Cancellation")
public class CancellationController {
    @Autowired
    @Qualifier("ServiceCancellationImpl")
    private CancellationServiceImpl service;

    @GetMapping("/create/{paymentMethod}")
    public @ResponseBody
    Cancellation create(@PathVariable String paymentMethod){
        Cancellation cancellation = CancellationFactory.getCancelation(paymentMethod);
        return service.create(cancellation);
    }

    @PostMapping("/update")
    @ResponseBody
    public Cancellation update(Cancellation cancellation){
        return service.update(cancellation);
    }

    @PostMapping("/delete")
    @ResponseBody
    public void delete(String reservationID){
        service.delete(reservationID);
    }

    @PostMapping("/read")
    @ResponseBody
    public Cancellation read(String reservationID){
        return service.read(reservationID);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Cancellation> getAll(){
        return service.getAll();
    }
}
