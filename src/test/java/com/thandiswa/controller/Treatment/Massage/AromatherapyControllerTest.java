package com.thandiswa.controller.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.Aromatherapy;
import com.thandiswa.factory.Treatment.Massage.AromatherapyFactory;
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
public class AromatherapyControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/aromatherapy";

    @Test
    public void create() {
        Aromatherapy aromatherapy = AromatherapyFactory.getAromatherapy("floral");

        ResponseEntity<Aromatherapy> responseEntity = restTemplate.postForEntity(baseURL + "/create", aromatherapy, Aromatherapy.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        int id = 1;
        Aromatherapy aromatherapy = restTemplate.getForObject(baseURL + "/bodyMask/" +id, Aromatherapy.class);

        restTemplate.put(baseURL + "/bodyMask/" +id, aromatherapy);
        Aromatherapy updatedAromatherapy = restTemplate.getForObject(baseURL + "/bodyMask/" +id, Aromatherapy.class);
        assertNotNull(updatedAromatherapy);
    }

    @Test
    public void delete() {
        String fragmentessentialOil = "Jojoba";
        Aromatherapy aromatherapy = restTemplate.getForObject(baseURL + "/aromatherapys/"+fragmentessentialOil, Aromatherapy.class);
        assertNotNull(aromatherapy);
        restTemplate.delete(baseURL + "/bodyMasks/" + fragmentessentialOil);
        try {
            aromatherapy = restTemplate.getForObject(baseURL + "/aromatherapys/" + fragmentessentialOil, Aromatherapy.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetAromatherapy() {
        Aromatherapy aromatherapy = restTemplate.getForObject(baseURL +"/bodyMask/1", Aromatherapy.class);
        System.out.println(aromatherapy.getFragrantEssentialOil());
        assertNotNull(aromatherapy);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}