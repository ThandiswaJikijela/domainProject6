package factory.Booking;

import domain.Booking.Booking;

public class BookingFactory {
    public static Booking getBooking(String reservationID, String treatmentType, double totalPrice) {
        return new Booking.Builder().reservationID(reservationID)
                .treatmentType(treatmentType)
                .totalPrice(totalPrice)
                .build();
    }
}
