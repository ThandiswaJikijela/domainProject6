package com.thandiswa.controller.Staff;

import com.thandiswa.domain.ResponseObj;
import com.thandiswa.domain.Staff.SpaAdmin;
import com.thandiswa.factory.ResponseObjFactory;
import com.thandiswa.factory.Staff.SpaAdminFactory;
import com.thandiswa.service.Impl.Staff.SpaAdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


@RestController
@RequestMapping("/spa/lookup/spaAdmin")
public class SpaAdminController {

    @Autowired
    private SpaAdminServiceImpl spaAdminService;

    @PostMapping(value = "/create/{spaAdmin}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createSpaAdmin(@PathVariable String spaAdmin){
        System.out.println(spaAdmin);
        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "SpaAdmin created!");
        SpaAdmin spaAdmin1;
        if (spaAdmin == null || spaAdmin.trim().isEmpty() || spaAdmin.trim().equalsIgnoreCase("null")) {
            responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            responseObj.setResponseDescription("Provide admin!");
        } else {
            spaAdmin1 = spaAdminService.retrieveByDesc(spaAdmin);
            if (spaAdmin1 != null) {
                responseObj.setResponseDescription("Admin already exist!");
            } else {
                spaAdmin1 = SpaAdminFactory.getSpaAdmin(spaAdmin);
                spaAdmin1 = spaAdminService.create(spaAdmin1);
            }
            responseObj.setResponse(spaAdmin1);
        }
        return ResponseEntity.ok(responseObj);
    }

    @GetMapping(value = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAll(){
        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Success");
        Set<SpaAdmin> spaAdmins = spaAdminService.getAll();
        responseObj.setResponse(spaAdmins);
        return ResponseEntity.ok(responseObj);
    }

}
