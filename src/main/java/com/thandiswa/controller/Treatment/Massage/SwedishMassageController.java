package com.thandiswa.controller.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.SwedishMassage;
import com.thandiswa.factory.Treatment.Massage.SwedishMassageFactory;
import com.thandiswa.service.Impl.Treatment.Massage.SwedishMassageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/spa/swedishMassage")
public class SwedishMassageController {
    @Autowired
    private SwedishMassageServiceImpl service;

    /*@GetMapping("/create/{carrierOil}")
    public @ResponseBody
    SwedishMassage create(@PathVariable String carrierOil){
        SwedishMassage swedishMassage = SwedishMassageFactory.getSwedishMassage(carrierOil);
        return service.create(swedishMassage);
    }

     */

    @GetMapping("/getAll")
    @ResponseBody
    public Set<SwedishMassage> getAll(){
        return service.getAll();
    }
}
