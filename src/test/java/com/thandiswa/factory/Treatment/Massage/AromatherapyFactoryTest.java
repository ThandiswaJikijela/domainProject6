package com.thandiswa.factory.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.Aromatherapy;
import org.junit.Assert;
import org.junit.Test;

public class AromatherapyFactoryTest {

    @Test
    public void getAromatherapy() {
        String fragrantEssentialOil = "Rose or peppermint";
        Aromatherapy aroma = AromatherapyFactory.getAromatherapy(fragrantEssentialOil);
        System.out.println(aroma);
        Assert.assertNotNull(aroma.getFragrantEssentialOil());
    }
}