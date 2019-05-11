package com.thandiswa.factory.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.SwedishMassage;
import org.junit.Assert;
import org.junit.Test;

public class SwedishMassageFactoryTest {

    @Test
    public void getSwedishMassage() {
        String carrierOil = "Sweet almond and Jojoba";
        SwedishMassage swidish = SwedishMassageFactory.getSwedishMassage(carrierOil);
        System.out.println(swidish);
        Assert.assertNotNull(swidish.getCarrierOil());
    }
}