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

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class MemberControllerTest {
    private static final String BASE_URL = "http://localhost:8080/spa/lookup/member";

    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    public void createMember() {
        ResponseEntity result = restTemplate.withBasicAuth("member", "member")
                .postForEntity(BASE_URL + "/create/phone", null, String.class);
        System.out.println(result.getBody());
        assertEquals(HttpStatus.OK, result.getStatusCode());
    }

    @Test
    public void getAll() {
        ResponseEntity<String> result = restTemplate.withBasicAuth("user", "password")
                .getForEntity(BASE_URL + "/getall", String.class);
        System.out.println(result.getBody());
        assertEquals(HttpStatus.OK, result.getStatusCode());
    }
}