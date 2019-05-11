package com.thandiswa.factory.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.DeepCleansing;
import org.junit.Assert;
import org.junit.Test;

public class DeepCleansingFactoryTest {

    @Test
    public void getDeepCleansing() {
        String oilTypes = "Lavender ";
        DeepCleansing oil = DeepCleansingFactory.getDeepCleansing(oilTypes);
        System.out.println(oil);
        Assert.assertNotNull(oil.getOilTypes());
    }
}