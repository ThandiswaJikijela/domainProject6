package com.thandiswa.controller;

import com.thandiswa.domain.Spa;
import com.thandiswa.factory.SpaFactory;
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
public class SpaControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/spa";

    @Test
    public void create() {
        Spa spa = SpaFactory.getSpa("Goodwood","Serenity Spa");

        ResponseEntity<Spa> responseEntity = restTemplate.postForEntity(baseURL + "/create", spa, Spa.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        String spaId = "sp7639S";
        Spa spa = restTemplate.getForObject(baseURL + "/spa/" +spaId, Spa.class);

        restTemplate.put(baseURL + "/spa/" +spaId, spa);
        Spa updatedSpa = restTemplate.getForObject(baseURL + "/Spa/" +spaId, Spa.class);
        assertNotNull(updatedSpa);
    }

    @Test
    public void delete() {
        String spaId = "sp9092S";
        Spa spa = restTemplate.getForObject(baseURL + "/spas/"+spaId, Spa.class);
        assertNotNull(spa);
        restTemplate.delete(baseURL + "/spas/" + spaId);
        try {
            spa = restTemplate.getForObject(baseURL + "/spas/" + spaId, Spa.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetSpa() {
        Spa spa = restTemplate.getForObject(baseURL +"/spa/1", Spa.class);
        System.out.println(spa.getSpaName());
        assertNotNull(spa);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}