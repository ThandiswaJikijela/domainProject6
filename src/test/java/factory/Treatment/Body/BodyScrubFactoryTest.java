package factory.Treatment.Body;

import domain.Treatment.Body.BodyScrub;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BodyScrubFactoryTest {

    @Test
    public void getBodyScrub() {
        String grittyIngredients = "Coffee beans and Sand";
        BodyScrub scrub = BodyScrubFactory.getBodyScrub(grittyIngredients);
        System.out.println(scrub);
        Assert.assertNotNull(scrub.getGrittyIngredients());
    }
}