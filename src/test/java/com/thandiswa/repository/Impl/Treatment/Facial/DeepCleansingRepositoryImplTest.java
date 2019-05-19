package com.thandiswa.repository.Impl.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.DeepCleansing;
import com.thandiswa.factory.Treatment.Facial.DeepCleansingFactory;
import com.thandiswa.repository.Treatment.Facial.DeepCleansingRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DeepCleansingRepositoryImplTest {
    private DeepCleansingRepository repository;
    private DeepCleansing deepCleansing;

    @Before
    public void setUp() throws Exception {
        repository = DeepCleansingRepositoryImpl.getRepository();
        this.deepCleansing = DeepCleansingFactory.getDeepCleansing("Lavender");
    }

    @Test
    public void create() {
        DeepCleansing created = this.repository.create(this.deepCleansing);
        System.out.println("In create, created = " + created);
        getAll();
        assertEquals(created,this.deepCleansing);
    }

    @Test
    public void update() {
        String newOilType = "Rose";
        DeepCleansing updated = new DeepCleansing.Builder().oilTypes(newOilType).build();
        System.out.println("In update, about_to_updated = " + deepCleansing.getOilTypes());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newOilType, updated.getOilTypes());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(deepCleansing.getOilTypes());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, id= "+ deepCleansing.getFacialID());
        DeepCleansing read = this.repository.read(deepCleansing.getFacialID());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(deepCleansing,read);
    }

    @Test
    public void getAll() {
        Set<DeepCleansing> deepCleansings = this.repository.getAll();
        //System.out.println("In getAll, all = " + deepCleansings);
    }
}