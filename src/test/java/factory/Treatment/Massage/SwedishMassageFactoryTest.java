package factory.Treatment.Massage;

import domain.Treatment.Massage.SwedishMassage;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwedishMassageFactoryTest {

    @Test
    public void getSwedishMassage() {
        String carrierOil = "Sweet almond and Jojoba";
        SwedishMassage swidish = SwedishMassageFactory.getSwedishMassage(carrierOil);
        System.out.println(swidish);
        Assert.assertNotNull(swidish.getCarrierOil());
    }
}