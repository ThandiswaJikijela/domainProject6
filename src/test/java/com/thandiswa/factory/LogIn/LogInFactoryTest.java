package com.thandiswa.factory.LogIn;

import com.thandiswa.domain.LogIn.LogIn;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class LogInFactoryTest {
    @Test
    public void getLogIn() {
        String password ="76thfa";
        String username = "Sindie";
        LogIn log = LogInFactory.getLogIn(password,username);
        System.out.print(log);
        Assert.assertNotNull(log.toString());
    }
}