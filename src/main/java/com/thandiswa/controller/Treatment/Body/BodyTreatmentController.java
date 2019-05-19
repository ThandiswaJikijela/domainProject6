package com.thandiswa.controller.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyTreatment;
import com.thandiswa.factory.Treatment.Body.BodyTreatmentFactory;
import com.thandiswa.service.Impl.Treatment.Body.BodyTreatmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/bodyTreatment")
public class BodyTreatmentController {
    @Autowired
    @Qualifier("ServiceBodyTreatmentImpl")
    private BodyTreatmentServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public BodyTreatment create (BodyTreatment bodyTreatment){
        return service.create(bodyTreatment);
    }

    @PostMapping("/update")
    @ResponseBody
    public BodyTreatment update (BodyTreatment bodyTreatment){
        return  service.update(bodyTreatment);
    }

    @GetMapping("/delete/{treatmentID}")
    @ResponseBody
    public void delete(@PathVariable String treatmentID){
        service.delete(treatmentID);
    }

    @GetMapping("/read/{treatmentID}")
    @ResponseBody
    public BodyTreatment read(@PathVariable String treatmentID){
        return service.read(treatmentID);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<BodyTreatment> getAll(){
        return service.getAll();
    }
}
