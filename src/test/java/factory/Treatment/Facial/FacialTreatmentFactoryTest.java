package factory.Treatment.Facial;

import domain.Treatment.Facial.FacialTreatment;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FacialTreatmentFactoryTest {

    @Test
    public void getFacialTreatment() {
        String treatmentType = "DeepCleansing and Anti Aging Facial ";
        FacialTreatment facial = FacialTreatmentFactory.getFacialTreatment(treatmentType);
        System.out.println(facial);
        Assert.assertNotNull(facial.getTreatmentType());
    }
}