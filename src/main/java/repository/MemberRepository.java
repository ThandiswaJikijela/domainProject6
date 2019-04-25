package repository;

import domain.Member;

import java.util.Set;

public interface MemberRepository extends IRepository<Member, String>{
    Set<Member> getAll();
}
