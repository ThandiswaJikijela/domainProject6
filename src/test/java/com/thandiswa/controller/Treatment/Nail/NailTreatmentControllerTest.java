package com.thandiswa.controller.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.NailTreatment;
import com.thandiswa.factory.Treatment.Nail.NailTreatmentFactory;
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
public class NailTreatmentControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/nailTreatment";

    @Test
    public void create() {
        NailTreatment nailTreatment = NailTreatmentFactory.getNailTreatment("Pedicure","Oval nails");

        ResponseEntity<NailTreatment> responseEntity = restTemplate.postForEntity(baseURL + "/create", nailTreatment, NailTreatment.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        String treatmentID = "tr4210T";
        NailTreatment nailTreatment = restTemplate.getForObject(baseURL + "/nailTreatment/" +treatmentID, NailTreatment.class);

        restTemplate.put(baseURL + "/nailTreatment/" +treatmentID, nailTreatment);
        NailTreatment updatedNailTreatment = restTemplate.getForObject(baseURL + "/nailTreatment/" +treatmentID, NailTreatment.class);
        assertNotNull(updatedNailTreatment);
    }

    @Test
    public void delete() {
        String treatmentID = "td78634T";
        NailTreatment nailTreatment = restTemplate.getForObject(baseURL + "/nailTreatments/"+treatmentID, NailTreatment.class);
        assertNotNull(nailTreatment);
        restTemplate.delete(baseURL + "/nailTreatments/" + treatmentID);
        try {
            nailTreatment = restTemplate.getForObject(baseURL + "/nailTreatments/" + treatmentID, NailTreatment.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetNailTreatment() {
        NailTreatment nailTreatment = restTemplate.getForObject(baseURL +"/nailTreatment/1", NailTreatment.class);
        System.out.println(nailTreatment.getNailShape());
        assertNotNull(nailTreatment);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody(),response);
    }
}