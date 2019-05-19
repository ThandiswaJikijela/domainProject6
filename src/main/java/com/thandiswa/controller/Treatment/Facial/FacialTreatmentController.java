package com.thandiswa.controller.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.FacialTreatment;
import com.thandiswa.factory.Treatment.Facial.FacialTreatmentFactory;
import com.thandiswa.service.Impl.Treatment.Facial.FacialTreatmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/facialTreatment")
public class FacialTreatmentController {
    @Autowired
    @Qualifier("ServiceFacialImpl")
    private FacialTreatmentServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public FacialTreatment create (FacialTreatment facialTreatment){
        return service.create(facialTreatment);
    }

    @PostMapping("/update")
    @ResponseBody
    public FacialTreatment update (FacialTreatment facialTreatment){
        return  service.update(facialTreatment);
    }

    @GetMapping("/delete/{treatmentID}")
    @ResponseBody
    public void delete(@PathVariable String treatmentID){
        service.delete(treatmentID);
    }

    @GetMapping("/read/{treatmentID}")
    @ResponseBody
    public FacialTreatment read(@PathVariable String treatmentID){
        return service.read(treatmentID);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<FacialTreatment> getAll(){
        return service.getAll();
    }

}
