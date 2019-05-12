package com.thandiswa.controller.Treatment;

import com.thandiswa.domain.Treatment.Treatment;
import com.thandiswa.factory.Treatment.TreatmentFactory;
import com.thandiswa.service.Impl.Treatment.TreatmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/spa/Treatment")
public class TreatmentController {
    @Autowired
    private TreatmentServiceImpl service;
    private Map<String, String> values;

    @GetMapping("/create/{username}")
    public @ResponseBody
    Treatment create(@PathVariable String username){
        values = new HashMap<String,String>();
        Treatment treatment  = TreatmentFactory.getTreatment(values,username);
        return service.create(treatment);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Treatment> getAll(){
        return service.getAll();
    }
}
