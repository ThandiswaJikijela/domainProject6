package com.thandiswa.controller.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.TissueMassage;
import com.thandiswa.factory.Treatment.Massage.TissueMassageFactory;
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
public class TissueMassageControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/tissueMassage";

    @Test
    public void create() {
        TissueMassage tissueMassage = TissueMassageFactory.getTissueMassage("Knot relaxer");

        ResponseEntity<TissueMassage> responseEntity = restTemplate.postForEntity(baseURL + "/create", tissueMassage, TissueMassage.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        int id = 1;
        TissueMassage tissueMassage = restTemplate.getForObject(baseURL + "/tissueMassage/" +id, TissueMassage.class);

        restTemplate.put(baseURL + "/tissueMassage/" +id, tissueMassage);
        TissueMassage updatedTissueMassage = restTemplate.getForObject(baseURL + "/tissueMassage/" +id, TissueMassage.class);
        assertNotNull(updatedTissueMassage);
    }

    @Test
    public void delete() {
        int id = 1;
        TissueMassage tissueMassage = restTemplate.getForObject(baseURL + "/tissueMassages/"+id, TissueMassage.class);
        assertNotNull(tissueMassage);
        restTemplate.delete(baseURL + "/tissueMassages/" + id);
        try {
            tissueMassage = restTemplate.getForObject(baseURL + "/tissueMassages/" + id, TissueMassage.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetTissueMassage() {
        TissueMassage tissueMassage = restTemplate.getForObject(baseURL +"/tissueMassage/1", TissueMassage.class);
        System.out.println(tissueMassage.getMassagePressure());
        assertNotNull(tissueMassage);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}