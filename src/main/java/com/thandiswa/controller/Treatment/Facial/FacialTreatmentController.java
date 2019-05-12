package com.thandiswa.controller.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.FacialTreatment;
import com.thandiswa.factory.Treatment.Facial.FacialTreatmentFactory;
import com.thandiswa.service.Impl.Treatment.Facial.FacialTreatmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/spa/facialTreatment")
public class FacialTreatmentController {
    @Autowired
    private FacialTreatmentServiceImpl service;
    private Map<String, String> values;

    @GetMapping("/create/{treatmentType}")
    public @ResponseBody
    FacialTreatment create(@PathVariable String treatmentType){
        values = new HashMap<>();
        FacialTreatment facialTreatment = FacialTreatmentFactory.getFacialTreatment(values,treatmentType);
        return service.create(facialTreatment);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<FacialTreatment> getAll(){
        return service.getAll();
    }
}
