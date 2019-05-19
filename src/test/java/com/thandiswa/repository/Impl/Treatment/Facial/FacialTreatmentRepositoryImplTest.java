package com.thandiswa.repository.Impl.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.FacialTreatment;
import com.thandiswa.factory.Treatment.Facial.FacialTreatmentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import com.thandiswa.repository.Treatment.Facial.FacialTreatmentRepository;
import org.junit.runners.MethodSorters;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FacialTreatmentRepositoryImplTest {
    private FacialTreatmentRepository repository;
    private FacialTreatment facialTreatment;

    @Before
    public void setUp() throws Exception {
        repository = FacialTreatmentRepositoryImpl.getRepository();
        this.facialTreatment = FacialTreatmentFactory.getFacialTreatment("Deep cleansing Facial","Purifying Cleanser");
    }

    @Test
    public void create() {
        FacialTreatment created = this.repository.create(this.facialTreatment);
        System.out.println("In create, created = " + created);
        getAll();
        assertEquals(created,this.facialTreatment);
    }

    @Test
    public void update() {
        String newSkinProduct = "Violet-C Brightening Serum";
        FacialTreatment updated = new FacialTreatment.Builder().skinCareProducts(newSkinProduct).build();
        System.out.println("In update, about_to_updated = " + facialTreatment.getSkinCareProducts());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newSkinProduct, updated.getSkinCareProducts());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(facialTreatment.getTreatmentID());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, treatment type= "+ facialTreatment.getTreatmentType());
        FacialTreatment read = this.repository.read(facialTreatment.getTreatmentType());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(facialTreatment,read);
    }

    @Test
    public void getAll() {
        Set<FacialTreatment> facialTreatments = this.repository.getAll();
        //System.out.println("In getAll, all = " + facialTreatments);
    }
}