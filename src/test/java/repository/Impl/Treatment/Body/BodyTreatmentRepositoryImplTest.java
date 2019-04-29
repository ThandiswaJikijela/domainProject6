package repository.Impl.Treatment.Body;

import domain.Treatment.Body.BodyTreatment;
import factory.Treatment.Body.BodyTreatmentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import repository.Treatment.Body.BodyTreatmentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class BodyTreatmentRepositoryImplTest {
    private BodyTreatmentRepository repository;
    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {
        repository = BodyTreatmentRepositoryImpl.getRepository();
        values = new HashMap<String, String>();
    }

    @Test
    public void create() {
        BodyTreatment body = BodyTreatmentFactory.getBodyTreatment(values,"Body Scrub");
        repository.create(body);
        System.out.print(body);
        assertEquals("Body Scrub",body.getTreatmentType());
    }

    @Test
    public void read() {
        BodyTreatment readBodyTreatment = repository.read("");
        assertEquals("Body Scrub",readBodyTreatment.getTreatmentType());
    }

    @Test
    public void update() {
        BodyTreatment body = repository.read("1");
        BodyTreatment newBodyTreatment = new BodyTreatment.Builder()
                .treatmentType("Body Mask")
                .build();
        repository.update(newBodyTreatment);
        BodyTreatment UpdateBodyTreatment = repository.read("1");
        assertEquals("Body Mask",UpdateBodyTreatment.getTreatmentType());
    }

    @Test
    public void delete() {
        repository.delete("1");
        BodyTreatment body = repository.read("1");
        assertNull(body);
    }

    @Test
    public void getAll() {
        Set<BodyTreatment> body = this.repository.getAll();
        Assert.assertEquals(1,body.size());
    }
}