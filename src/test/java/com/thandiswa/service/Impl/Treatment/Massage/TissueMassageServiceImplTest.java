package com.thandiswa.service.Impl.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.TissueMassage;
import com.thandiswa.factory.Treatment.Massage.TissueMassageFactory;
import com.thandiswa.repository.Impl.Treatment.Massage.TissueMassageRepositoryImpl;
import com.thandiswa.repository.Treatment.Massage.TissueMassageRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TissueMassageServiceImplTest {
    private TissueMassageRepositoryImpl repository;
    private TissueMassage tissueMassage;

    @Before
    public void setUp() throws Exception {
        this.repository = TissueMassageRepositoryImpl.getRepository();
        this.tissueMassage = TissueMassageFactory.getTissueMassage("Muscle Knots");
    }

    @Test
    public void create() {
        TissueMassage created = this.repository.create(this.tissueMassage);
        System.out.println("In create, created = " + created);
        getAll();
        assertEquals(created,this.tissueMassage);
    }

    @Test
    public void read() {
        System.out.println("In read, pressure points= "+ tissueMassage.getMassagePressure());
        TissueMassage read = this.repository.read(tissueMassage.getMassagePressure());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(tissueMassage,read);
    }

    @Test
    public void update() {
        String newMassagepressure = "Passive joint movement techniques";
        TissueMassage updated = new TissueMassage.Builder().massagePressure(newMassagepressure).build();
        System.out.println("In update, about_to_update = " + tissueMassage.getMassagePressure());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newMassagepressure, updated.getMassagePressure());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(tissueMassage.getMassagePressure());
        getAll();
    }

    @Test
    public void getAll() {
        Set<TissueMassage> tissueMassageSet = this.repository.getAll();
        //System.out.println("In getAll, all = " + tissueMassageSet);
    }
}