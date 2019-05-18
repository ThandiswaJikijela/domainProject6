package com.thandiswa.factory.Treatment.Massage;

import com.thandiswa.domain.Treatment.Massage.MassageTreatment;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MassageTreatmentFactoryTest {
    @Test
    public void getMassageTreatment() {
        String massageType = "Aromatherapy";
        MassageTreatment tissue = MassageTreatmentFactory.getMassageTreatment(massageType);
        System.out.println(tissue);
        Assert.assertNotNull(tissue.toString());
    }
}