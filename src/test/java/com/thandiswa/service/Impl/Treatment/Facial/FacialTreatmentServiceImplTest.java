package com.thandiswa.service.Impl.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.FacialTreatment;
import com.thandiswa.factory.Treatment.Facial.FacialTreatmentFactory;
import com.thandiswa.repository.Impl.Treatment.Facial.FacialTreatmentRepositoryImpl;
import com.thandiswa.repository.Treatment.Facial.FacialTreatmentRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FacialTreatmentServiceImplTest {
    private FacialTreatmentRepositoryImpl repository;
    private FacialTreatment facialTreatment;

    @Before
    public void setUp() throws Exception {
        this.repository = FacialTreatmentRepositoryImpl.getRepository();
        this.facialTreatment = FacialTreatmentFactory.getFacialTreatment("Anti Aging Facial","Purifying Cleanser");
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
        String newSkinProduct = "886788th";
        FacialTreatment updated = new FacialTreatment.Builder().treatmentID(newSkinProduct).build();
        System.out.println("In update, about_to_updated = " + facialTreatment.getTreatmentID());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newSkinProduct, updated.getTreatmentID());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(facialTreatment.getTreatmentID());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, skin care product= "+ facialTreatment.getSkinCareProducts());
        FacialTreatment read = this.repository.read(facialTreatment.getSkinCareProducts());
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