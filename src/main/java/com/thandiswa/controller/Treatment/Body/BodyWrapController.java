package com.thandiswa.controller.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyWraps;
import com.thandiswa.factory.Treatment.Body.BodyWrapFactory;
import com.thandiswa.service.Impl.Treatment.Body.BodyWrapsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/spa/bodyWraps")
public class BodyWrapController {
    @Autowired
    private BodyWrapsServiceImpl service;

    /*@GetMapping("/create/{wrapMaterials}")
    public @ResponseBody
    BodyWraps create(@PathVariable String wrapMaterials){
        BodyWraps bodyWraps = BodyWrapFactory.getBodyWraps(wrapMaterials);
        return service.create(bodyWraps);
    }

     */

    @GetMapping("/getAll")
    @ResponseBody
    public Set<BodyWraps> getAll(){
        return service.getAll();
    }
}
