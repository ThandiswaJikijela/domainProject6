package com.thandiswa.controller.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Manicure;
import com.thandiswa.factory.Treatment.Nail.ManicureFactory;
import com.thandiswa.service.Impl.Treatment.Nail.ManicureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/spa/manicure")
public class ManicureController {
    @Autowired
    private ManicureServiceImpl service;

    @GetMapping("/create/{nailStyle}")
    public @ResponseBody
    Manicure create(@PathVariable String nailStyle){
        Manicure manicure = ManicureFactory.getManicure(nailStyle);
        return service.create(manicure);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Manicure> getAll(){
        return service.getAll();
    }
}
