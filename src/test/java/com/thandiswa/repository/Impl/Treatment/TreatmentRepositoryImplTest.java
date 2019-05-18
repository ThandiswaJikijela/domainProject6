package com.thandiswa.repository.Impl.Treatment;

import com.thandiswa.domain.Treatment.Treatment;
import com.thandiswa.factory.Treatment.TreatmentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.thandiswa.repository.Treatment.TreatmentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class TreatmentRepositoryImplTest {
    private TreatmentRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = TreatmentRepositoryImpl.getRepository();
    }

    @Test
    public void create() {
        Treatment treatment = TreatmentFactory.getTreatment("Skin exfoliation from a facial treatment","Tylor");
        repository.create(treatment);
        System.out.print(treatment);
        assertNotNull(treatment.toString());
    }

    @Test
    public void read() {
        Treatment readNailTreatment = repository.read("1");
        assertEquals("T8634",readNailTreatment.getTreatmentID());
    }

    @Test
    public void update() {
        /*Treatment treatment = repository.read("1");
        Treatment newTreatment = new Treatment.Builder()
                .name(values.get("name"))
                .description(values.get("description"))
                .treatmentID("T3456")
                .build();
        repository.update(newTreatment);
        Treatment UpdateTreatment = repository.read("1");
        assertEquals("T3456",UpdateTreatment.getTreatmentID());

         */
    }

    @Test
    public void delete() {
        repository.delete("1");
        Treatment treatment = repository.read("1");
        assertNull(treatment);
    }

    @Test
    public void getAll() {
        Set<Treatment> treatment = this.repository.getAll();
        Assert.assertEquals(1,treatment.size());
    }
}