package com.thandiswa.service.Impl.Booking;

import com.thandiswa.domain.Booking.Booking;
import com.thandiswa.repository.Booking.BookingRepository;
import com.thandiswa.repository.Impl.Booking.BookingRepositoryImpl;
import com.thandiswa.service.Booking.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class BookingServiceImpl implements BookingService {
    //@Autowired
    @Qualifier("InMemory")
    private static BookingServiceImpl service = null;
    private BookingRepository repository;

    private BookingServiceImpl() {
        this.repository = BookingRepositoryImpl.getRepository();
    }

    public static BookingServiceImpl getService(){
        if (service == null) service = new BookingServiceImpl();
        return service;
    }

    @Override
    public Booking create(Booking booking) {
        return this.repository.create(booking);
    }

    @Override
    public Booking update(Booking booking) {
        return this.repository.update(booking);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Booking read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Booking> getAll() {
        return this.repository.getAll();
    }
}
