package com.thandiswa.repository.Impl;

import com.thandiswa.domain.Cancelation;
import com.thandiswa.factory.CancelationFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.thandiswa.repository.CancelationRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class CancelationRepositoryImplTest {
    private CancelationRepository repository;
    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {
        repository = CancelationRepositoryImpl.getRepository();
        values = new HashMap<String, String>();
    }

    @Test
    public void create() {
        Cancelation cancelation = CancelationFactory.getCancelation(values,"Credit Card");
        repository.create(cancelation);
        System.out.print(cancelation);
        assertEquals("Credit Card",cancelation.getPaymentMethod());
    }

    @Test
    public void read() {
        Cancelation readCancelation = repository.read("1");
        assertEquals("Credit Card",readCancelation.getPaymentMethod());
    }

    @Test
    public void update() {
        Cancelation cancelation = repository.read("1");
        Cancelation newCancelation= new Cancelation.Builder()
                .paymentMethod("Cash")
                .build();
        repository.update(newCancelation);
        Cancelation UpdateCancelation = repository.read("1");
        assertEquals("Cash",UpdateCancelation.getPaymentMethod());
    }

    @Test
    public void delete() {
        repository.delete("1");
        Cancelation cancelation = repository.read("1");
        assertNull(cancelation);
    }

    @Test
    public void getAll() {
        Set<Cancelation> cancelation = this.repository.getAll();
        Assert.assertEquals(1,cancelation.size());
    }
}