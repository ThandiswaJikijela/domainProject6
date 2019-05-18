package com.thandiswa.repository.Impl.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.FacialTreatment;
import com.thandiswa.factory.Treatment.Facial.FacialTreatmentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.thandiswa.repository.Treatment.Facial.FacialTreatmentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class FacialTreatmentRepositoryImplTest {
    private FacialTreatmentRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = FacialTreatmentRepositoryImpl.getRepository();

    }

    @Test
    public void create() {
        FacialTreatment facial = FacialTreatmentFactory.getFacialTreatment("Deep Cleansing","make-up");
        repository.create(facial);
        System.out.print(facial);
        assertNotNull(facial.getTreatmentType(),facial.getSkinCareProducts());
    }

    @Test
    public void read() {
        FacialTreatment readFacialTreatment = repository.read("");
        assertEquals("Deep Cleansing",readFacialTreatment.getTreatmentType());
    }

    @Test
    public void update() {
        /*FacialTreatment facial = repository.read("1");
        FacialTreatment newFacialTreatment = new FacialTreatment.Builder()
                .skinCareProducts(values.get("make-up"))
                .treatmentType("Anti Anging Facial")
                .build();
        repository.update(newFacialTreatment);
        FacialTreatment UpdateFacialTreatment = repository.read("1");
        assertEquals("Anti Anging Facial",UpdateFacialTreatment.getTreatmentType());

         */
    }

    @Test
    public void delete() {
        repository.delete("1");
        FacialTreatment facial = repository.read("1");
        assertNull(facial);
    }

    @Test
    public void getAll() {
        Set<FacialTreatment> facial = this.repository.getAll();
        Assert.assertEquals(1,facial.size());
    }
}