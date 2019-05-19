package com.thandiswa.repository.Impl.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.MassageTreatment;
import com.thandiswa.factory.Treatment.Massage.MassageTreatmentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import com.thandiswa.repository.Treatment.Massage.MassageTreatmentRepository;
import org.junit.runners.MethodSorters;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MassageTreatmentRepositoryImplTest {
    private MassageTreatmentRepository repository;
    private MassageTreatment massageTreatment;

    @Before
    public void setUp() throws Exception {
        repository = MassageTreatmentRepositoryImpl.getRepository();
        this.massageTreatment = MassageTreatmentFactory.getMassageTreatment("Swedish Massage");
    }

    @Test
    public void create() {
        MassageTreatment created = this.repository.create(this.massageTreatment);
        System.out.println("In create, created = " + created);
        getAll();
        assertEquals(created,this.massageTreatment);
    }

    @Test
    public void read() {
        System.out.println("In read, treatment ID= "+ massageTreatment.getTreatmentID());
        MassageTreatment read = this.repository.read(massageTreatment.getTreatmentID());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(massageTreatment,read);
    }

    @Test
    public void update() {
        String newMassage = "Tissue Massage";
        MassageTreatment updated = new MassageTreatment.Builder().massageType(newMassage).build();
        System.out.println("In update, about_to_update = " + massageTreatment.getMassageType());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newMassage, updated.getMassageType());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(massageTreatment.getMassageType());
        getAll();
    }

    @Test
    public void getAll() {
        Set<MassageTreatment> treatmentSet = this.repository.getAll();
        //System.out.println("In getAll, all = " + treatmentSet);
    }
}