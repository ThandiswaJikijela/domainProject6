package com.thandiswa.controller;

import com.thandiswa.domain.Cancelation;
import com.thandiswa.factory.CancelationFactory;
import com.thandiswa.service.Impl.CancelationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/Cancelation")
public class CancelationController {
    @Autowired
    @Qualifier("ServiceCancellationImpl")
    private CancelationServiceImpl service;

    @GetMapping("/create/{paymentMethod}")
    public @ResponseBody
    Cancelation create(@PathVariable String paymentMethod){
        Cancelation cancelation = CancelationFactory.getCancelation(paymentMethod);
        return service.create(cancelation);
    }

    @PostMapping("/update")
    @ResponseBody
    public Cancelation update(Cancelation cancelation){
        return service.update(cancelation);
    }

    @PostMapping("/delete")
    @ResponseBody
    public void delete(String reservationID){
        service.delete(reservationID);
    }

    @PostMapping("/read")
    @ResponseBody
    public Cancelation read(String reservationID){
        return service.read(reservationID);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Cancelation> getAll(){
        return service.getAll();
    }
}
