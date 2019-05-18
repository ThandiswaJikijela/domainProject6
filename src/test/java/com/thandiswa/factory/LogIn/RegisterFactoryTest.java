package com.thandiswa.factory.LogIn;

import com.thandiswa.domain.LogIn.Register;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RegisterFactoryTest {

    @Test
    public void getRegister() {

        String name = "Thoshi";
        String email ="toshi@gmail.com";
        Register reg = RegisterFactory.getRegister(name,email);
        System.out.print(reg);
        Assert.assertNotNull(reg.getName(),reg.getEmail());

    }
}