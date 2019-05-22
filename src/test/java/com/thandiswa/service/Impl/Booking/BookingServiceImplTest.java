package com.thandiswa.service.Impl.Booking;

import com.thandiswa.domain.Booking.Booking;
import com.thandiswa.factory.Booking.BookingFactory;
import com.thandiswa.repository.Impl.Booking.BookingRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookingServiceImplTest {

    private BookingRepositoryImpl repository;
    private Booking booking;

    @Before
    public void setUp() throws Exception {
        this.repository = BookingRepositoryImpl.getRepository();
        this.booking = BookingFactory.getBooking("Swedish Massage", 300);
    }

    @Test
    public void create() {
        Booking created = this.repository.create(this.booking);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.booking);
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
        this.repository.delete(booking.getTreatmentType());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, treatmentType = "+ booking.getTreatmentType());
        Booking read = this.repository.read(booking.getTreatmentType());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(booking,read);
    }

    @Test
    public void getAll() {
        Set<Booking> bookings = this.repository.getAll();
        //System.out.println("In getAll, all = " + bookings);
    }
}