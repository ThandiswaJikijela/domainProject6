package com.thandiswa.service.Impl.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyMask;
import com.thandiswa.factory.Treatment.Body.BodyMaskFactory;
import com.thandiswa.repository.Impl.Treatment.Body.BodyMaskRepositoryImpl;
import com.thandiswa.repository.Treatment.Body.BodyMaskRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BodyMaskServiceImplTest {
    private BodyMaskRepositoryImpl repository;
    private BodyMask treatment;

    @Before
    public void setUp() throws Exception {
        this.repository = BodyMaskRepositoryImpl.getRepository();
        this.treatment = BodyMaskFactory.getBodyMask("Seaweed");
    }

    @Test
    public void create() {
        BodyMask created = this.repository.create(this.treatment);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created,this.treatment);
    }

    @Test
    public void update() {
        String newName = "algae";
        BodyMask updated = new BodyMask.Builder().maskIngredients(newName).build();
        System.out.println("In update, about_to_updated = " + treatment.getMaskIngredients());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newName, updated.getMaskIngredients());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(treatment.getMaskIngredients());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, mask ingredients= "+ treatment.getMaskIngredients());
        BodyMask read = this.repository.read(treatment.getMaskIngredients());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(treatment,read);
    }

    @Test
    public void getAll() {
        Set<BodyMask> bodyMasks = this.repository.getAll();
        //System.out.println("In getAll, all = " + bodyMasks);
    }
}