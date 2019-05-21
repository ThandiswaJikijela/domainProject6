package com.thandiswa.controller.Treatment;

import com.thandiswa.domain.Treatment.Treatment;
import com.thandiswa.factory.Treatment.TreatmentFactory;
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
public class TreatmentControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/treatment";

    @Test
    public void create() {
        Treatment treatment = TreatmentFactory.getTreatment("Nail treatment: pedicure","Pedicure");

        ResponseEntity<Treatment> responseEntity = restTemplate.postForEntity(baseURL + "/create", treatment, Treatment.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        String treatmentID = "tr87579T";
        Treatment treatment = restTemplate.getForObject(baseURL + "/treatment/" +treatmentID, Treatment.class);

        restTemplate.put(baseURL + "/treatment/" +treatmentID, treatment);
        Treatment updatedTreatment = restTemplate.getForObject(baseURL + "/Treatment/" +treatmentID, Treatment.class);
        assertNotNull(updatedTreatment);
    }

    @Test
    public void delete() {
        String treatmentID = "tr98745T";
        Treatment treatment = restTemplate.getForObject(baseURL + "/treatments/"+treatmentID, Treatment.class);
        assertNotNull(treatment);
        restTemplate.delete(baseURL + "/treatments/" + treatmentID);
        try {
            treatment = restTemplate.getForObject(baseURL + "/treatments/" + treatmentID, Treatment.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetTreatment() {
        Treatment treatment = restTemplate.getForObject(baseURL +"/treatment/1", Treatment.class);
        System.out.println(treatment.getTreatmentID());
        assertNotNull(treatment);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}