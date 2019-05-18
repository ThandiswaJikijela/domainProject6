package com.thandiswa.factory.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.FacialTreatment;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FacialTreatmentFactoryTest {

    @Test
    public void getFacialTreatment() {
        String skinCareProducts = "nourishments";
        String treatmentType = "DeepCleansing and Anti Aging Facial ";
        FacialTreatment facial = FacialTreatmentFactory.getFacialTreatment(treatmentType, skinCareProducts);
        System.out.println(facial);
        Assert.assertNotNull(facial.getTreatmentType(), facial.getSkinCareProducts());
    }
}