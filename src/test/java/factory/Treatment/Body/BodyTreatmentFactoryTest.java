package factory.Treatment.Body;

import domain.Treatment.Body.BodyTreatment;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BodyTreatmentFactoryTest {

    @Test
    public void getBodyTreatment() {
        String treatmentType = "Body Mask";
        BodyTreatment body = BodyTreatmentFactory.getBodyTreatment(treatmentType);
        System.out.println(body);
        Assert.assertNotNull(body.toString());
    }
}