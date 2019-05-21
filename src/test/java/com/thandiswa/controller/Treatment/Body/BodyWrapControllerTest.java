package com.thandiswa.controller.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyWraps;
import com.thandiswa.factory.Treatment.Body.BodyWrapFactory;
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
public class BodyWrapControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/bodyWraps";

    @Test
    public void create() {
        BodyWraps bodyWraps = BodyWrapFactory.getBodyWraps("Slimming wraps");

        ResponseEntity<BodyWraps> responseEntity = restTemplate.postForEntity(baseURL + "/create", bodyWraps, BodyWraps.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        int id = 1;
        BodyWraps bodyWraps = restTemplate.getForObject(baseURL + "/bodyWraps/" +id, BodyWraps.class);

        restTemplate.put(baseURL + "/bodyWraps/" +id, bodyWraps);
        BodyWraps updatedBodyWraps = restTemplate.getForObject(baseURL + "/bodyWraps/" +id, BodyWraps.class);
        assertNotNull(updatedBodyWraps);
    }

    @Test
    public void delete() {
        String maskMaterials = "Body detox wraps";
        BodyWraps bodyWraps = restTemplate.getForObject(baseURL + "/bodyWraps/"+maskMaterials, BodyWraps.class);
        assertNotNull(bodyWraps);
        restTemplate.delete(baseURL + "/bodyWraps/" + maskMaterials);
        try {
            bodyWraps = restTemplate.getForObject(baseURL + "/bodyWraps/" + maskMaterials, BodyWraps.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetBodyWraps() {
        BodyWraps bodyWraps = restTemplate.getForObject(baseURL +"/bodyWraps/1", BodyWraps.class);
        System.out.println(bodyWraps.getWrapMaterials());
        assertNotNull(bodyWraps);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}