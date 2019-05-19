package com.thandiswa.controller.Treatment;

import com.thandiswa.domain.Treatment.Treatment;
import com.thandiswa.factory.Treatment.TreatmentFactory;
import com.thandiswa.service.Impl.Treatment.TreatmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/Treatment")
public class TreatmentController {
    @Autowired
    @Qualifier("ServiceTreatmentImpl")
    private TreatmentServiceImpl service;

    @GetMapping("/create/{description}")
    public @ResponseBody
    Treatment create(@PathVariable String description,String name){
        Treatment treatment  = TreatmentFactory.getTreatment(description,name);
        return service.create(treatment);
    }

    @PostMapping("/update")
    @ResponseBody
    public Treatment update(Treatment treatment){
        return service.update(treatment);
    }

    @PostMapping("/delete")
    @ResponseBody
    public void delete(String treatmentID){
        service.delete(treatmentID);
    }

    @PostMapping("/read")
    @ResponseBody
    public Treatment read(String treatmentID){
        return service.read(treatmentID);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Treatment> getAll(){
        return service.getAll();
    }

}
