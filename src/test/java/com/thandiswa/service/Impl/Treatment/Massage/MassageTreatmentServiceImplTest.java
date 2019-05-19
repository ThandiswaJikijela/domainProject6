package com.thandiswa.service.Impl.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.MassageTreatment;
import com.thandiswa.factory.Treatment.Massage.MassageTreatmentFactory;
import com.thandiswa.repository.Impl.Treatment.Massage.MassageTreatmentRepositoryImpl;
import com.thandiswa.repository.Treatment.Massage.MassageTreatmentRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MassageTreatmentServiceImplTest {
    private MassageTreatmentRepositoryImpl repository;
    private MassageTreatment massageTreatment;

    @Before
    public void setUp() throws Exception {
        this.repository = MassageTreatmentRepositoryImpl.getRepository();
        this.massageTreatment = MassageTreatmentFactory.getMassageTreatment("Tissues Massage");
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
        String newMassage = "Swedish Massage";
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
        Set<MassageTreatment> massageTreatments = this.repository.getAll();
        //System.out.println("In getAll, all = " + massageTreatments);
    }
}