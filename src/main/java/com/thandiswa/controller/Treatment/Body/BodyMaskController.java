package com.thandiswa.controller.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyMask;
import com.thandiswa.factory.Treatment.Body.BodyMaskFactory;
import com.thandiswa.service.Impl.Treatment.Body.BodyMaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/spa/bodyMask")
public class BodyMaskController {
    @Autowired
    private BodyMaskServiceImpl service;

    /*@GetMapping("/create/{maskIngredients}")
    public @ResponseBody
    BodyMask create(@PathVariable String maskIngredients){
        BodyMask employee = BodyMaskFactory.getBodyMask(maskIngredients);
        return service.create(employee);
    }

     */

    @GetMapping("/getAll")
    @ResponseBody
    public Set<BodyMask> getAll(){
        return service.getAll();
    }
}
