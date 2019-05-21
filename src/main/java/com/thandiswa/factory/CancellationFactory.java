package com.thandiswa.factory;

import com.thandiswa.domain.Cancellation;
import com.thandiswa.util.IDs;

public class CancellationFactory {
    public static Cancellation getCancelation (String paymentMethod) {
        return new Cancellation.Builder().reservationID(IDs.generateId())
                .paymentMethod(paymentMethod)
                .build();
    }
}
