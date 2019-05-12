package com.thandiswa.controller;

import com.thandiswa.domain.Member;
import com.thandiswa.factory.MemberFactory;
import com.thandiswa.service.Impl.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/spa/Member")
public class MemberController {
    @Autowired
    private MemberServiceImpl service;
    private Map<String, String> values;

    @GetMapping("/create/{address}")
    public @ResponseBody
    Member create(@PathVariable String address){
        values = new HashMap<String,String>();
        Member member = MemberFactory.getMember(values,address);
        return service.create(member);
    }

    @GetMapping("/getall")
    @ResponseBody
    public Set<Member> getAll(){
        return service.getAll();
    }
}
