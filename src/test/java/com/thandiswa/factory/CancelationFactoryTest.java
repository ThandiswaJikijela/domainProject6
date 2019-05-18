package com.thandiswa.factory;

import com.thandiswa.domain.Cancelation;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CancelationFactoryTest {

    @Test
    public void getCancelation() {

        String paymentMethod = "CreditCard";
        Cancelation cancel = CancelationFactory.getCancelation(paymentMethod);
        System.out.println(cancel);
        Assert.assertNotNull(cancel.getPaymentMethod());
    }
}