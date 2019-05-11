package com.thandiswa.factory.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyMask;
import org.junit.Assert;
import org.junit.Test;

public class BodyMaskFactoryTest {

    @Test
    public void getBodyMask() {
        String maskIngredients = "Mud and Clay";
        BodyMask mask = BodyMaskFactory.getBodyMask(maskIngredients);
        System.out.println(mask);
        Assert.assertNotNull(mask.getMaskIngredients());
    }
}