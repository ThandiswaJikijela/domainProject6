package factory.Treatment.Massage;

import domain.Treatment.Massage.MassageTreatment;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MassageTreatmentFactoryTest {
    private Map<String, String> values;
    @Test
    public void getMassageTreatment() {
        values = new HashMap<String, String>();
        String massageType = "Aromatherapy";
        MassageTreatment tissue = MassageTreatmentFactory.getMassageTreatment(values,massageType);
        System.out.println(tissue);
        Assert.assertNotNull(tissue.getMassageType());
    }
}