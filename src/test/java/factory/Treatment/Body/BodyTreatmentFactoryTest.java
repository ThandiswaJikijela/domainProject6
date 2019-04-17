package factory.Treatment.Body;

import domain.Treatment.Body.BodyTreatment;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BodyTreatmentFactoryTest {

    @Test
    public void getBodyTreatment() {
        String description = "body treatment is that it is just as important to cleanse, exfoliate, and hydrate the skin on your body";
        BodyTreatment body = BodyTreatmentFactory.getBodyTreatment(description);
        System.out.println(body);
        Assert.assertNotNull(body.getDescription());
    }
}