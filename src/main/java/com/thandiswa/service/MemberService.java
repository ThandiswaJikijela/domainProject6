package com.thandiswa.service;

import com.thandiswa.domain.Member;

import java.util.Set;

public interface MemberService extends IService<Member, String> {
    Set<Member> getAll();
}
