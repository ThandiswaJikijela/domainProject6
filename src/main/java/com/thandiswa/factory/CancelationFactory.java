package com.thandiswa.factory;

import com.thandiswa.domain.Cancelation;

import java.util.Map;

public class CancelationFactory {
    public static Cancelation getCancelation (Map<String, String> values, String paymentMethod) {
        return new Cancelation.Builder()
                .paymentMethod(paymentMethod)
                .build();
    }
}
