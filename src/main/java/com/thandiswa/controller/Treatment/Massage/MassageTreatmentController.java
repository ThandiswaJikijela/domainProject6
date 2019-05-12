package com.thandiswa.controller.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.MassageTreatment;
import com.thandiswa.factory.Treatment.Massage.MassageTreatmentFactory;
import com.thandiswa.service.Impl.Treatment.Massage.MassageTreatmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/spa/massageTreatment")
public class MassageTreatmentController {
    @Autowired
    private MassageTreatmentServiceImpl service;
    private Map<String, String> values;

    @GetMapping("/create/{massageType}")
    public @ResponseBody
    MassageTreatment create(@PathVariable String massageType){
        values = new HashMap<>();
        MassageTreatment massageTreatment = MassageTreatmentFactory.getMassageTreatment(values,massageType);
        return service.create(massageTreatment);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<MassageTreatment> getAll(){
        return service.getAll();
    }
}
