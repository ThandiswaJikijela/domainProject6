package com.thandiswa.controller.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.Aromatherapy;
import com.thandiswa.factory.Treatment.Massage.AromatherapyFactory;
import com.thandiswa.service.Impl.Treatment.Massage.AromatherapyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/spa/aromatherapy")
public class AromatherapyContoller {
    @Autowired
    private AromatherapyServiceImpl service;

    @GetMapping("/create/{fragrantEssentialOil}")
    public @ResponseBody
    Aromatherapy create(@PathVariable String fragrantEssentialOil){
        Aromatherapy aromatherapy = AromatherapyFactory.getAromatherapy(fragrantEssentialOil);
        return service.create(aromatherapy);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Aromatherapy> getAll(){
        return service.getAll();
    }
}
