package com.thandiswa.repository.Impl.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.SwedishMassage;
import com.thandiswa.factory.Treatment.Massage.SwedishMassageFactory;
import com.thandiswa.repository.Treatment.Massage.SwedishMassageRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SwedishMassageRepositoryImplTest {
    private SwedishMassageRepository repository;
    private SwedishMassage massageTreatment;

    @Before
    public void setUp() throws Exception {
        repository = SwedishMassageRepositoryImpl.getRepository();
        this.massageTreatment = SwedishMassageFactory.getSwedishMassage("Coconut oil");
    }

    @Test
    public void create() {
        SwedishMassage created = this.repository.create(this.massageTreatment);
        System.out.println("In create, created = " + created);
        getAll();
        assertEquals(created,this.massageTreatment);
    }

    @Test
    public void read() {
        System.out.println("In read, carrier oils= "+ massageTreatment.getCarrierOil());
        SwedishMassage read = this.repository.read(massageTreatment.getCarrierOil());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(massageTreatment,read);
    }

    @Test
    public void update() {
        String newCarrierOils = "Avocado oil";
        SwedishMassage updated = new SwedishMassage.Builder().carrierOil(newCarrierOils).build();
        System.out.println("In update, about_to_update = " + massageTreatment.getCarrierOil());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newCarrierOils, updated.getCarrierOil());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(massageTreatment.getCarrierOil());
        getAll();
    }

    @Test
    public void getAll() {
        Set<SwedishMassage> swedishMassages = this.repository.getAll();
        //System.out.println("In getAll, all = " + swedishMassages);
    }
}