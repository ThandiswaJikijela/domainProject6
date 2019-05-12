package com.thandiswa.controller.Staff;

import com.thandiswa.domain.Staff.SpaAdmin;
import com.thandiswa.factory.Staff.SpaAdminFactory;
import com.thandiswa.service.Impl.Staff.SpaAdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping("/spa/spaAdmin")
public class SpaAdminController {
    @Autowired
    private SpaAdminServiceImpl service;

    @GetMapping("/create/{adminID}")
    public @ResponseBody
    SpaAdmin create(@PathVariable String adminID, String password){
        SpaAdmin spaAdmin = SpaAdminFactory.getSpaAdmin(adminID, password);
        return service.create(spaAdmin);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<SpaAdmin> getAll(){
        return service.getAll();
    }
}
