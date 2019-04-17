package factory.Treatment.Nail;

import domain.Treatment.Nail.Manicure;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManicureFactoryTest {

    @Test
    public void getManicure() {
        String nailStyle = "Stiletos";
        Manicure nail = ManicureFactory.getManicure(nailStyle);
        System.out.println(nail);
        Assert.assertNotNull(nail.getNailStyle());
    }
}