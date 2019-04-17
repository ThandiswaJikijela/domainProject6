package factory;

import domain.Spa;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpaFactoryTest {

    @Test
    public void getSpa() {
        String spaName = "Beauty Spa";
        Spa s = SpaFactory.getSpa(spaName,"payne");
        System.out.println(s);
        Assert.assertNotNull(s.getSpaName());

    }
}