package com.thandiswa.controller.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.SwedishMassage;
import com.thandiswa.factory.Treatment.Massage.SwedishMassageFactory;
import com.thandiswa.service.Impl.Treatment.Massage.SwedishMassageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/swedishMassage")
public class SwedishMassageController {
    @Autowired
    @Qualifier("ServiceSwedishImpl")
    private SwedishMassageServiceImpl service;

    @GetMapping("/create/{carrierOil}")
    public @ResponseBody
    SwedishMassage create(@PathVariable String carrierOil){
        SwedishMassage swedishMassage = SwedishMassageFactory.getSwedishMassage(carrierOil);
        return service.create(swedishMassage);
    }

    @PostMapping("/update")
    @ResponseBody
    public SwedishMassage update(SwedishMassage swedishMassage){
        return service.update(swedishMassage);
    }

    @PostMapping("/delete")
    @ResponseBody
    public void delete(String id){
        service.delete(id);
    }

    @PostMapping("/read")
    @ResponseBody
    public SwedishMassage read(String id){
        return service.read(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<SwedishMassage> getAll(){
        return service.getAll();
    }
}
