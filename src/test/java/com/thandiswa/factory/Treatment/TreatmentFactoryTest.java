package com.thandiswa.factory.Treatment;

import com.thandiswa.domain.Treatment.Treatment;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TreatmentFactoryTest {
    private Map<String, String> values;

    @Test
    public void getTreatment() {
        values = new HashMap<String, String>();
        values.put("name","Nail Treatment");
        values.put("description","Full nail Manicure ");

        String treatmentID = "645N";
        Treatment treat = TreatmentFactory.getTreatment(values,treatmentID);
        System.out.println(treat);
        Assert.assertNotNull(treat.getTreatmentID());
    }
}