package com.thandiswa.controller.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyScrub;
import com.thandiswa.factory.Treatment.Body.BodyScrubFactory;
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
public class BodyScrubControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/bodyScrub";

    @Test
    public void create() {
        BodyScrub bodyScrub = BodyScrubFactory.getBodyScrub("Coffee grounds");

        ResponseEntity<BodyScrub> responseEntity = restTemplate.postForEntity(baseURL + "/create", bodyScrub, BodyScrub.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        int id = 1;
        BodyScrub bodyScrub = restTemplate.getForObject(baseURL + "/bodyScrub/" +id, BodyScrub.class);

        restTemplate.put(baseURL + "/bodyScrub/" +id, bodyScrub);
        BodyScrub updatedBodyScrub = restTemplate.getForObject(baseURL + "/bodyScrub/" +id, BodyScrub.class);
        assertNotNull(updatedBodyScrub);
    }

    @Test
    public void delete() {
        String grittyIngredients = "Salt";
        BodyScrub bodyScrub = restTemplate.getForObject(baseURL + "/bodyScrubs/"+grittyIngredients, BodyScrub.class);
        assertNotNull(bodyScrub);
        restTemplate.delete(baseURL + "/bodyScrubs/" + grittyIngredients);
        try {
            bodyScrub = restTemplate.getForObject(baseURL + "/bodyScrubs/" + grittyIngredients, BodyScrub.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetBodyScrub() {
        BodyScrub bodyScrub = restTemplate.getForObject(baseURL +"/bodyScrub/1", BodyScrub.class);
        System.out.println(bodyScrub.getGrittyIngredients());
        assertNotNull(bodyScrub);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}