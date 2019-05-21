package com.thandiswa.controller.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.FacialTreatment;
import com.thandiswa.factory.Treatment.Facial.FacialTreatmentFactory;
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
public class FacialTreatmentControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/facialTreatment";

    @Test
    public void create() {
        FacialTreatment facialTreatment = FacialTreatmentFactory.getFacialTreatment("Deep Cleansing","Raiboos");
        ResponseEntity<FacialTreatment> responseEntity = restTemplate.postForEntity(baseURL + "/create", facialTreatment, FacialTreatment.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        String skinCareProducts = "Purifying cleanser";
        FacialTreatment facialTreatment = restTemplate.getForObject(baseURL + "/facialTreatment/" +skinCareProducts, FacialTreatment.class);
        restTemplate.put(baseURL + "/facialTreatment/" +skinCareProducts, facialTreatment);
        FacialTreatment updatedFacialTreatment = restTemplate.getForObject(baseURL + "/facialTreatment/" +skinCareProducts, FacialTreatment.class);
        assertNotNull(updatedFacialTreatment);
    }

    @Test
    public void delete() {
        String treatmentID = "td8974T";
        FacialTreatment facialTreatment = restTemplate.getForObject(baseURL + "/facialTreatments/"+treatmentID, FacialTreatment.class);
        assertNotNull(facialTreatment);
        restTemplate.delete(baseURL + "/facialTreatments/" + treatmentID);
        try {
            facialTreatment = restTemplate.getForObject(baseURL + "/facialTreatments/" + treatmentID, FacialTreatment.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetFacialTreatment() {
        FacialTreatment facialTreatment = restTemplate.getForObject(baseURL +"/facialTreatment/1", FacialTreatment.class);
        System.out.println(facialTreatment.getSkinCareProducts());
        assertNotNull(facialTreatment);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}