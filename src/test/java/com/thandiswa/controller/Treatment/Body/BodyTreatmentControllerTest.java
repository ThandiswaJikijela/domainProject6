package com.thandiswa.controller.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyTreatment;
import com.thandiswa.factory.Treatment.Body.BodyTreatmentFactory;
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
public class BodyTreatmentControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/bodyTreatment";

    @Test
    public void create() {
        BodyTreatment bodyTreatment = BodyTreatmentFactory.getBodyTreatment("Body Mask");

        ResponseEntity<BodyTreatment> responseEntity = restTemplate.postForEntity(baseURL + "/create", bodyTreatment, BodyTreatment.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        String treatmentID = "td97248T";
        BodyTreatment bodyTreatment = restTemplate.getForObject(baseURL + "/bodyTreatment/" +treatmentID, BodyTreatment.class);

        restTemplate.put(baseURL + "/bodyTreatment/" +treatmentID, bodyTreatment);
        BodyTreatment updatedBodyTreatment = restTemplate.getForObject(baseURL + "/bodyTreatment/" +treatmentID, BodyTreatment.class);
        assertNotNull(updatedBodyTreatment);
    }

    @Test
    public void delete() {
        String treatmentType = "Body Wrap";
        BodyTreatment bodyTreatment = restTemplate.getForObject(baseURL + "/bodyTreatments/"+treatmentType, BodyTreatment.class);
        assertNotNull(bodyTreatment);
        restTemplate.delete(baseURL + "/bodyTreatments/" + treatmentType);
        try {
            bodyTreatment = restTemplate.getForObject(baseURL + "/BodyTreatments/" + treatmentType, BodyTreatment.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetBodyTreatment() {
        BodyTreatment bodyTreatment = restTemplate.getForObject(baseURL +"/bodyTreatment/1", BodyTreatment.class);
        System.out.println(bodyTreatment.getTreatmentID());
        assertNotNull(bodyTreatment);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}