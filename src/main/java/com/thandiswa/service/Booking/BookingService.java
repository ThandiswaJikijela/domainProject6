package com.thandiswa.service.Booking;

import com.thandiswa.domain.Booking.Booking;
import com.thandiswa.service.IService;

import java.util.Set;

public interface BookingService extends IService<Booking, String> {
    Set<Booking> getAll();
}
