package com.thandiswa.repository.Impl.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Pedicure;
import com.thandiswa.factory.Treatment.Nail.PedicureFactory;
import com.thandiswa.repository.Treatment.Nail.PedicureRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PedicureRepositoryImplTest {
    private PedicureRepository repository;
    private Pedicure pedicure;

    @Before
    public void setUp() throws Exception {
        repository = PedicureRepositoryImpl.getRepository();
        this.pedicure = PedicureFactory.getPedicure("chemical foot peel");
    }

    @Test
    public void create() {
        Pedicure created = this.repository.create(this.pedicure);
        System.out.println("In create, created = " + created);
        getAll();
        assertEquals(created,this.pedicure);
    }

    @Test
    public void update() {
        String newHeelPedicure = "Keratolytic chemical";
        Pedicure updated = new Pedicure.Builder().mediHeelPedicure(newHeelPedicure).build();
        System.out.println("In update, about_to_updated = " + pedicure.getMediHeelPedicure());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newHeelPedicure, updated.getMediHeelPedicure());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(pedicure.getTreatmentID());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, treatment type= "+ pedicure.getMediHeelPedicure());
        Pedicure read = this.repository.read(pedicure.getMediHeelPedicure());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(pedicure,read);
    }

    @Test
    public void getAll() {
        Set<Pedicure> pedicures = this.repository.getAll();
        //System.out.println("In getAll, all = " + pedicures);
    }
}