package com.thandiswa.factory;

import com.thandiswa.domain.Cancellation;
import org.junit.Assert;
import org.junit.Test;

public class CancellationFactoryTest {

    @Test
    public void getCancelation() {

        String paymentMethod = "CreditCard";
        Cancellation cancel = CancellationFactory.getCancelation(paymentMethod);
        System.out.println(cancel);
        Assert.assertNotNull(cancel.getPaymentMethod());
    }
}