package factory.Booking;

import domain.Booking.Booking;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookingFactoryTest {

    @Test
    public void getBooking() {
        String reservationID = "8756R";
        String treatmentType = "Massage Treatment";
        double totalPrice = 400.30;
        Booking book = BookingFactory.getBooking(reservationID, treatmentType, totalPrice);
        System.out.println(book);
        Assert.assertNotNull(book.toString());
    }
}