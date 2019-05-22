package com.thandiswa.controller.Login;

import com.thandiswa.domain.LogIn.Register;
import com.thandiswa.factory.LogIn.RegisterFactory;
import org.junit.Assert;
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
public class RegisterControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/register";

    @Test
    public void create() {
        Register register = RegisterFactory.getRegister("Moss","moss@gmail.com");

        ResponseEntity<Register> responseEntity = restTemplate.postForEntity(baseURL + "/create", register, Register.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        String regID = "re658#";
        Register register = restTemplate.getForObject(baseURL + "/register/" +regID, Register.class);

        restTemplate.put(baseURL + "/register/" +regID, register);
        Register updatedRegister = restTemplate.getForObject(baseURL + "/Register/" +regID, Register.class);
        assertNotNull(updatedRegister);
    }

    @Test
    public void delete() {
        String regID = "re345";
        Register register = restTemplate.getForObject(baseURL + "/registers/"+regID, Register.class);
        assertNotNull(register);
        restTemplate.delete(baseURL + "/registers/" + regID);
        try {
            register = restTemplate.getForObject(baseURL + "/registers/" + regID, Register.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetRegister() {
        Register register = restTemplate.getForObject(baseURL +"/register/1", Register.class);
        System.out.println(register.getEmail());
        assertNotNull(register);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody(),response);
    }
}