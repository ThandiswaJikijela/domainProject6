package com.thandiswa.controller.Login;

import com.thandiswa.domain.LogIn.LogIn;
import com.thandiswa.factory.LogIn.LogInFactory;
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
public class LoginControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/logIn";

    @Test
    public void create() {
        LogIn logIn = LogInFactory.getLogIn("tha@26#","Thandie");

        ResponseEntity<LogIn> responseEntity = restTemplate.postForEntity(baseURL + "/create", logIn, LogIn.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        String staffID = "54474th";
        LogIn logIn = restTemplate.getForObject(baseURL + "/logIn/" +staffID, LogIn.class);

        restTemplate.put(baseURL + "/logIn/" +staffID, logIn);
        LogIn updatedLogin = restTemplate.getForObject(baseURL + "/LogIn/" +staffID,LogIn.class);
        assertNotNull(updatedLogin);
    }

    @Test
    public void delete() {
        String staffID = "645gd";
        LogIn logIn = restTemplate.getForObject(baseURL + "/logIns/"+staffID, LogIn.class);
        assertNotNull(logIn);
        restTemplate.delete(baseURL + "/logIns/" + staffID);
        try {
            logIn = restTemplate.getForObject(baseURL + "/logIns/" + staffID, LogIn.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetLogIn() {
        LogIn logIn = restTemplate.getForObject(baseURL +"/logIn/1", LogIn.class);
        System.out.println(logIn.getUsername());
        assertNotNull(logIn);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}