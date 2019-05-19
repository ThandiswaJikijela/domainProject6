package com.thandiswa.controller.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.DeepCleansing;
import com.thandiswa.factory.Treatment.Facial.DeepCleansingFactory;
import com.thandiswa.service.Impl.Treatment.Facial.DeepCleansingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/deepCleansing")
public class DeepCleansingController {
    @Autowired
    @Qualifier("ServiceDeepCleansingImpl")
    private DeepCleansingServiceImpl service;

    @GetMapping("/create/{oilTypes}")
    public @ResponseBody
    DeepCleansing create(@PathVariable String oilTypes){
        DeepCleansing deepCleansing = DeepCleansingFactory.getDeepCleansing(oilTypes);
        return service.create(deepCleansing);
    }

    @PostMapping("/update")
    @ResponseBody
    public DeepCleansing update(DeepCleansing deepCleansing){
        return service.update(deepCleansing);
    }

    @PostMapping("/delete")
    @ResponseBody
    public void delete(String id){
        service.delete(id);
    }

    @PostMapping("/read")
    @ResponseBody
    public DeepCleansing read(String id){
        return service.read(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<DeepCleansing> getAll(){
        return service.getAll();
    }
}
