package com.thandiswa.controller.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Pedicure;
import com.thandiswa.factory.Treatment.Nail.PedicureFactory;
import com.thandiswa.service.Impl.Treatment.Nail.PedicureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/pedicure")
public class PedicureController {
    @Autowired
    @Qualifier("ServicePedicureImpl")
    private PedicureServiceImpl service;

    @GetMapping("/create/{mediHeelPedicure}")
    public @ResponseBody
    Pedicure create(@PathVariable String mediHeelPedicure){
        Pedicure pedicure = PedicureFactory.getPedicure(mediHeelPedicure);
        return service.create(pedicure);
    }

    @PostMapping("/update")
    @ResponseBody
    public Pedicure update(Pedicure pedicure){
        return service.update(pedicure);
    }

    @PostMapping("/delete")
    @ResponseBody
    public void delete(String id){
        service.delete(id);
    }

    @PostMapping("/read")
    @ResponseBody
    public Pedicure read(String id){
        return service.read(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Pedicure> getAll(){
        return service.getAll();
    }
}
