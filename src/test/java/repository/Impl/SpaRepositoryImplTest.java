package repository.Impl;

import domain.Spa;
import factory.SpaFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import repository.SpaRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class SpaRepositoryImplTest {
    private SpaRepository repository;
    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {
        repository = SpaRepositoryImpl.getRepository();
        values = new HashMap<String, String>();
        //values.put("id","1");
        values.put("spaName","10 Plane, Woodstock");
    }

    @Test
    public void create() {
        Spa spa = SpaFactory.getSpa(values,"Serenity Day Spa");
        repository.create(spa);
        System.out.println(spa);
        assertEquals("Serenity Day Spa",spa.getSpaName());
    }

    @Test
    public void read() {
        Spa readspa = repository.read("1");
        assertEquals("Serenity Day Spa", readspa.getSpaName());
    }

    @Test
    public void update() {
        Spa spa = repository.read("1");
        Spa newSpa = new Spa.Builder()
                .spaName("Serenity Day Spa")
                .address(values.get("address"))
                .build();
        repository.update(newSpa);
        Spa UpdateSpa = repository.read("1");
        assertEquals("Serenity Day Spa",UpdateSpa.getSpaName());

    }

    @Test
    public void delete() {
        repository.delete("1");
        Spa spa = repository.read("1");
        assertNull(spa);
    }

    @Test
    public void getAll() {
        Set<Spa> bookings = this.repository.getAll();
        Assert.assertEquals(1,bookings.size());
    }
}