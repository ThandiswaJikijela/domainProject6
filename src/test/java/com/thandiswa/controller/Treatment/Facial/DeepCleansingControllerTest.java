package com.thandiswa.controller.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.DeepCleansing;
import com.thandiswa.factory.Treatment.Facial.DeepCleansingFactory;
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
public class DeepCleansingControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/deepCleansing";

    @Test
    public void create() {
        DeepCleansing deepCleansing = DeepCleansingFactory.getDeepCleansing("Carrier Oil");

        ResponseEntity<DeepCleansing> responseEntity = restTemplate.postForEntity(baseURL + "/create", deepCleansing, DeepCleansing.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        String treatmentType = "Facial treatment";
        DeepCleansing deepCleansing = restTemplate.getForObject(baseURL + "/deepCleansing/" +treatmentType, DeepCleansing.class);

        restTemplate.put(baseURL + "/deepCleansing/" +treatmentType, deepCleansing);
        DeepCleansing updatedDeepCleansing = restTemplate.getForObject(baseURL + "/deepCleansing/" +treatmentType, DeepCleansing.class);
        assertNotNull(updatedDeepCleansing);
    }

    @Test
    public void delete() {
        String facialID = "fd6457F";
        DeepCleansing deepCleansing = restTemplate.getForObject(baseURL + "/deepCleansings/"+facialID, DeepCleansing.class);
        assertNotNull(deepCleansing);
        restTemplate.delete(baseURL + "/deepCleansings/" + facialID);
        try {
            deepCleansing = restTemplate.getForObject(baseURL + "/deepCleansings/" + facialID, DeepCleansing.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetDeepCleansing() {
        DeepCleansing deepCleansing = restTemplate.getForObject(baseURL +"/deepCleansing/1", DeepCleansing.class);
        System.out.println(deepCleansing.getOilTypes());
        assertNotNull(deepCleansing);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}