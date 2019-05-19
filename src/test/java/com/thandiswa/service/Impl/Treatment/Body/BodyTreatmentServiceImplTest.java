package com.thandiswa.service.Impl.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyTreatment;
import com.thandiswa.factory.Treatment.Body.BodyTreatmentFactory;
import com.thandiswa.repository.Impl.Treatment.Body.BodyTreatmentRepositoryImpl;
import com.thandiswa.repository.Treatment.Body.BodyTreatmentRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BodyTreatmentServiceImplTest {
    private BodyTreatmentRepositoryImpl repository;
    private BodyTreatment bodyTreatment;

    @Before
    public void setUp() throws Exception {
        repository = BodyTreatmentRepositoryImpl.getRepository();
        this.bodyTreatment = BodyTreatmentFactory.getBodyTreatment("Body Mask");
    }

    @Test
    public void create() {
        BodyTreatment created = this.repository.create(this.bodyTreatment);
        System.out.println("In create, created = " + created);
        getAll();
        assertEquals(created,this.bodyTreatment);
    }

    @Test
    public void update() {
        String newTreatmentType = "Body Wrap";
        BodyTreatment updated = new BodyTreatment.Builder().treatmentType(newTreatmentType).build();
        System.out.println("In update, about_to_updated = " + bodyTreatment.getTreatmentType());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newTreatmentType, updated.getTreatmentType());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(bodyTreatment.getTreatmentID());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, treatment id= "+ bodyTreatment.getTreatmentID());
        BodyTreatment read = this.repository.read(bodyTreatment.getTreatmentID());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(bodyTreatment,read);
    }

    @Test
    public void getAll() {
        Set<BodyTreatment> bodyTreatments = this.repository.getAll();
        //System.out.println("In getAll, all = " + bodyTreatments);
    }
}