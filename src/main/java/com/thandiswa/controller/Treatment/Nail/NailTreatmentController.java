package com.thandiswa.controller.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.NailTreatment;
import com.thandiswa.factory.Treatment.Nail.NailTreatmentFactory;
import com.thandiswa.service.Impl.Treatment.Nail.NailTreatmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/nailTreatment")
public class NailTreatmentController {
    @Autowired
    @Qualifier("ServiceNailImpl")
    private NailTreatmentServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public NailTreatment create (NailTreatment nailTreatment){
        return service.create(nailTreatment);
    }

    @PostMapping("/update")
    @ResponseBody
    public NailTreatment update (NailTreatment nailTreatment){
        return  service.update(nailTreatment);
    }

    @GetMapping("/delete/{treatmentID}")
    @ResponseBody
    public void delete(@PathVariable String treatmentID){
        service.delete(treatmentID);
    }

    @GetMapping("/read/{treatmentID}")
    @ResponseBody
    public NailTreatment read(@PathVariable String treatmentID){
        return service.read(treatmentID);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<NailTreatment> getAll(){
        return service.getAll();
    }
}
