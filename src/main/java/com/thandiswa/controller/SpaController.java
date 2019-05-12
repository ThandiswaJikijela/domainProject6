package com.thandiswa.controller;

import com.thandiswa.domain.Spa;
import com.thandiswa.factory.SpaFactory;
import com.thandiswa.service.Impl.SpaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/spa/Spa")
public class SpaController {
    @Autowired
    private SpaServiceImpl service;
    private Map<String, String> values;

    @GetMapping("/create/{spaName}")
    public @ResponseBody
    Spa create(@PathVariable String spaName){
        values = new HashMap<String,String>();
        Spa spa = SpaFactory.getSpa(values,spaName);
        return service.create(spa);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Spa> getAll(){
        return service.getAll();
    }
}
