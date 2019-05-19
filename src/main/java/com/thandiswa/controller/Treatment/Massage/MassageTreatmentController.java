package com.thandiswa.controller.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.MassageTreatment;
import com.thandiswa.factory.Treatment.Massage.MassageTreatmentFactory;
import com.thandiswa.service.Impl.Treatment.Massage.MassageTreatmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/massageTreatment")
public class MassageTreatmentController {
    @Autowired
    @Qualifier("ServiceMassageImpl")
    private MassageTreatmentServiceImpl service;

    @PostMapping("/create")
    @ResponseBody
    public MassageTreatment create (MassageTreatment massageTreatment){
        return service.create(massageTreatment);
    }

    @PostMapping("/update")
    @ResponseBody
    public MassageTreatment update (MassageTreatment massageTreatment){
        return  service.update(massageTreatment);
    }

    @GetMapping("/delete/{treatmentID}")
    @ResponseBody
    public void delete(@PathVariable String treatmentID){
        service.delete(treatmentID);
    }

    @GetMapping("/read/{treatmentID}")
    @ResponseBody
    public MassageTreatment read(@PathVariable String treatmentID){
        return service.read(treatmentID);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<MassageTreatment> getAll(){
        return service.getAll();
    }
}
