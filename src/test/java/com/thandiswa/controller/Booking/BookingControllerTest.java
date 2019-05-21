package com.thandiswa.controller.Booking;

import com.thandiswa.domain.Booking.Booking;
import com.thandiswa.factory.Booking.BookingFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class BookingControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/booking";

    @Test
    public void create() {
        Booking booking = BookingFactory.getBooking("Massage",700);

        ResponseEntity<Booking> responseEntity = restTemplate.postForEntity(baseURL + "/create", booking, Booking.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void update() {
        String reservationID = "76263th";
       Booking booking = restTemplate.getForObject(baseURL + "/booking/" +reservationID, Booking.class);

       restTemplate.put(baseURL + "/booking/" +reservationID, booking);
       Booking updatedBooking = restTemplate.getForObject(baseURL + "/Booking/" +reservationID, Booking.class);
       assertNotNull(updatedBooking);
    }

    @Test
    public void delete() {
        String reservationID = "645gd";
        Booking booking = restTemplate.getForObject(baseURL + "/bookings/"+reservationID, Booking.class);
        assertNotNull(booking);
        restTemplate.delete(baseURL + "/bookings/" + reservationID);
        try {
            booking = restTemplate.getForObject(baseURL + "/bookings/" + reservationID, Booking.class);
        }catch(final HttpClientErrorException e){
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void testGetBooking() {
        Booking booking = restTemplate.getForObject(baseURL +"/booking/1", Booking.class);
        System.out.println(booking.getTreatmentType());
        assertNotNull(booking);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/add", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}