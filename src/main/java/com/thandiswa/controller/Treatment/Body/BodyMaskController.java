package com.thandiswa.controller.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyMask;
import com.thandiswa.factory.Treatment.Body.BodyMaskFactory;
import com.thandiswa.service.Impl.Treatment.Body.BodyMaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/bodyMask")
public class BodyMaskController {
    @Autowired
    @Qualifier("ServiceMaskImpl")
    private BodyMaskServiceImpl service;

    @GetMapping("/create/{maskIngredients}")
    public @ResponseBody
    BodyMask create(@PathVariable String maskIngredients){
        BodyMask bodyMask = BodyMaskFactory.getBodyMask(maskIngredients);
        return service.create(bodyMask);
    }

    @PostMapping("/update")
    @ResponseBody
    public BodyMask update(BodyMask bodyMask){
        return service.update(bodyMask);
    }

    @PostMapping("/delete")
    @ResponseBody
    public void delete(String id){
        service.delete(id);
    }

    @PostMapping("/read")
    @ResponseBody
    public BodyMask read(String id){
        return service.read(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<BodyMask> getAll(){
        return service.getAll();
    }
}
