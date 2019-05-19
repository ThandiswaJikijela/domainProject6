package com.thandiswa.service.Impl.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Manicure;
import com.thandiswa.factory.Treatment.Nail.ManicureFactory;
import com.thandiswa.repository.Impl.Treatment.Nail.ManicureRepositoryImpl;
import com.thandiswa.repository.Treatment.Nail.ManicureRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ManicureServiceImplTest {
    private ManicureRepositoryImpl repository;
    private Manicure manicure;

    @Before
    public void setUp() throws Exception {
        this.repository = ManicureRepositoryImpl.getRepository();
        this.manicure = ManicureFactory.getManicure("Oval nails");
    }

    @Test
    public void create() {
        Manicure created = this.repository.create(this.manicure);
        System.out.println("In create, created = " + created);
        getAll();
        assertEquals(created,this.manicure);
    }

    @Test
    public void read() {
        System.out.println("In read, nail style= "+ manicure.getNailStyle());
        Manicure read = this.repository.read(manicure.getNailStyle());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(manicure,read);
    }

    @Test
    public void update() {
        String newNailStyle = "Square Nails";
        Manicure updated = new Manicure.Builder().nailStyle(newNailStyle).build();
        System.out.println("In update, about_to_updated = " + manicure.getNailStyle());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newNailStyle, updated.getNailStyle());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(manicure.getNailStyle());
        getAll();
    }

    @Test
    public void getAll() {
        Set<Manicure> manicures = this.repository.getAll();
        //System.out.println("In getAll, all = " + manicures);
    }
}