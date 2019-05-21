package com.thandiswa.controller.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.AntAgingFacial;
import com.thandiswa.factory.Treatment.Facial.AntiAgingFacialFactory;
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
public class AntiAgingFacialControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/antAgingFacial";

    @Test
    public void create() {
        AntAgingFacial agingFacial = AntiAgingFacialFactory.getAntAgingFacial("Lavender");

        ResponseEntity<AntAgingFacial> responseEntity = restTemplate.postForEntity(baseURL + "/create", agingFacial, AntAgingFacial.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        int id = 1;
        AntAgingFacial agingFacial = restTemplate.getForObject(baseURL + "/antiAging/" +id, AntAgingFacial.class);

        restTemplate.put(baseURL + "/antiAging/" +id, agingFacial);
        AntAgingFacial updatedAntAgingFacial = restTemplate.getForObject(baseURL + "/antiAging/" +id, AntAgingFacial.class);
        assertNotNull(updatedAntAgingFacial);
    }

    @Test
    public void delete() {
        String poreIngredients = "RoseMary";
        AntAgingFacial agingFacial = restTemplate.getForObject(baseURL + "/antiAgings/"+poreIngredients, AntAgingFacial.class);
        assertNotNull(agingFacial);
        restTemplate.delete(baseURL + "/antiAgings/" + poreIngredients);
        try {
            agingFacial = restTemplate.getForObject(baseURL + "/antiAgings/" + poreIngredients, AntAgingFacial.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetAntAging() {
        AntAgingFacial agingFacial = restTemplate.getForObject(baseURL +"/antiAging/1", AntAgingFacial.class);
        System.out.println(agingFacial.getPoreIngredients());
        assertNotNull(agingFacial);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}