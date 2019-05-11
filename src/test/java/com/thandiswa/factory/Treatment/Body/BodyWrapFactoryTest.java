package com.thandiswa.factory.Treatment.Body;

import com.thandiswa.domain.Treatment.Body.BodyWraps;
import org.junit.Assert;
import org.junit.Test;

public class BodyWrapFactoryTest {

    @Test
    public void getBodyWraps() {
        String wrapMaterials = "Sheets and Blankets";
        BodyWraps wrap = BodyWrapFactory.getBodyWraps(wrapMaterials);
        System.out.println(wrap);
        Assert.assertNotNull(wrap.getWrapMaterials());
    }
}