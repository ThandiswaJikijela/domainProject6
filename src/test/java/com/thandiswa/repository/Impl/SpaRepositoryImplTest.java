package com.thandiswa.repository.Impl;

import com.thandiswa.domain.Spa;
import com.thandiswa.factory.SpaFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import com.thandiswa.repository.SpaRepository;
import org.junit.runners.MethodSorters;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SpaRepositoryImplTest {
    private SpaRepository repository;
    private Spa spa;

    @Before
    public void setUp() throws Exception {
        repository = SpaRepositoryImpl.getRepository();
        this.spa = SpaFactory.getSpa("10 Plane, Woodstock","Serenity Day Spa");

    }

    @Test
    public void create() {
        Spa created = this.repository.create(this.spa);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created,this.spa);
    }

    @Test
    public void read() {
        System.out.println("In read, spa name = "+ spa.getSpaName());
        Spa read = this.repository.read(spa.getSpaName());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(spa,read);
    }

    @Test
    public void update() {
        String newAddress = "Dorset";
        Spa updated = new Spa.Builder().address(newAddress).build();
        System.out.println("In update, about_to_updated = " + spa.getAddress());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newAddress, updated.getAddress());
        getAll();

    }

    @Test
    public void delete() {
        this.repository.delete(spa.getSpaId());
        getAll();
    }

    @Test
    public void getAll() {
        Set<Spa> spas = this.repository.getAll();
        //System.out.println("In getAll, all = " + spas);
    }
}