package com.thandiswa.controller.Staff;

import com.thandiswa.domain.Staff.SpaAdmin;
import com.thandiswa.factory.Staff.SpaAdminFactory;
import com.thandiswa.service.Impl.Staff.SpaAdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


@RestController
@RequestMapping("/spa/spaAdmin")
public class SpaAdminController {
    @Autowired
    private SpaAdminServiceImpl service;
   /* private Map<String, String> values;

    @GetMapping("/create/{password}")
    @ResponseBody
    public SpaAdmin create(@PathVariable String password){
        values = new HashMap<>();
        SpaAdmin spaAdmin = SpaAdminFactory.getSpaAdmin(values, password);
        return service.create(spaAdmin);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<SpaAdmin> getAll(){
        return service.getAll();
    }

    */
}
