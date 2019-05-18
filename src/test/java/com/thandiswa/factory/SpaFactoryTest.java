package com.thandiswa.factory;

import com.thandiswa.domain.Spa;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class SpaFactoryTest {
    @Test
    public void getSpa() {
        String address = "Gugulethu";
        String spaName = "Beauty Spa";
        Spa s = SpaFactory.getSpa(address, spaName);
        System.out.println(s);
        Assert.assertNotNull(s.toString());

    }
}