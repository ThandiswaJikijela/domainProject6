package com.thandiswa.controller.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyMask;
import com.thandiswa.factory.Treatment.Body.BodyMaskFactory;
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
public class BodyMaskControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/bodyMask";

    @Test
    public void create() {
        BodyMask bodyMask = BodyMaskFactory.getBodyMask("Clay");

        ResponseEntity<BodyMask> responseEntity = restTemplate.postForEntity(baseURL + "/create", bodyMask, BodyMask.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        int id = 1;
        BodyMask bodyMask = restTemplate.getForObject(baseURL + "/bodyMask/" +id, BodyMask.class);

        restTemplate.put(baseURL + "/bodyMask/" +id, bodyMask);
        BodyMask updatedBodyMask = restTemplate.getForObject(baseURL + "/bodyMask/" +id, BodyMask.class);
        assertNotNull(updatedBodyMask);
    }

    @Test
    public void delete() {
        String maskIngredients = "Seaweed";
        BodyMask bodyMask = restTemplate.getForObject(baseURL + "/bodyMasks/"+maskIngredients, BodyMask.class);
        assertNotNull(bodyMask);
        restTemplate.delete(baseURL + "/bodyMasks/" + maskIngredients);
        try {
            bodyMask = restTemplate.getForObject(baseURL + "/bodyMasks/" + maskIngredients, BodyMask.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetBodyMask() {
        BodyMask bodyMask = restTemplate.getForObject(baseURL +"/bodyMask/1", BodyMask.class);
        System.out.println(bodyMask.getMaskIngredients());
        assertNotNull(bodyMask);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}