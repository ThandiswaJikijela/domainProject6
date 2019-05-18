package com.thandiswa.factory;

import com.thandiswa.domain.Payment;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class PaymentFactoryTest {

    @Test
    public void getPayment() {

        String creditCardNo = "876655hg8734";
        double refund = 500.59;
        Payment pay = PaymentFactory.getPayment(creditCardNo,refund);
        System.out.println(pay);
        Assert.assertNotNull(pay.toString());
    }
}