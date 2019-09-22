package com.thandiswa.repository.Impl;

import com.thandiswa.domain.Member;
import com.thandiswa.factory.MemberFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import com.thandiswa.repository.MemberRepository;
import org.junit.runners.MethodSorters;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MemberRepositoryImplTest {
    private MemberRepository repository;
    private Member member;

    @Before
    public void setUp() throws Exception {
        repository = MemberRepositoryImpl.getMemberRepository();
        this.member = MemberFactory.getMember("East London","King","0864524362");
    }

    @Test
    public void create() {
        Member created = this.repository.create(this.member);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created,this.member);
    }

    @Test
    public void read() {
        System.out.println("In read, phone number = "+ member.getPhoneNumber());
        Member read = this.repository.read(member.getPhoneNumber());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(member,read);
    }

    @Test
    public void update() {
        String newPhoneNumber = "083765757";
        Member updated = new Member.Builder().phoneNumber(newPhoneNumber).build();
        System.out.println("In update, about_to_updated = " + member.getPhoneNumber());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newPhoneNumber, updated.getPhoneNumber());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(member.getMemberId());
        getAll();
    }

    @Test
    public void getAll() {
        Set<Member> members = this.repository.getAll();
        //System.out.println("In getAll, all = " + members);
    }
}