package com.thandiswa.service.Impl.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.NailTreatment;
import com.thandiswa.factory.Treatment.Nail.NailTreatmentFactory;
import com.thandiswa.repository.Impl.Treatment.Nail.NailTreatmentRepositoryImpl;
import com.thandiswa.repository.Treatment.Nail.NailTreatmentRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NailTreatmentServiceImplTest {
    private NailTreatmentRepositoryImpl repository;
    private NailTreatment nailTreatment;

    @Before
    public void setUp() throws Exception {
        this.repository = NailTreatmentRepositoryImpl.getRepository();
        this.nailTreatment = NailTreatmentFactory.getNailTreatment("Manicure","Almond shaped nails");
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
        String newNailShape = "Stiletto shaped nails";
        NailTreatment updated = new NailTreatment.Builder().nailShape(newNailShape).build();
        System.out.println("In update, about_to_updated = " + nailTreatment.getNailShape());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newNailShape, updated.getNailShape());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(nailTreatment.getTreatmentID());
        getAll();
    }

    @Test
    public void getAll() {
        Set<NailTreatment> nailTreatments = this.repository.getAll();
        //System.out.println("In getAll, all = " + nailTreatments);
    }
}