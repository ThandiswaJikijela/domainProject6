package com.thandiswa.factory.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.TissueMassage;
import org.junit.Assert;
import org.junit.Test;

public class TissueMassageFactoryTest {

    @Test
    public void getTissueMassage() {
        String massagePressure = "deep pressure to release knots and chronic muscles";
        TissueMassage tissue = TissueMassageFactory.getTissueMassage(massagePressure);
        System.out.println(tissue);
        Assert.assertNotNull(tissue.getMassagePressure());
    }
}