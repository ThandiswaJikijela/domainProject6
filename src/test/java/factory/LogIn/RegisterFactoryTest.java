package factory.LogIn;

import domain.LogIn.Register;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegisterFactoryTest {

    @Test
    public void getRegister() {
        String name = "Thoshi";
        String address = "Woodstock";
        String email = "toshi@gmail.com";
        String username = "toshi";
        String password = "adimin@1244";
        Register reg = RegisterFactory.getRegister(name, address, email, username, password);
        System.out.print(reg);
        Assert.assertNotNull(reg.toString());

    }
}