package factory.Treatment.Nail;

import domain.Treatment.Nail.NailTreatment;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class NailTreatmentFactoryTest {
    private Map<String, String> values;

    @Test
    public void getNailTreatment() {
        values = new HashMap<String, String>();
        values.put("nailShape","Steeletoes");
        values.put("nailSize","4");
        String nailType = "Manicure";
        NailTreatment nail = NailTreatmentFactory.getNailTreatment(values,nailType);
        System.out.println(nail);
        Assert.assertNotNull(nail.getNailType());
    }
}