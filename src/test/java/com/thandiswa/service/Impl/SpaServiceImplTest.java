package com.thandiswa.service.Impl;

import com.thandiswa.domain.Spa;
import com.thandiswa.factory.SpaFactory;
import com.thandiswa.repository.Impl.SpaRepositoryImpl;
import com.thandiswa.repository.SpaRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SpaServiceImplTest {
    private SpaRepositoryImpl repository;
    private Spa spa;

    @Before
    public void setUp() throws Exception {
        this.repository = SpaRepositoryImpl.getRepository();
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
        this.repository.delete(spa.getSpaName());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, spa ID = "+ spa.getSpaId());
        Spa read = this.repository.read(spa.getSpaId());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(spa,read);
    }

    @Test
    public void getAll() {
        Set<Spa> spas = this.repository.getAll();
        //System.out.println("In getAll, all = " + spas);
    }
}