package com.thandiswa.controller.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.TissueMassage;
import com.thandiswa.factory.Treatment.Massage.TissueMassageFactory;
import com.thandiswa.service.Impl.Treatment.Massage.TissueMassageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/tissueMassage")
public class TissueMassageController {
    @Autowired
    @Qualifier("ServiceTissueImpl")
    private TissueMassageServiceImpl service;

    @GetMapping("/create/{massagePressure}")
    public @ResponseBody
    TissueMassage create(@PathVariable String massagePressure){
        TissueMassage tissueMassage = TissueMassageFactory.getTissueMassage(massagePressure);
        return service.create(tissueMassage);
    }

    @PostMapping("/update")
    @ResponseBody
    public TissueMassage update(TissueMassage tissueMassage){
        return service.update(tissueMassage);
    }

    @PostMapping("/delete")
    @ResponseBody
    public void delete(String id){
        service.delete(id);
    }

    @PostMapping("/read")
    @ResponseBody
    public TissueMassage read(String id){
        return service.read(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<TissueMassage> getAll(){
        return service.getAll();
    }
}
