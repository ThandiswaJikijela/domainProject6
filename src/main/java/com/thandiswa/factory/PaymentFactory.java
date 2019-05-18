package com.thandiswa.factory;

import com.thandiswa.domain.Payment;
import com.thandiswa.util.IDs;

import java.util.Map;

public class PaymentFactory {
    public static Payment getPayment (String creditCardNo, double refund) {
        return new Payment.Builder().creditCardNo(creditCardNo)
                .refund(refund)
                .memberID(IDs.generateId())
                .build();
    }
}
