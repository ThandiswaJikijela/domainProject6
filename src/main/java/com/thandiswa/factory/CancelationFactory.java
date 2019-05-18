package com.thandiswa.factory;

import com.thandiswa.domain.Cancelation;
import com.thandiswa.util.IDs;

import java.util.Map;

public class CancelationFactory {
    public static Cancelation getCancelation (String paymentMethod) {
        return new Cancelation.Builder().reservationID(IDs.generateId())
                .paymentMethod(paymentMethod)
                .build();
    }
}
