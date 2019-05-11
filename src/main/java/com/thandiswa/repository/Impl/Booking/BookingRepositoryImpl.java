package com.thandiswa.repository.Impl.Booking;

import com.thandiswa.domain.Booking.Booking;
import com.thandiswa.repository.Booking.BookingRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BookingRepositoryImpl implements BookingRepository{

    private static BookingRepositoryImpl repository = null;
    private Map<String,Booking> bookingTable;

    private BookingRepositoryImpl()
    {
        bookingTable = new HashMap<String,Booking>();
    }

    public static BookingRepository getRepository(){
        if(repository == null)
            repository = new BookingRepositoryImpl();
        return repository;
    }


    @Override
    public Booking create(Booking booking) {
        bookingTable.put(booking.getReservationID(),booking);
        Booking booking1 = bookingTable.get(booking.getReservationID());
        return booking1;
    }

    @Override
    public Booking update(Booking booking) {
        bookingTable.put(booking.getReservationID(),booking);
        bookingTable.put(booking.getTreatmentType(),booking);
        Booking booking1 = bookingTable.get(booking.toString());
        return booking1;
    }

    @Override
    public void delete(String reservationID) {

        bookingTable.remove(toString());
    }

    @Override
    public Booking read(String reservationID) {
        Booking booking = bookingTable.get(toString());
        return booking;
    }


    @Override
    public Set<Booking> getAll() {
        return (Set<Booking>) bookingTable;
    }
}
