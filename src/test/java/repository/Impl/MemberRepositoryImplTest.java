package repository.Impl;

import domain.Member;
import factory.MemberFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import repository.MemberRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class MemberRepositoryImplTest {
    private MemberRepository repository;
    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {
        repository = MemberRepositoryImpl.getRepository();
        values = new HashMap<String, String>();
        values.put("name","King");
        values.put("id","875756582657");
        values.put("phoneNumber","087564264");
    }

    @Test
    public void create() {
        Member member = MemberFactory.getMember(values,"East London");
        repository.create(member);
        System.out.print(member);
        assertEquals("East London",member.getAddress());
    }

    @Test
    public void read() {
        Member readMember = repository.read("1");
        assertEquals("East London",readMember.getAddress());
    }

    @Test
    public void update() {
        Member member = repository.read("1");
        Member newMember= new Member.Builder()
                .name(values.get("name"))
                .address("Cape Town")
                .id(values.size())
                .phoneNumber(values.get("phoneNumber"))
                .build();
        repository.update(newMember);
        Member UpdateMember = repository.read("1");
        assertEquals("Cape Town",UpdateMember.getAddress());
    }

    @Test
    public void delete() {
        repository.delete("1");
        Member member = repository.read("1");
        assertNull(member);
    }

    @Test
    public void getAll() {
        Set<Member> member = this.repository.getAll();
        Assert.assertEquals(1,member.size());
    }
}