package com.thandiswa.controller;

import com.thandiswa.domain.Spa;
import com.thandiswa.factory.SpaFactory;
import com.thandiswa.service.Impl.SpaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/Spa")
public class SpaController {
    @Autowired
    @Qualifier("ServiceSpaImpl")
    private SpaServiceImpl service;

    @GetMapping("/create/{address}")
    public @ResponseBody
    Spa create(@PathVariable String address,String spaName){
        Spa spa = SpaFactory.getSpa(address,spaName);
        return service.create(spa);
    }

    @PostMapping("/update")
    @ResponseBody
    public Spa update(Spa spa){
        return service.update(spa);
    }

    @PostMapping("/delete")
    @ResponseBody
    public void delete(String spaId){
        service.delete(spaId);
    }

    @PostMapping("/read")
    @ResponseBody
    public Spa read(String spaId){
        return service.read(spaId);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Spa> getAll(){
        return service.getAll();
    }

}
