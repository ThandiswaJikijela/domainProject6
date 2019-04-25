package repository.Booking;

import domain.Booking.Booking;
import repository.IRepository;

import java.util.Set;

public interface BookingRepository extends IRepository <Booking, String>{
    Set<Booking> getAll();

}
