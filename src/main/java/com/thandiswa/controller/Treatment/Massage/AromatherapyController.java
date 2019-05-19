package com.thandiswa.controller.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.Aromatherapy;
import com.thandiswa.factory.Treatment.Massage.AromatherapyFactory;
import com.thandiswa.service.Impl.Treatment.Massage.AromatherapyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/aromatherapy")
public class AromatherapyController {
    @Autowired
    @Qualifier("ServiceAromatherapyImpl")
    private AromatherapyServiceImpl service;

   @GetMapping("/create/{fragrantEssentialOil}")
    public @ResponseBody
    Aromatherapy create(@PathVariable String fragrantEssentialOil){
        Aromatherapy aromatherapy = AromatherapyFactory.getAromatherapy(fragrantEssentialOil);
        return service.create(aromatherapy);
    }

    @PostMapping("/update")
    @ResponseBody
    public Aromatherapy update(Aromatherapy aromatherapy){
        return service.update(aromatherapy);
    }

    @PostMapping("/delete")
    @ResponseBody
    public void delete(String id){
        service.delete(id);
    }

    @PostMapping("/read")
    @ResponseBody
    public Aromatherapy read(String id){
        return service.read(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Aromatherapy> getAll(){
        return service.getAll();
    }
}
