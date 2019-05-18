package com.thandiswa.repository.Impl;

import com.thandiswa.domain.Member;
import com.thandiswa.repository.MemberRepository;

import java.util.*;

public class MemberRepositoryImpl implements MemberRepository {

    private static MemberRepositoryImpl repository = null;
    private Map<String, Member> memberMap;

    private MemberRepositoryImpl(){
        this.memberMap = new HashMap<String, Member>();
    }

    public static MemberRepositoryImpl getRepository()
    {
        if (repository == null) repository = new MemberRepositoryImpl();
        return repository;
    }

    @Override
    public Member create(Member member) {
        this.memberMap.put(member.toString(),member);
        return member;
    }

    @Override
    public Member read(String m) {
        Member treatment = memberMap.get(toString());
        return treatment;
    }

    @Override
    public Member update(Member member) {
        this.memberMap.put(member.toString(),member);
        return this.memberMap.get(member.toString());
    }

    @Override
    public void delete(String m) {
        memberMap.remove(toString());
    }

    @Override
    public Set<Member> getAll() {
        Collection<Member> members = this.memberMap.values();
        Set<Member> set = new HashSet<>();
        set.addAll(members);
        return set;
    }
}
