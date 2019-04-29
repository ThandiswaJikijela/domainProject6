package factory.LogIn;

import domain.LogIn.LogIn;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class LogInFactoryTest {
    private Map<String, String> values;
    @Test
    public void getLogIn() {
        values = new HashMap<String,String>();
        String username = "Thandie";
        LogIn log = LogInFactory.getLogIn(values, username);
        System.out.print(log);
        Assert.assertNotNull(log.getUsername());
    }
}