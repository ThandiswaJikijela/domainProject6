package com.thandiswa.repository.Impl.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.NailTreatment;
import com.thandiswa.factory.Treatment.Nail.NailTreatmentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.thandiswa.repository.Treatment.Nail.NailTreatmentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class NailTreatmentRepositoryImplTest {
    private NailTreatmentRepository repository;
    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {
        repository = NailTreatmentRepositoryImpl.getRepository();
    }

    @Test
    public void create() {
        NailTreatment treatment = NailTreatmentFactory.getNailTreatment("Manicure","Round nails");
        repository.create(treatment);
        System.out.print(treatment);
        assertEquals("Manicure",treatment.getNailType());
    }

    @Test
    public void read() {
        NailTreatment readNailTreatment = repository.read("1");
        assertEquals("Manicure",readNailTreatment.getNailType());
    }

    @Test
    public void update() {
        NailTreatment treatment = repository.read("1");
        NailTreatment newNailTreatment = new NailTreatment.Builder()
                .nailType("Pedicure")
                .nailShape(values.get("nailShape"))
                .nailSize(values.size())
                .build();
        repository.update(newNailTreatment);
        NailTreatment UpdateNailTreatment = repository.read("1");
        assertEquals("Pedicure",UpdateNailTreatment.getNailType());
    }

    @Test
    public void delete() {
        repository.delete("1");
        NailTreatment treatment = repository.read("1");
        assertNull(treatment);
    }

    @Test
    public void getAll() {
        Set<NailTreatment> treatment = this.repository.getAll();
        Assert.assertEquals(1,treatment.size());
    }
}