package com.thandiswa.repository.Impl.Booking;


import com.thandiswa.domain.Booking.Booking;
import com.thandiswa.factory.Booking.BookingFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import com.thandiswa.repository.Booking.BookingRepository;
import org.junit.runners.MethodSorters;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookingRepositoryImplTest {
    private BookingRepository repository;
    private Booking booking;

    @Before
    public void setUp() throws Exception {
        this.repository = BookingRepositoryImpl.getRepository();
        this.booking = BookingFactory.getBooking("test Type",700);

    }

    @Test
    public void create() {

        Booking created = this.repository.create(this.booking);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created,this.booking);

    }

    @Test
    public void read() throws Exception{
    System.out.println("In read, treatmentType = "+ booking.getTreatmentType());
    Booking read = this.repository.read(booking.getTreatmentType());
    //System.out.println("In read, read = " + read);
    getAll();
    assertNotEquals(booking,read);
    }

    @Test
    public void update() {
    String newTreatmentType = "Nail Treatment";
    Booking updated = new Booking.Builder().treatmentType(newTreatmentType).build();
    System.out.println("In update, about_to_updated = " + booking.getTreatmentType());
    this.repository.update(updated);
    System.out.println("In update, updated = " + updated);
    assertEquals(newTreatmentType, updated.getTreatmentType());
    getAll();

    }

    @Test
    public void delete() {
        this.repository.delete(booking.getReservationID());
        getAll();
    }

    @Test
    public void getAll() {
        Set<Booking>bookings = this.repository.getAll();

    }
}