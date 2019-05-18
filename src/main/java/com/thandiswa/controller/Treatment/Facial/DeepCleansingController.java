package com.thandiswa.controller.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.DeepCleansing;
import com.thandiswa.factory.Treatment.Facial.DeepCleansingFactory;
import com.thandiswa.service.Impl.Treatment.Facial.DeepCleansingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/spa/deepCleansing")
public class DeepCleansingController {
    @Autowired
    private DeepCleansingServiceImpl service;

    /*@GetMapping("/create/{oilTypes}")
    public @ResponseBody
    DeepCleansing create(@PathVariable String oilTypes){
        DeepCleansing deepCleansing = DeepCleansingFactory.getDeepCleansing(oilTypes);
        return service.create(deepCleansing);
    }

     */

    @GetMapping("/getAll")
    @ResponseBody
    public Set<DeepCleansing> getAll(){
        return service.getAll();
    }
}
