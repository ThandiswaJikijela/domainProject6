package factory.Treatment;

import domain.Treatment.Treatment;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreatmentFactoryTest {

    @Test
    public void getTreatment() {
        String name = "Nail Treatment";
        String treatmentID = "645N";
        Treatment treat = TreatmentFactory.getTreatment(name,treatmentID);
        System.out.println(treat);
        Assert.assertNotNull(treat.getName(),treat.getTreatmentID());
    }
}