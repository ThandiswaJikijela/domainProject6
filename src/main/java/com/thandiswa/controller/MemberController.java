package com.thandiswa.controller;

import com.thandiswa.domain.Member;
import com.thandiswa.domain.ResponseObj;
import com.thandiswa.factory.MemberFactory;
import com.thandiswa.factory.ResponseObjFactory;
import com.thandiswa.service.Impl.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/spa/lookup/member")
public class MemberController {

    @Autowired
    private MemberServiceImpl memberService;

    @PostMapping(value = "/create/{member}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createMember(@PathVariable String member){
        System.out.println(member);
        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Member created!");
        Member member1;
        if (member == null || member.trim().isEmpty() || member.trim().equalsIgnoreCase("null")) {
            responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            responseObj.setResponseDescription("Provide member!");
        } else {
            member1 = memberService.retrieveByDesc(member);
            if (member1 != null) {
                responseObj.setResponseDescription("Member already exist!");
            } else {
                member1 = MemberFactory.getMember(member,member,member);
                member1 = memberService.create(member1);
            }
            responseObj.setResponse(member1);
        }
        return ResponseEntity.ok(responseObj);
    }

    @GetMapping(value = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAll(){
        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Success");
        Set<Member> members = memberService.getAll();
        responseObj.setResponse(members);
        return ResponseEntity.ok(responseObj);
    }



}
