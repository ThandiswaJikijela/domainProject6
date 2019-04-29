package repository.Impl;

import domain.Member;
import repository.MemberRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        memberMap.put(member.getName(),member);
        memberMap.put(member.getAddress(),member);
        Member savedMember = memberMap.get(toString());
        return savedMember;
    }

    @Override
    public Member read(String m) {
        Member treatment = memberMap.get(toString());
        return treatment;
    }

    @Override
    public Member update(Member member) {
        memberMap.put(member.toString(),member);
        Member savedMember = memberMap.get(toString());
        return savedMember;
    }

    @Override
    public void delete(String m) {
        memberMap.remove(toString());
    }

    @Override
    public Set<Member> getAll() {
        return (Set<Member>) memberMap;
    }
}
