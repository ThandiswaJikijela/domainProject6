package factory.Treatment.Massage;

import domain.Treatment.Massage.Aromatherapy;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AromatherapyFactoryTest {

    @Test
    public void getAromatherapy() {
        String fragrantEssentialOil = "Rose or peppermint";
        Aromatherapy aroma = AromatherapyFactory.getAromatherapy(fragrantEssentialOil);
        System.out.println(aroma);
        Assert.assertNotNull(aroma.getFragrantEssentialOil());
    }
}