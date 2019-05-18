package com.thandiswa.factory.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.NailTreatment;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class NailTreatmentFactoryTest {

    @Test
    public void getNailTreatment() {
        String nailShape = "Almond Shaped Nails";
        String nailType = "Manicure";
        NailTreatment nail = NailTreatmentFactory.getNailTreatment(nailType, nailShape);
        System.out.println(nail);
        Assert.assertNotNull(nail.getNailType());
    }
}