package com.thandiswa.controller.Treatment.Facial;


import com.thandiswa.domain.Treatment.Facial.AntAgingFacial;
import com.thandiswa.factory.Treatment.Facial.AntiAgingFacialFactory;
import com.thandiswa.service.Impl.Treatment.Facial.AntiAgingFacialServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/antiAgingFacial")
public class AntiAgingFacialController {
    @Autowired
    @Qualifier("ServiceAntiImpl")
    private AntiAgingFacialServiceImpl service;

    @GetMapping("/create/{poreIngredients}")
    public @ResponseBody
    AntAgingFacial create(@PathVariable String poreIngredients){
        AntAgingFacial agingFacial = AntiAgingFacialFactory.getAntAgingFacial(poreIngredients);
        return service.create(agingFacial);
    }

    @PostMapping("/update")
    @ResponseBody
    public AntAgingFacial update(AntAgingFacial agingFacial){
        return service.update(agingFacial);
    }

    @PostMapping("/delete")
    @ResponseBody
    public void delete(String id){
        service.delete(id);
    }

    @PostMapping("/read")
    @ResponseBody
    public AntAgingFacial read(String id){
        return service.read(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<AntAgingFacial> getAll(){
        return service.getAll();
    }
}
