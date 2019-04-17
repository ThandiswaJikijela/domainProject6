package factory.Treatment.Nail;

import domain.Treatment.Nail.NailTreatment;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NailTreatmentFactoryTest {

    @Test
    public void getNailTreatment() {
        String nailType = "Manicure";
        NailTreatment nail = NailTreatmentFactory.getNailTreatment(nailType);
        System.out.println(nail);
        Assert.assertNotNull(nail.getNailType());
    }
}