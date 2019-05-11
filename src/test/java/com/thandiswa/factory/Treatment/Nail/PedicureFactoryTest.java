package com.thandiswa.factory.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Pedicure;
import org.junit.Assert;
import org.junit.Test;

public class PedicureFactoryTest {

    @Test
    public void getPedicure() {
        String mediHeelPedicure = "Medi-Pedies";
        Pedicure nail = PedicureFactory.getPedicure(mediHeelPedicure);
        System.out.println(nail);
        Assert.assertNotNull(nail.getMediHeelPedicure());
    }
}