package com.thandiswa.controller.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.TissueMassage;
import com.thandiswa.factory.Treatment.Massage.TissueMassageFactory;
import com.thandiswa.service.Impl.Treatment.Massage.TissueMassageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/spa/tissueMassage")
public class TissueMassageController {
    @Autowired
    private TissueMassageServiceImpl service;

    /*@GetMapping("/create/{massagePressure}")
    public @ResponseBody
    TissueMassage create(@PathVariable String massagePressure){
        TissueMassage tissueMassage = TissueMassageFactory.getTissueMassage(massagePressure);
        return service.create(tissueMassage);
    }

     */

    @GetMapping("/getAll")
    @ResponseBody
    public Set<TissueMassage> getAll(){
        return service.getAll();
    }
}
