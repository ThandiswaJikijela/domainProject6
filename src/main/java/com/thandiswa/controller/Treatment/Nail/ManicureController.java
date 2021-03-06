package com.thandiswa.controller.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Manicure;
import com.thandiswa.factory.Treatment.Nail.ManicureFactory;
import com.thandiswa.service.Impl.Treatment.Nail.ManicureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/manicure")
public class ManicureController {
    @Autowired
    @Qualifier("ServiceManicureImpl")
    private ManicureServiceImpl service;

    @GetMapping("/create/{nailStyle}")
    public @ResponseBody
    Manicure create(@PathVariable String nailStyle){
        Manicure manicure = ManicureFactory.getManicure(nailStyle);
        return service.create(manicure);
    }

    @PostMapping("/update")
    @ResponseBody
    public Manicure update(Manicure manicure){
        return service.update(manicure);
    }

    @PostMapping("/delete")
    @ResponseBody
    public void delete(String id){
        service.delete(id);
    }

    @PostMapping("/read")
    @ResponseBody
    public Manicure read(String id){
        return service.read(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Manicure> getAll(){
        return service.getAll();
    }
}
