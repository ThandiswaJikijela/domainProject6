package com.thandiswa.controller.Staff;

import com.thandiswa.domain.ResponseObj;
import com.thandiswa.domain.Staff.Staff;
import com.thandiswa.factory.ResponseObjFactory;
import com.thandiswa.factory.Staff.StaffFactory;
import com.thandiswa.service.Impl.Staff.StaffServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/spa/lookup/staff")
public class StaffController {

    @Autowired
    private StaffServiceImpl staffService;

    @PostMapping(value = "/create/{staff}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createStaff(@PathVariable String staff){
        System.out.println(staff);
        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Staff created!");
        Staff staff1;
        if (staff == null || staff.trim().isEmpty() || staff.trim().equalsIgnoreCase("null")) {
            responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            responseObj.setResponseDescription("Provide staff!");
        } else {
            staff1 = staffService.retrieveByDesc(staff);
            if (staff1 != null) {
                responseObj.setResponseDescription("Admin already exist!");
            } else {
                staff1 = StaffFactory.getStaff(staff,staff);
                staff1 = staffService.create(staff1);
            }
            responseObj.setResponse(staff1);
        }
        return ResponseEntity.ok(responseObj);
    }

    @GetMapping(value = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAll(){
        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Success");
        Set<Staff> staff = staffService.getAll();
        responseObj.setResponse(staff);
        return ResponseEntity.ok(responseObj);
    }
}
