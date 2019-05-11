package com.thandiswa.factory.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.NailTreatment;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class NailTreatmentFactoryTest {
    private Map<String, String> values;

    @Test
    public void getNailTreatment() {
        values = new HashMap<String, String>();
        values.put("nailShape","Steeletoes");
        values.put("nailSize","4");
        String nailType = "Manicure";
        NailTreatment nail = NailTreatmentFactory.getNailTreatment(values,nailType);
        System.out.println(nail);
        Assert.assertNotNull(nail.getNailType());
    }
}