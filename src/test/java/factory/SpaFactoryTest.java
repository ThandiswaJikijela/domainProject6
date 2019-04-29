package factory;

import domain.Spa;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SpaFactoryTest {
    private Map<String, String> values;
    @Test
    public void getSpa() {
        values = new HashMap<String,String>();
        String spaName = "Beauty Spa";
        Spa s = SpaFactory.getSpa(values,spaName);
        System.out.println(s);
        Assert.assertNotNull(s.getSpaName());

    }
}