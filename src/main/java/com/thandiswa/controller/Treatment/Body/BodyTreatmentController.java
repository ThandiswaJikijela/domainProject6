package com.thandiswa.controller.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyTreatment;
import com.thandiswa.factory.Treatment.Body.BodyTreatmentFactory;
import com.thandiswa.service.Impl.Treatment.Body.BodyTreatmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/spa/bodyTreatment")
public class BodyTreatmentController {
    @Autowired
    private BodyTreatmentServiceImpl service;
    private Map<String, String> values;

    @GetMapping("/create/{treatmentType}")
    public @ResponseBody
    BodyTreatment create(@PathVariable String treatmentType){
        values = new HashMap<>();
        BodyTreatment bodyTreatment = BodyTreatmentFactory.getBodyTreatment(values,treatmentType);
        return service.create(bodyTreatment);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<BodyTreatment> getAll(){
        return service.getAll();
    }
}
