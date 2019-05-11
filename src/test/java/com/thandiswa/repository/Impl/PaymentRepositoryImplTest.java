package com.thandiswa.repository.Impl;

import com.thandiswa.domain.Payment;
import com.thandiswa.factory.PaymentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.thandiswa.repository.PaymentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class PaymentRepositoryImplTest {
    private PaymentRepository repository;
    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {
        repository = PaymentRepositoryImpl.getRepository();
        values = new HashMap<String, String>();
        values.put("creditCardNo","8745665432df");
        values.put("customerID","78634sd");
    }

    @Test
    public void create() {
        Payment payment = PaymentFactory.getPayment(values,500);
        repository.create(payment);
        System.out.print(payment);
        Assert.assertEquals(500,payment.getRefund());
    }

    @Test
    public void read() {
        Payment readPayment = repository.read("1");
        assertEquals(500,readPayment.getRefund());
    }

    @Test
    public void update() {
        Payment payment = repository.read("1");
        Payment newPayment= new Payment.Builder()
                .creditCardNo(values.get("creditCardNo"))
                .refund(300)
                .customerID(values.get("customerID"))
                .build();
        repository.update(newPayment);
        Payment UpdatePayment = repository.read("1");
        assertEquals(300,UpdatePayment.getRefund());
    }

    @Test
    public void delete() {
        repository.delete("1");
        Payment payment = repository.read("1");
        assertNull(payment);
    }

    @Test
    public void getAll() {
        Set<Payment> payment = this.repository.getAll();
        Assert.assertEquals(1,payment.size());
    }
}