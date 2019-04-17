package factory.Treatment.Body;

import domain.Treatment.Body.BodyMask;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BodyMaskFactoryTest {

    @Test
    public void getBodyMask() {
        String maskIngredients = "Mud and Clay";
        BodyMask mask = BodyMaskFactory.getBodyMask(maskIngredients);
        System.out.println(mask);
        Assert.assertNotNull(mask.getMaskIngredients());
    }
}