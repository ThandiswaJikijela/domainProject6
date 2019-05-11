package com.thandiswa.factory;

import com.thandiswa.domain.Payment;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class PaymentFactoryTest {
    private Map<String, String> values;

    @Test
    public void getPayment() {
        values = new HashMap<String, String>();
        values.put("creditCardNo","8745665432df");
        values.put("customerID","78634sd");

        double refund = 500.59;
        Payment pay = PaymentFactory.getPayment(values,refund);
        System.out.println(pay);
        Assert.assertNotNull(pay.toString());
    }
}