package factory;

import domain.Cancelation;

import java.util.Date;

public class CancelationFactory {
    public static Cancelation getCancelation (/*Date bookedDate,*/ String paymentMethod) {
        return new Cancelation.Builder()/*.bookedDate(bookedDate)*/
                .paymentMethod(paymentMethod)
                .build();
    }
}
