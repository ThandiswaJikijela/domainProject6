package com.thandiswa.service.Impl;

import com.thandiswa.domain.Member;
import com.thandiswa.factory.MemberFactory;
import com.thandiswa.repository.Impl.MemberRepositoryImpl;
import com.thandiswa.repository.MemberRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MemberServiceImplTest {
    private MemberRepository repository;
    private Member member;

    @Before
    public void setUp() throws Exception {
        repository = MemberRepositoryImpl.getMemberRepository();
        this.member = MemberFactory.getMember("PortElizabeth","Zandile","061763465");
    }

    @Test
    public void create() {
        Member created = this.repository.create(this.member);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created,this.member);
    }

    @Test
    public void update() {
        String newName = "Phambile";
        Member updated = new Member.Builder().name(newName).build();
        System.out.println("In update, about_to_updated = " + member.getName());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newName, updated.getName());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(member.getPhoneNumber());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, address = "+ member.getAddress());
        Member read = this.repository.read(member.getAddress());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(member,read);
    }

    @Test
    public void getAll() {
        Set<Member> members = this.repository.getAll();
        //System.out.println("In getAll, all = " + members);
    }
}