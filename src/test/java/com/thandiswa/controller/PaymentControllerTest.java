package com.thandiswa.controller;

import com.thandiswa.domain.Payment;
import com.thandiswa.factory.PaymentFactory;
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
public class PaymentControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/payment";

    @Test
    public void create() {
        Payment payment = PaymentFactory.getPayment("cd8465738",650);

        ResponseEntity<Payment> responseEntity = restTemplate.postForEntity(baseURL + "/create", payment, Payment.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        String memberId = "87346dt";
        Payment payment = restTemplate.getForObject(baseURL + "/payment/" +memberId, Payment.class);

        restTemplate.put(baseURL + "/payment/" +memberId, payment);
        Payment updatedPayment = restTemplate.getForObject(baseURL + "/Payment/" +memberId, Payment.class);
        assertNotNull(updatedPayment);
    }

    @Test
    public void delete() {
        String memberId = "4326dt";
        Payment payment = restTemplate.getForObject(baseURL + "/payments/"+memberId, Payment.class);
        assertNotNull(payment);
        restTemplate.delete(baseURL + "/payments/" + memberId);
        try {
            payment = restTemplate.getForObject(baseURL + "/payments/" + memberId, Payment.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetPayment() {
        Payment payment = restTemplate.getForObject(baseURL +"/payment/1", Payment.class);
        System.out.println(payment.getRefund());
        assertNotNull(payment);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}