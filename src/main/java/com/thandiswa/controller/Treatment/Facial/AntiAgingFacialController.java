package com.thandiswa.controller.Treatment.Facial;


import com.thandiswa.domain.Treatment.Facial.AntAgingFacial;
import com.thandiswa.factory.Treatment.Facial.AntiAgingFacialFactory;
import com.thandiswa.service.Impl.Treatment.Facial.AntiAgingFacialServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/spa/antiAgingFacial")
public class AntiAgingFacialController {
    @Autowired
    private AntiAgingFacialServiceImpl service;

    @GetMapping("/create/{poreIngredients}")
    public @ResponseBody
    AntAgingFacial create(@PathVariable String poreIngredients){
        AntAgingFacial agingFacial = AntiAgingFacialFactory.getAntAgingFacial(poreIngredients);
        return service.create(agingFacial);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<AntAgingFacial> getAll(){
        return service.getAll();
    }
}
