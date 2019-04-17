package factory;

import domain.Payment;

public class PaymentFactory {
    public static Payment getPayment (String creditCardNo, double refund, String customerID) {
        return new Payment.Builder().creditCardNo(creditCardNo)
                .refund(refund)
                .customerID(customerID)
                .build();
    }
}
