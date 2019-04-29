package factory.LogIn;

import domain.LogIn.Register;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class RegisterFactoryTest {
    private Map<String, String> values;
    @Test
    public void getRegister() {
        values = new HashMap<String,String>();
        values.put("address","Woodstock");
        values.put("email ","toshi@gmail.com");
        values.put("username","toshi");
        values.put("password","adimin@1244");
        String name = "Thoshi";
        Register reg = RegisterFactory.getRegister(values, name);
        System.out.print(reg);
        Assert.assertNotNull(reg.toString());

    }
}