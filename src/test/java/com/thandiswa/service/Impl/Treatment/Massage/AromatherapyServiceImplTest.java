package com.thandiswa.service.Impl.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.Aromatherapy;
import com.thandiswa.factory.Treatment.Massage.AromatherapyFactory;
import com.thandiswa.repository.Impl.Treatment.Massage.AromatherapyRepositoryImpl;
import com.thandiswa.repository.Treatment.Massage.AromatherapyRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AromatherapyServiceImplTest {
    private AromatherapyRepositoryImpl repository;
    private Aromatherapy aromatherapy;

    @Before
    public void setUp() throws Exception {
        this.repository = AromatherapyRepositoryImpl.getRepository();
        this.aromatherapy = AromatherapyFactory.getAromatherapy("Sweet almond oil");
    }

    @Test
    public void create() {
        Aromatherapy created = this.repository.create(this.aromatherapy);
        System.out.println("In create, created = " + created);
        getAll();
        assertEquals(created,this.aromatherapy);
    }

    @Test
    public void read() {
        System.out.println("In read, aroma oils= "+ aromatherapy.getFragrantEssentialOil());
        Aromatherapy read = this.repository.read(aromatherapy.getFragrantEssentialOil());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(aromatherapy,read);
    }

    @Test
    public void update() {
        String newAromatherapy = "Floral blends";
        Aromatherapy updated = new Aromatherapy.Builder().fragrantEssentialOil(newAromatherapy).build();
        System.out.println("In update, about_to_updated = " + aromatherapy.getFragrantEssentialOil());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newAromatherapy, updated.getFragrantEssentialOil());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(aromatherapy.getFragrantEssentialOil());
        getAll();
    }

    @Test
    public void getAll() {
        Set<Aromatherapy> aromatherapies = this.repository.getAll();
        //System.out.println("In getAll, all = " + aromatherapies);
    }
}