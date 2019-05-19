package com.thandiswa.repository.Impl.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.NailTreatment;
import com.thandiswa.factory.Treatment.Nail.NailTreatmentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import com.thandiswa.repository.Treatment.Nail.NailTreatmentRepository;
import org.junit.runners.MethodSorters;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NailTreatmentRepositoryImplTest {
    private NailTreatmentRepository repository;
    private NailTreatment nailTreatment;

    @Before
    public void setUp() throws Exception {
        repository = NailTreatmentRepositoryImpl.getRepository();
        this.nailTreatment = NailTreatmentFactory.getNailTreatment("Manicure","Round nails");
    }

    @Test
    public void create() {
        NailTreatment created = this.repository.create(this.nailTreatment);
        System.out.println("In create, created = " + created);
        getAll();
        assertEquals(created,this.nailTreatment);
    }

    @Test
    public void read() {
        System.out.println("In read, nail type= "+ nailTreatment.getNailType());
        NailTreatment read = this.repository.read(nailTreatment.getNailType());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(nailTreatment,read);
    }

    @Test
    public void update() {
        String newTreatmentID = "n467d37";
        NailTreatment updated = new NailTreatment.Builder().treatmentID(newTreatmentID).build();
        System.out.println("In update, about_to_updated = " + nailTreatment.getTreatmentID());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newTreatmentID, updated.getTreatmentID());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(nailTreatment.getNailType());
        getAll();
    }

    @Test
    public void getAll() {
        Set<NailTreatment> treatment = this.repository.getAll();
        //System.out.println("In getAll, all = " + treatment);
    }
}