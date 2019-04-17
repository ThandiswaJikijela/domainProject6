package factory.Treatment.Nail;

import domain.Treatment.Nail.Pedicure;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PedicureFactoryTest {

    @Test
    public void getPedicure() {
        String mediHeelPedicure = "Medi-Pedies";
        Pedicure nail = PedicureFactory.getPedicure(mediHeelPedicure);
        System.out.println(nail);
        Assert.assertNotNull(nail.getMediHeelPedicure());
    }
}