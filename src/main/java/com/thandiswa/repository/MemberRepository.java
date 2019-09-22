package com.thandiswa.repository;

import com.thandiswa.domain.Member;

import java.util.Set;

public interface MemberRepository extends IRepository<Member, String>{
    Member retrieveByDesc(String memberDesc);
    Set<Member> getAll();
}
