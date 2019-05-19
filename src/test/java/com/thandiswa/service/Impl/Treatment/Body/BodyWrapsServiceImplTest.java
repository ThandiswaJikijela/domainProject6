package com.thandiswa.service.Impl.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyWraps;
import com.thandiswa.factory.Treatment.Body.BodyWrapFactory;
import com.thandiswa.repository.Impl.Treatment.Body.BodyWrapsRepositoryImpl;
import com.thandiswa.repository.Treatment.Body.BodyWrapsRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BodyWrapsServiceImplTest {
    private BodyWrapsRepositoryImpl repository;
    private BodyWraps treatment;

    @Before
    public void setUp() throws Exception {
        repository = BodyWrapsRepositoryImpl.getRepository();
        this.treatment = BodyWrapFactory.getBodyWraps("Detox Body Wrap");
    }

    @Test
    public void create() {
        BodyWraps created = this.repository.create(this.treatment);
        System.out.println("In create, created = " + created);
        getAll();
        assertEquals(created,this.treatment);
    }

    @Test
    public void update() {
        String newWrapMaterial = "Mineral Wraps";
        BodyWraps updated = new BodyWraps.Builder().wrapMaterials(newWrapMaterial).build();
        System.out.println("In update, about_to_updated = " + treatment.getWrapMaterials());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newWrapMaterial, updated.getWrapMaterials());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(treatment.getWrapMaterials());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, wrap material= "+ treatment.getWrapMaterials());
        BodyWraps read = this.repository.read(treatment.getWrapMaterials());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(treatment,read);
    }

    @Test
    public void getAll() {
        Set<BodyWraps> bodyWraps = this.repository.getAll();
        //System.out.println("In getAll, all = " + bodyWraps);
    }
}