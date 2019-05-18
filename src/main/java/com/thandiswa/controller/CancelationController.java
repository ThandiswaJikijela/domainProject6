package com.thandiswa.controller;

import com.thandiswa.domain.Cancelation;
import com.thandiswa.factory.CancelationFactory;
import com.thandiswa.service.Impl.CancelationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/spa/Cancelation")
public class CancelationController {
    @Autowired
    private CancelationServiceImpl service;
   /* private Map<String, String> values;

    @GetMapping("/create/{paymentMethod}")
    public @ResponseBody
    Cancelation create(@PathVariable String paymentMethod){
        values = new HashMap<String,String>();
        Cancelation cancelation = CancelationFactory.getCancelation(values,paymentMethod);
        return service.create(cancelation);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Cancelation> getAll(){
        return service.getAll();
    }*/
}
