package com.thandiswa.controller.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyWraps;
import com.thandiswa.factory.Treatment.Body.BodyWrapFactory;
import com.thandiswa.service.Impl.Treatment.Body.BodyWrapsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/bodyWraps")
public class BodyWrapController {
    @Autowired
    @Qualifier("ServiceWrapsImpl")
    private BodyWrapsServiceImpl service;

    @GetMapping("/create/{wrapMaterials}")
    public @ResponseBody
    BodyWraps create(@PathVariable String wrapMaterials){
        BodyWraps bodyWraps = BodyWrapFactory.getBodyWraps(wrapMaterials);
        return service.create(bodyWraps);
    }

    @PostMapping("/update")
    @ResponseBody
    public BodyWraps update(BodyWraps bodyWraps){
        return service.update(bodyWraps);
    }

    @PostMapping("/delete")
    @ResponseBody
    public void delete(String id){
        service.delete(id);
    }

    @PostMapping("/read")
    @ResponseBody
    public BodyWraps read(String id){
        return service.read(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<BodyWraps> getAll(){
        return service.getAll();
    }
}
