package com.thandiswa.factory.Treatment;

import com.thandiswa.domain.Treatment.Treatment;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TreatmentFactoryTest {

    @Test
    public void getTreatment() {

        String description = "Full nail Manicure";
        String name = "Nail Treatment";
        Treatment treat = TreatmentFactory.getTreatment(description,name);
        System.out.println(treat);
        Assert.assertNotNull(treat.toString());
    }
}