package factory.Treatment;

import domain.Treatment.Treatment;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TreatmentFactoryTest {
    private Map<String, String> values;

    @Test
    public void getTreatment() {
        values = new HashMap<String, String>();
        values.put("name","Nail Treatment");
        values.put("description","Full nail Manicure ");

        String treatmentID = "645N";
        Treatment treat = TreatmentFactory.getTreatment(values,treatmentID);
        System.out.println(treat);
        Assert.assertNotNull(treat.getTreatmentID());
    }
}