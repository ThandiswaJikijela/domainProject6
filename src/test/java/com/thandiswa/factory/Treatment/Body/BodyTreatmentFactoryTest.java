package com.thandiswa.factory.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyTreatment;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class BodyTreatmentFactoryTest {
    @Test
    public void getBodyTreatment() {
        String treatmentType = "Body Mask";
        BodyTreatment body = BodyTreatmentFactory.getBodyTreatment(treatmentType);
        System.out.println(body);
        Assert.assertNotNull(body.toString());
    }
}