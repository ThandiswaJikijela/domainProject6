package com.thandiswa.service.Impl;

import com.thandiswa.domain.Member;
import com.thandiswa.repository.Impl.MemberRepositoryImpl;
import com.thandiswa.repository.MemberRepository;
import com.thandiswa.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ServiceMemberImpl")
public class MemberServiceImpl implements MemberService {
    @Autowired
    @Qualifier("InMemory")
    private static MemberServiceImpl service = null;
    private MemberRepository repository;

    private MemberServiceImpl() {
        this.repository = MemberRepositoryImpl.getRepository();
    }

    public static MemberServiceImpl getService(){
        if (service == null) service = new MemberServiceImpl();
        return service;
    }

    @Override
    public Member create(Member member) {
        return this.repository.create(member);
    }

    @Override
    public Member update(Member member) {
        return this.repository.update(member);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Member read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Member> getAll() {
        return this.repository.getAll();
    }
}
