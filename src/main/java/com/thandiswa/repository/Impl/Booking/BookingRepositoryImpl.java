package com.thandiswa.repository.Impl.Booking;

import com.thandiswa.domain.Booking.Booking;
import com.thandiswa.repository.Booking.BookingRepository;

import java.util.*;

public class BookingRepositoryImpl implements BookingRepository{

    private static BookingRepositoryImpl repository = null;
    private Map<String,Booking> bookingTable;


    private BookingRepositoryImpl()
    {
        bookingTable = new HashMap<>();
    }

    /*private Booking findBooking(final String reservationID){
        return this.bookingTable.stream()
                .filter(booking -> booking.getReservationID().trim().equals(reservationID))
                .findAny()
                .orElse(null);
    }*/

    public static BookingRepository getRepository(){
        if(repository == null)
            repository = new BookingRepositoryImpl();
        return repository;
    }


    @Override
    public Booking create(Booking booking) {
        this.bookingTable.put(booking.toString(),booking);
        return booking;
    }

    @Override
    public Booking update(Booking booking) {
       this.bookingTable.replace(booking.toString(),booking);
        return this.bookingTable.get(booking.toString());
    }

    @Override
    public void delete(String toString) {

        this.bookingTable.remove(toString());
    }

    @Override
    public Booking read(String toString) {
        Booking booking = bookingTable.get(toString());
        return booking;
    }


    @Override
    public Set<Booking> getAll() {
        Collection<Booking> bookings = this.bookingTable.values();
        Set<Booking> set = new HashSet<>();
        set.addAll(bookings);
        return set;
    }
}
