package com.thandiswa.controller.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.NailTreatment;
import com.thandiswa.factory.Treatment.Nail.NailTreatmentFactory;
import com.thandiswa.service.Impl.Treatment.Nail.NailTreatmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/spa/nailTreatment")
public class NailTreatmentController {
    @Autowired
    private NailTreatmentServiceImpl service;
    private Map<String, String> values;

    @GetMapping("/create/{nailType}")
    public @ResponseBody
    NailTreatment create(@PathVariable String nailType){
        values = new HashMap<>();
        NailTreatment nailTreatment = NailTreatmentFactory.getNailTreatment(values,nailType);
        return service.create(nailTreatment);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<NailTreatment> getAll(){
        return service.getAll();
    }
}
