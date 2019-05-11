package com.thandiswa.factory.Treatment.Facial;

import com.thandiswa.domain.Treatment.Facial.AntAgingFacial;
import org.junit.Assert;
import org.junit.Test;

public class AntiAgingFacialFactoryTest {

    @Test
    public void getAntAgingFacial() {
        String poreIngredients = "chemical peel and collagen mask";
        AntAgingFacial aging = AntiAgingFacialFactory.getAntAgingFacial(poreIngredients);
        System.out.println(aging);
        Assert.assertNotNull(aging.getPoreIngredients());
    }
}