package com.thandiswa.controller.Staff;

import com.thandiswa.domain.Staff.Staff;
import com.thandiswa.factory.Staff.StaffFactory;
import com.thandiswa.service.Impl.Staff.StaffServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/spa/staff")
public class StaffController {
    @Autowired
    private StaffServiceImpl service;
    /*private Map<String, String> values;

    @GetMapping("/create/{email}")
    public @ResponseBody
    Staff create(@PathVariable String email){
        values = new HashMap<String,String>();
        Staff staff = StaffFactory.getStaff(values,email);
        return service.create(staff);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Staff> getAll(){
        return service.getAll();
    }

     */
}
