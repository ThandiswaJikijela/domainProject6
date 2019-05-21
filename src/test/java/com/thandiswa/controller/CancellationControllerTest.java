package com.thandiswa.controller;

import com.thandiswa.domain.Cancellation;
import com.thandiswa.factory.CancellationFactory;
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
public class CancellationControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/cancellation";

    @Test
    public void create() {
        Cancellation cancellation = CancellationFactory.getCancelation("Cheque");

        ResponseEntity<Cancellation> responseEntity = restTemplate.postForEntity(baseURL + "/create", cancellation, Cancellation.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        String reservationID = "pa7583";
        Cancellation cancellation = restTemplate.getForObject(baseURL + "/cancellation/" +reservationID, Cancellation.class);

        restTemplate.put(baseURL + "/booking/" +reservationID, cancellation);
        Cancellation updatedCancellation = restTemplate.getForObject(baseURL + "/Cancellation/" +reservationID, Cancellation.class);
        assertNotNull(updatedCancellation);
    }

    @Test
    public void delete() {
        String reservationID = "pa9674";
        Cancellation cancellation = restTemplate.getForObject(baseURL + "/cancellations/"+reservationID, Cancellation.class);
        assertNotNull(cancellation);
        restTemplate.delete(baseURL + "/cancellations/" + reservationID);
        try {
            cancellation = restTemplate.getForObject(baseURL + "/cancellations/" + reservationID, Cancellation.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetCancellation() {
        Cancellation cancellation = restTemplate.getForObject(baseURL +"/cancellation/1", Cancellation.class);
        System.out.println(cancellation.getReservationID());
        assertNotNull(cancellation);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}