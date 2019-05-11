package com.thandiswa.factory.Treatment.Nail;

import com.thandiswa.domain.Treatment.Nail.Manicure;
import org.junit.Assert;
import org.junit.Test;

public class ManicureFactoryTest {

    @Test
    public void getManicure() {
        String nailStyle = "Stiletos";
        Manicure nail = ManicureFactory.getManicure(nailStyle);
        System.out.println(nail);
        Assert.assertNotNull(nail.getNailStyle());
    }
}