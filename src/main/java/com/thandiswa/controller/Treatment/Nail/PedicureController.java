package com.thandiswa.controller.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Pedicure;
import com.thandiswa.factory.Treatment.Nail.PedicureFactory;
import com.thandiswa.service.Impl.Treatment.Nail.PedicureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/spa/pedicure")
public class PedicureController {
    @Autowired
    private PedicureServiceImpl service;

    /*@GetMapping("/create/{mediHeelPedicure}")
    public @ResponseBody
    Pedicure create(@PathVariable String mediHeelPedicure){
        Pedicure pedicure = PedicureFactory.getPedicure(mediHeelPedicure);
        return service.create(pedicure);
    }

     */

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Pedicure> getAll(){
        return service.getAll();
    }
}
