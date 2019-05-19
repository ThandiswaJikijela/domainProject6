package com.thandiswa.repository.Impl.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyScrub;
import com.thandiswa.factory.Treatment.Body.BodyScrubFactory;
import com.thandiswa.repository.Treatment.Body.BodyScrubRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BodyScrubRepositoryImplTest {
    private BodyScrubRepository repository;
    private BodyScrub treatment;

    @Before
    public void setUp() throws Exception {
        repository = BodyScrubRepositoryImpl.getRepository();
        this.treatment = BodyScrubFactory.getBodyScrub("Coffee grounds");
    }

    @Test
    public void create() {
        BodyScrub created = this.repository.create(this.treatment);
        System.out.println("In create, created = " + created);
        getAll();
        assertEquals(created,this.treatment);
    }

    @Test
    public void update() {
        String newIngredient = "Baking soda";
        BodyScrub updated = new BodyScrub.Builder().grittyIngredients(newIngredient).build();
        System.out.println("In update, about_to_updated = " + treatment.getGrittyIngredients());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newIngredient, updated.getGrittyIngredients());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(treatment.getGrittyIngredients());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, scrub ingredients= "+ treatment.getGrittyIngredients());
        BodyScrub read = this.repository.read(treatment.getGrittyIngredients());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(treatment,read);
    }

    @Test
    public void getAll() {
        Set<BodyScrub> bodyScrubs = this.repository.getAll();
        //System.out.println("In getAll, all = " + bodyScrubs);
    }
}