package com.thandiswa.factory;

import com.thandiswa.domain.Cancelation;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CancelationFactoryTest {
    private Map<String, String> values;

    @Test
    public void getCancelation() {
        values = new HashMap<String, String>();
        //Date bookedDate = 94-11-08;
        String paymentMethod = "CreditCard";
        Cancelation cancel = CancelationFactory.getCancelation(values,paymentMethod);
        System.out.println(cancel);
        Assert.assertNotNull(cancel.getPaymentMethod());
    }
}