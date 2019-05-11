package com.thandiswa.repository.Booking;

import com.thandiswa.domain.Booking.Booking;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface BookingRepository extends IRepository <Booking, String>{
    Set<Booking> getAll();

}
