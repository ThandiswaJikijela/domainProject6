package com.thandiswa.controller.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Pedicure;
import com.thandiswa.factory.Treatment.Nail.PedicureFactory;
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
public class PedicureControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/pedicure";

    @Test
    public void create() {
        Pedicure pedicure = PedicureFactory.getPedicure("filler");

        ResponseEntity<Pedicure> responseEntity = restTemplate.postForEntity(baseURL + "/create", pedicure, Pedicure.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        int id = 1;
        Pedicure bodyMask = restTemplate.getForObject(baseURL + "/pedicure/" +id, Pedicure.class);

        restTemplate.put(baseURL + "/pedicure/" +id, bodyMask);
        Pedicure updatedPedicure = restTemplate.getForObject(baseURL + "/pedicure/" +id, Pedicure.class);
        assertNotNull(updatedPedicure);
    }

    @Test
    public void delete() {
        int id = 1;
        Pedicure pedicure = restTemplate.getForObject(baseURL + "/pedicures/"+id, Pedicure.class);
        assertNotNull(pedicure);
        restTemplate.delete(baseURL + "/pedicures/" + id);
        try {
            pedicure = restTemplate.getForObject(baseURL + "/pedicures/" + id, Pedicure.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetPedicure() {
        Pedicure pedicure = restTemplate.getForObject(baseURL +"/pedicure/1", Pedicure.class);
        System.out.println(pedicure.getMediHeelPedicure());
        assertNotNull(pedicure);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}