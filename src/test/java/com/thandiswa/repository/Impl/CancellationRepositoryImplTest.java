package com.thandiswa.repository.Impl;

import com.thandiswa.domain.Cancellation;
import com.thandiswa.factory.CancellationFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import com.thandiswa.repository.CancellationRepository;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CancellationRepositoryImplTest {
    private CancellationRepository repository;
    private Cancellation cancellation;

    @Before
    public void setUp() throws Exception {
        repository = CancellationRepositoryImpl.getRepository();
        this.cancellation = CancellationFactory.getCancelation("Credit Card");
    }

    @Test
    public void create() {
        Cancellation created = this.repository.create(this.cancellation);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created,this.cancellation);
    }

    @Test
    public void read() {
        System.out.println("In read, payment method = "+ cancellation.getPaymentMethod());
        Cancellation read = this.repository.read(cancellation.getPaymentMethod());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(cancellation,read);
    }

    @Test
    public void update() {
        String newPaymentMethod = "Cash";
        Cancellation updated = new Cancellation.Builder().paymentMethod(newPaymentMethod).build();
        System.out.println("In update, about_to_updated = " + cancellation.getPaymentMethod());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newPaymentMethod, updated.getPaymentMethod());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(cancellation.getPaymentMethod());
        getAll();
    }

    @Test
    public void getAll() {
        Set<Cancellation> cancellations = this.repository.getAll();
        //System.out.println("In getAll, all = " + cancellations);
    }
}