package com.thandiswa.controller;

import com.thandiswa.domain.Member;
import com.thandiswa.factory.MemberFactory;
import com.thandiswa.service.Impl.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/Member")
public class MemberController {
    @Autowired
    @Qualifier("ServiceMemberImpl")
    private MemberServiceImpl service;

    @GetMapping("/create/{name}")
    public @ResponseBody
    Member create(@PathVariable String name,String address, String phoneNumber){
        Member member = MemberFactory.getMember(name,address,phoneNumber);
        return service.create(member);
    }

    @PostMapping("/update")
    @ResponseBody
    public Member update(Member member){
        return service.update(member);
    }

    @PostMapping("/delete")
    @ResponseBody
    public void delete(String memberId){
        service.delete(memberId);
    }

    @PostMapping("/read")
    @ResponseBody
    public Member read(String memberId){
        return service.read(memberId);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Member> getAll(){
        return service.getAll();
    }


}
