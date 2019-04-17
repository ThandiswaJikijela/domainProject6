package factory.Treatment.Body;

import domain.Treatment.Body.BodyWraps;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BodyWrapFactoryTest {

    @Test
    public void getBodyWraps() {
        String wrapMaterials = "Sheets and Blankets";
        BodyWraps wrap = BodyWrapFactory.getBodyWraps(wrapMaterials);
        System.out.println(wrap);
        Assert.assertNotNull(wrap.getWrapMaterials());
    }
}