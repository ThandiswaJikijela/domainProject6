package com.thandiswa.factory.Booking;

import com.thandiswa.domain.Booking.Booking;
import com.thandiswa.util.IDs;


public class BookingFactory {
    public static Booking getBooking(String treatmentType, double totalPrice) {
        return new Booking.Builder().reservationID(IDs.generateId())
                .treatmentType(treatmentType)
                .totalPrice(totalPrice)
                .build();
    }

}
