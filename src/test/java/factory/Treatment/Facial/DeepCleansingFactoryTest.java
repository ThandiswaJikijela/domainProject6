package factory.Treatment.Facial;

import domain.Treatment.Facial.DeepCleansing;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeepCleansingFactoryTest {

    @Test
    public void getDeepCleansing() {
        String oilTypes = "Lavender ";
        DeepCleansing oil = DeepCleansingFactory.getDeepCleansing(oilTypes);
        System.out.println(oil);
        Assert.assertNotNull(oil.getOilTypes());
    }
}