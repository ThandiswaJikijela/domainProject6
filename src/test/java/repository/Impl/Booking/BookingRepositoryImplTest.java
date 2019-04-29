package repository.Impl.Booking;


import domain.Booking.Booking;
import factory.Booking.BookingFactory;
import javafx.scene.effect.SepiaTone;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import repository.Booking.BookingRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class BookingRepositoryImplTest {
    private BookingRepository repository;
    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {
        this.repository = BookingRepositoryImpl.getRepository();
        values = new HashMap<String,String>();
    }

    @Test
    public void create() {
        Booking book = BookingFactory.getBooking(values,"01","Massage: TissueMassage",400.00);
        repository.create(book);
        System.out.println(book);
        assertEquals("01",book.getReservationID());
        assertEquals("Massage: TissueMassage",book.getTreatmentType());
        Assert.assertNotNull(book.getTotalPrice());

    }

    @Test
    public void read() throws Exception{
       Booking readBook = repository.read("1");
       Assert.assertNotNull(readBook.toString());

    }

    @Test
    public void update() {
       Booking readBook = repository.read("1");
        Booking newBooking = new Booking.Builder()
                .reservationID(values.get("reservationID"))
                .treatmentType(values.get("treatmentType"))
                .totalPrice(readBook.getTotalPrice())
                .build();
        repository.update(newBooking);
        Booking updateBooking = repository.read("1");


    }

    @Test
    public void delete() {
        repository.delete("1");
        Booking booking = repository.read("1");
        assertNotNull(booking);
    }

    @Test
    public void getAll() {
        Set<Booking>bookings = this.repository.getAll();
        Assert.assertEquals(1,bookings.size());
    }
}