package com.thandiswa.repository.Impl;

import com.thandiswa.domain.Payment;
import com.thandiswa.factory.PaymentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import com.thandiswa.repository.PaymentRepository;
import org.junit.runners.MethodSorters;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaymentRepositoryImplTest {
    private PaymentRepository repository;
    private Payment payment;

    @Before
    public void setUp() throws Exception {
        repository = PaymentRepositoryImpl.getRepository();
        this.payment = PaymentFactory.getPayment("75647283od8",500);
    }

    @Test
    public void create() {
        Payment created = this.repository.create(this.payment);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created,this.payment);
    }

    @Test
    public void read() {
        System.out.println("In read, member ID = "+ payment.getMemberID());
        Payment read = this.repository.read(payment.getMemberID());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(payment,read);
    }

    @Test
    public void update() {
        double newRefund = 800;
        Payment updated = new Payment.Builder().refund(newRefund).build();
        System.out.println("In update, about_to_updated = " + payment.getRefund());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newRefund, updated.getRefund(),newRefund);
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(payment.getCreditCardNo());
        getAll();
    }

    @Test
    public void getAll() {
        Set<Payment> payments = this.repository.getAll();
        //System.out.println("In getAll, all = " + payments);
    }
}