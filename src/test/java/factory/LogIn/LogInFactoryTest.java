package factory.LogIn;

import domain.LogIn.LogIn;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogInFactoryTest {

    @Test
    public void getLogIn() {
        String username = "Thandie";
        LogIn log = LogInFactory.getLogIn(username);
        System.out.print(log);
        Assert.assertNotNull(log.getUsername());
    }
}