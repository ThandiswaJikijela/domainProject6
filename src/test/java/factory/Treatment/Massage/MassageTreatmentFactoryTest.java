package factory.Treatment.Massage;

import domain.Treatment.Massage.MassageTreatment;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MassageTreatmentFactoryTest {

    @Test
    public void getMassageTreatment() {
        String massageType = "Aromatherapy";
        MassageTreatment tissue = MassageTreatmentFactory.getMassageTreatment(massageType);
        System.out.println(tissue);
        Assert.assertNotNull(tissue.getMassageType());
    }
}