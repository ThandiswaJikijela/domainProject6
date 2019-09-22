package com.thandiswa.repository.Impl;

import com.thandiswa.domain.Member;
import com.thandiswa.repository.MemberRepository;

import java.util.*;

public class MemberRepositoryImpl implements MemberRepository {

    private static MemberRepository memberRepository;

    private Set<Member> members;

    private MemberRepositoryImpl() {

        this.members = new HashSet<>();
    }

    public static MemberRepository getMemberRepository (){
        if (memberRepository == null) memberRepository = new MemberRepositoryImpl();
        return memberRepository;
    }

    @Override
    public Member create(Member member) {
        this.members.add(member);
        return member;
    }

    @Override
    public Member read(String s) {
        return this.members.stream()
                .filter(member -> member.getAddress().equalsIgnoreCase(s))
                .findAny()
                .orElse(null);
    }

    @Override
    public Member update(Member member) {
        Member member1 = read(member.getPhoneNumber());
        if (member1 != null) {
            delete(member1.getPhoneNumber());
            return create(member);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Member member = read(s);
        this.members.remove(member);
    }

    @Override
    public Member retrieveByDesc(String memberId) {
        return this.members.stream()
                .filter(member -> member.getMemberId().equalsIgnoreCase(memberId))
                .findAny().orElse(null);
    }

    @Override
    public Set<Member> getAll() {
        return this.members;
    }
}
