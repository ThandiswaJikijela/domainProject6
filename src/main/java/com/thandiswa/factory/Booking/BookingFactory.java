package com.thandiswa.factory.Booking;

import com.thandiswa.domain.Booking.Booking;

import java.util.Map;

public class BookingFactory {
    public static Booking getBooking(Map<String, String> values, String reservationID, String treatmentType, double totalPrice) {
        return new Booking.Builder().reservationID(reservationID)
                .treatmentType(treatmentType)
                .totalPrice(totalPrice)
                .build();
    }
}
