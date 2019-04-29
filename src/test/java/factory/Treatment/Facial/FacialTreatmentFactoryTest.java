package factory.Treatment.Facial;

import domain.Treatment.Facial.FacialTreatment;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FacialTreatmentFactoryTest {
    private Map<String, String> values;

    @Test
    public void getFacialTreatment() {
        values = new HashMap<String, String>();
        values.put("skinCareProducts","nourishments");
        String treatmentType = "DeepCleansing and Anti Aging Facial ";
        FacialTreatment facial = FacialTreatmentFactory.getFacialTreatment(values, treatmentType);
        System.out.println(facial);
        Assert.assertNotNull(facial.getTreatmentType());
    }
}