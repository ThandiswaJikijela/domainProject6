package com.thandiswa.controller.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.SwedishMassage;
import com.thandiswa.factory.Treatment.Massage.SwedishMassageFactory;
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
public class SwedishMassageControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/swedishMassage";

    @Test
    public void create() {
        SwedishMassage swedishMassage = SwedishMassageFactory.getSwedishMassage("Avocado Oil");

        ResponseEntity<SwedishMassage> responseEntity = restTemplate.postForEntity(baseURL + "/create", swedishMassage, SwedishMassage.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        int id = 1;
        SwedishMassage swedishMassage = restTemplate.getForObject(baseURL + "/swedishMassage/" +id, SwedishMassage.class);

        restTemplate.put(baseURL + "/swedishMassage/" +id, swedishMassage);
        SwedishMassage updatedSwedishMassage = restTemplate.getForObject(baseURL + "/swedishMassage/" +id, SwedishMassage.class);
        assertNotNull(updatedSwedishMassage);
    }

    @Test
    public void delete() {
        String carrierOil = "Sunflower oil";
        SwedishMassage swedishMassage = restTemplate.getForObject(baseURL + "/swedishMassages/"+carrierOil, SwedishMassage.class);
        assertNotNull(swedishMassage);
        restTemplate.delete(baseURL + "/swedishMassages/" + carrierOil);
        try {
            swedishMassage = restTemplate.getForObject(baseURL + "/swedishMassages/" + carrierOil, SwedishMassage.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetSwedishMassage() {
        SwedishMassage swedishMassage = restTemplate.getForObject(baseURL +"/swedishMassage/1", SwedishMassage.class);
        System.out.println(swedishMassage.getCarrierOil());
        assertNotNull(swedishMassage);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}