package com.thandiswa.factory.Booking;

import com.thandiswa.domain.Booking.Booking;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class BookingFactoryTest {

    @Test
    public void getBooking() {

        String treatmentType ="Massage Treatment";
        double totalPrice = 400.30;
        Booking book = BookingFactory.getBooking(treatmentType, totalPrice);
        System.out.println(book);
        Assert.assertNotNull(book.toString());
    }
}