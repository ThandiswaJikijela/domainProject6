package com.thandiswa.repository.Impl.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.MassageTreatment;
import com.thandiswa.factory.Treatment.Massage.MassageTreatmentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.thandiswa.repository.Treatment.Massage.MassageTreatmentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class MassageTreatmentRepositoryImplTest {
    private MassageTreatmentRepository repository;
    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {
        repository = MassageTreatmentRepositoryImpl.getRepository();
        values = new HashMap<String, String>();
    }

    @Test
    public void create() {
        MassageTreatment treatment = MassageTreatmentFactory.getMassageTreatment(values,"Aromatherapy");
        repository.create(treatment);
        System.out.print(treatment);
        assertEquals("Aromatherapy",treatment.getMassageType());
    }

    @Test
    public void read() {
        MassageTreatment readMassageTreatment = repository.read("1");
        assertEquals("Aromatherapy",readMassageTreatment.getMassageType());
    }

    @Test
    public void update() {
        MassageTreatment treatment = repository.read("1");
        MassageTreatment newMassageTreatment = new MassageTreatment.Builder()
                .massageType("Swedish Massage")
                .build();
        repository.update(newMassageTreatment);
        MassageTreatment UpdateMassageTreatment = repository.read("1");
        assertEquals("Swedish Massage",UpdateMassageTreatment.getMassageType());
    }

    @Test
    public void delete() {
        repository.delete("1");
        MassageTreatment treatment = repository.read("1");
        assertNull(treatment);
    }

    @Test
    public void getAll() {
        Set<MassageTreatment> treatment = this.repository.getAll();
        Assert.assertEquals(1,treatment.size());
    }
}