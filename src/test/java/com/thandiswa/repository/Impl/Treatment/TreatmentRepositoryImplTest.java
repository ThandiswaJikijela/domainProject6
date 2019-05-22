package com.thandiswa.repository.Impl.Treatment;

import com.thandiswa.domain.Treatment.Treatment;
import com.thandiswa.factory.Treatment.TreatmentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import com.thandiswa.repository.Treatment.TreatmentRepository;
import org.junit.runners.MethodSorters;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TreatmentRepositoryImplTest {
    private TreatmentRepository repository;
    private Treatment treatment;

    @Before
    public void setUp() throws Exception {
        repository = TreatmentRepositoryImpl.getRepository();
        this.treatment = TreatmentFactory.getTreatment("Skin exfoliation from a facial treatment","FacialScrub");
    }

    @Test
    public void create() {
        Treatment created = this.repository.create(this.treatment);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created,this.treatment);
    }

    @Test
    public void read() {
        System.out.println("In read, treatment ID = "+ treatment.getTreatmentID());
        Treatment read = this.repository.read(treatment.getTreatmentID());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(treatment,read);
    }

    @Test
    public void update() {
        String newName = "FacialWrap";
        Treatment updated = new Treatment.Builder().name(newName).build();
        System.out.println("In update, about_to_updated = " + treatment.getName());
        this.repository.update(updated);
        //System.out.println("In update, updated = " + updated);
        assertEquals(newName, updated.getName());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(treatment.getDescription());
        getAll();
    }

    @Test
    public void getAll() {
        Set<Treatment> treatments = this.repository.getAll();
        //System.out.println("In getAll, all = " + treatments);
    }
}