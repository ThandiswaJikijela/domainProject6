package com.thandiswa.controller.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.MassageTreatment;
import com.thandiswa.factory.Treatment.Massage.MassageTreatmentFactory;
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
public class MassageTreatmentControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/massageTreatment";

    @Test
    public void create() {
        MassageTreatment massageTreatment = MassageTreatmentFactory.getMassageTreatment("Aromatherapy");

        ResponseEntity<MassageTreatment> responseEntity = restTemplate.postForEntity(baseURL + "/create", massageTreatment, MassageTreatment.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        String treatmentID = "tr134T";
        MassageTreatment massageTreatment = restTemplate.getForObject(baseURL + "/massageTreatment/" +treatmentID, MassageTreatment.class);

        restTemplate.put(baseURL + "/massageTreatment/" +treatmentID, massageTreatment);
        MassageTreatment updatedBodyMask = restTemplate.getForObject(baseURL + "/massageTreatment/" +treatmentID, MassageTreatment.class);
        assertNotNull(updatedBodyMask);
    }

    @Test
    public void delete() {
        String massageType = "Swedish massage";
        MassageTreatment massageTreatment = restTemplate.getForObject(baseURL + "/massageTreatments/"+massageType, MassageTreatment.class);
        assertNotNull(massageTreatment);
        restTemplate.delete(baseURL + "/massageTreatments/" + massageType);
        try {
            massageTreatment = restTemplate.getForObject(baseURL + "/massageTreatments/" + massageType, MassageTreatment.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetMassageTreatment() {
        MassageTreatment massageTreatment = restTemplate.getForObject(baseURL +"/massageTreatment/1", MassageTreatment.class);
        System.out.println(massageTreatment.getTreatmentID());
        assertNotNull(massageTreatment);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}