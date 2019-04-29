package factory;

import domain.Payment;

import java.util.Map;

public class PaymentFactory {
    public static Payment getPayment (Map<String, String> values,double refund) {
        return new Payment.Builder().creditCardNo(values.get("creditCardNo"))
                .refund(refund)
                .customerID(values.get("customerID"))
                .build();
    }
}
