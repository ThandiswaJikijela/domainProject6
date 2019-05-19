package com.thandiswa.repository.Impl;

import com.thandiswa.domain.Cancelation;
import com.thandiswa.factory.CancelationFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import com.thandiswa.repository.CancelationRepository;
import org.junit.runners.MethodSorters;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CancelationRepositoryImplTest {
    private CancelationRepository repository;
    private Cancelation cancelation;

    @Before
    public void setUp() throws Exception {
        repository = CancelationRepositoryImpl.getRepository();
        this.cancelation = CancelationFactory.getCancelation("Credit Card");
    }

    @Test
    public void create() {
        Cancelation created = this.repository.create(this.cancelation);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created,this.cancelation);
    }

    @Test
    public void read() {
        System.out.println("In read, payment method = "+ cancelation.getPaymentMethod());
        Cancelation read = this.repository.read(cancelation.getPaymentMethod());
        System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(cancelation,read);
    }

    @Test
    public void update() {
        String newPaymentMethod = "Cash";
        Cancelation updated = new Cancelation.Builder().paymentMethod(newPaymentMethod).build();
        System.out.println("In update, about_to_updated = " + cancelation.getPaymentMethod());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newPaymentMethod, updated.getPaymentMethod());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(cancelation.getPaymentMethod());
        getAll();
    }

    @Test
    public void getAll() {
        Set<Cancelation> cancelations = this.repository.getAll();
        //System.out.println("In getAll, all = " + cancelations);
    }
}