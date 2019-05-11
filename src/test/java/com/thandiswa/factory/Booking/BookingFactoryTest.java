package com.thandiswa.factory.Booking;

import com.thandiswa.domain.Booking.Booking;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class BookingFactoryTest {
    private Map<String, String> values;

    @Test
    public void getBooking() {
        values = new HashMap<String,String>();
        String reservationID = "8756R";
        String treatmentType = "Massage Treatment";
        double totalPrice = 400.30;
        Booking book = BookingFactory.getBooking(values, reservationID, treatmentType, totalPrice);
        System.out.println(book);
        Assert.assertNotNull(book.toString());
    }
}