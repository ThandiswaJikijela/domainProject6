package com.thandiswa.controller.Staff;

import com.thandiswa.domain.ResponseObj;
import com.thandiswa.domain.Staff.Employee;
import com.thandiswa.factory.ResponseObjFactory;
import com.thandiswa.factory.Staff.EmployeeFactory;
import com.thandiswa.service.Impl.Staff.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/spa/lookup/employee")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;

    @PostMapping(value = "/create/{employee}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createEmployee(@PathVariable String employee){
        System.out.println(employee);
        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Employee created!");
        Employee employee1;
        if (employee == null || employee.trim().isEmpty() || employee.trim().equalsIgnoreCase("null")) {
            responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            responseObj.setResponseDescription("Provide employee!");
        } else {
            employee1 = employeeService.retrieveByDesc(employee);
            if (employee1 != null) {
                responseObj.setResponseDescription("Employee already exist!");
            } else {
                employee1 = EmployeeFactory.getEmployee(employee,employee);
                employee1 = employeeService.create(employee1);
            }
            responseObj.setResponse(employee1);
        }
        return ResponseEntity.ok(responseObj);
    }

    @GetMapping(value = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAll(){
        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Success");
        Set<Employee> employees = employeeService.getAll();
        responseObj.setResponse(employees);
        return ResponseEntity.ok(responseObj);
    }
}
