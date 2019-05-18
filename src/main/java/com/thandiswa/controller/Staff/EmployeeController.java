package com.thandiswa.controller.Staff;

import com.thandiswa.domain.Staff.Employee;
import com.thandiswa.factory.Staff.EmployeeFactory;
import com.thandiswa.service.Impl.Staff.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/spa/employee")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl service;
    private Map<String, String> values;

   /* @GetMapping("/create/{username}")
    public @ResponseBody
    Employee create(@PathVariable String username){
        values = new HashMap<String,String>();
        Employee employee = EmployeeFactory.getEmployee(values,username);
        return service.create(employee);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Employee> getAll(){
        return service.getAll();
    }

    */
}
