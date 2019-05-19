package com.thandiswa.repository.Impl.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.AntAgingFacial;
import com.thandiswa.factory.Treatment.Facial.AntiAgingFacialFactory;
import com.thandiswa.repository.Treatment.Facial.AntiAgingFacialRepository;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AntiAgingFacialRepositoryImplTest {
    private AntiAgingFacialRepository repository;
    private AntAgingFacial agingFacial;

    @Before
    public void setUp() throws Exception {
        repository = AntiAgingFacialRepositoryImpl.getRepository();
        this.agingFacial = AntiAgingFacialFactory.getAntAgingFacial("RoseMary");
    }

    @Test
    public void create() {
        AntAgingFacial created = this.repository.create(this.agingFacial);
        System.out.println("In create, created = " + created);
        getAll();
        assertEquals(created,this.agingFacial);
    }

    @Test
    public void update() {
        String newPoreIngredient = "Lavender";
        AntAgingFacial updated = new AntAgingFacial.Builder().poreIngredients(newPoreIngredient).build();
        System.out.println("In update, about_to_updated = " + agingFacial.getPoreIngredients());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newPoreIngredient, updated.getPoreIngredients());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(agingFacial.getPoreIngredients());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, pore Ingredients= "+ agingFacial.getPoreIngredients());
        AntAgingFacial read = this.repository.read(agingFacial.getPoreIngredients());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(agingFacial,read);
    }

    @Test
    public void getAll() {
        Set<AntAgingFacial> facials = this.repository.getAll();
        //System.out.println("In getAll, all = " + facials);
    }
}