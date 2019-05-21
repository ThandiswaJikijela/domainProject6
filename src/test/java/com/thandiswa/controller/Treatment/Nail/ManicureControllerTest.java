package com.thandiswa.controller.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Manicure;
import com.thandiswa.factory.Treatment.Nail.ManicureFactory;
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
public class ManicureControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/manicure";

    @Test
    public void create() {
        Manicure manicure = ManicureFactory.getManicure("Round nails");

        ResponseEntity<Manicure> responseEntity = restTemplate.postForEntity(baseURL + "/create", manicure, Manicure.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        int id = 1;
        Manicure manicure = restTemplate.getForObject(baseURL + "/manicure/" +id, Manicure.class);

        restTemplate.put(baseURL + "/manicure/" +id, manicure);
        Manicure updatedManicure = restTemplate.getForObject(baseURL + "/manicure/" +id, Manicure.class);
        assertNotNull(updatedManicure);
    }

    @Test
    public void delete() {
        String nailStyle = "Square nails";
        Manicure manicure = restTemplate.getForObject(baseURL + "/manicures/"+nailStyle, Manicure.class);
        assertNotNull(manicure);
        restTemplate.delete(baseURL + "/manicures/" + nailStyle);
        try {
            manicure = restTemplate.getForObject(baseURL + "/manicures/" + nailStyle, Manicure.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetManicure() {
        Manicure manicure = restTemplate.getForObject(baseURL +"/manicure/1", Manicure.class);
        System.out.println(manicure.getNailStyle());
        assertNotNull(manicure);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}