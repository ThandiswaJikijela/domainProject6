package repository.Impl.Treatment;

import domain.Treatment.Treatment;
import factory.Treatment.TreatmentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import repository.Treatment.TreatmentRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class TreatmentRepositoryImplTest {
    private TreatmentRepository repository;
    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {
        repository = TreatmentRepositoryImpl.getRepository();
        values = new HashMap<String, String>();
        values.put("name","Nail Treatment");
        values.put("description","Full nail Manicure ");
    }

    @Test
    public void create() {
        Treatment treatment = TreatmentFactory.getTreatment(values,"T8634");
        repository.create(treatment);
        System.out.print(treatment);
        assertEquals("T8634",treatment.getTreatmentID());
    }

    @Test
    public void read() {
        Treatment readNailTreatment = repository.read("1");
        assertEquals("T8634",readNailTreatment.getTreatmentID());
    }

    @Test
    public void update() {
        Treatment treatment = repository.read("1");
        Treatment newTreatment = new Treatment.Builder()
                .name(values.get("name"))
                .description(values.get("description"))
                .treatmentID("T3456")
                .build();
        repository.update(newTreatment);
        Treatment UpdateTreatment = repository.read("1");
        assertEquals("T3456",UpdateTreatment.getTreatmentID());
    }

    @Test
    public void delete() {
        repository.delete("1");
        Treatment treatment = repository.read("1");
        assertNull(treatment);
    }

    @Test
    public void getAll() {
        Set<Treatment> treatment = this.repository.getAll();
        Assert.assertEquals(1,treatment.size());
    }
}