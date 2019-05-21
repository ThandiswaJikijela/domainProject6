package com.thandiswa.controller;

import com.thandiswa.domain.Member;
import com.thandiswa.factory.MemberFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class MemberControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/member";

    @Test
    public void create() {
        Member member = MemberFactory.getMember("Mthatha","Khangelani", "0785435473");

        ResponseEntity<Member> responseEntity = restTemplate.postForEntity(baseURL + "/create", member, Member.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        String memberId = "me7865!";
        Member member = restTemplate.getForObject(baseURL + "/member/" +memberId, Member.class);

        restTemplate.put(baseURL + "/member/" +memberId, member);
        Member updatedMember = restTemplate.getForObject(baseURL + "/Member/" +memberId, Member.class);
        assertNotNull(updatedMember);
    }

    @Test
    public void delete() {
        String memberId = "me896*";
        Member member = restTemplate.getForObject(baseURL + "/members/"+memberId, Member.class);
        assertNotNull(member);
        restTemplate.delete(baseURL + "/members/" + memberId);
        try {
            member = restTemplate.getForObject(baseURL + "/members/" + memberId, Member.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetMember() {
        Member member = restTemplate.getForObject(baseURL +"/member/1", Member.class);
        System.out.println(member.getPhoneNumber());
        assertNotNull(member);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}