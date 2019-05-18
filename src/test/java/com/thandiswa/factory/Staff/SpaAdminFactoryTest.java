package com.thandiswa.factory.Staff;

import com.thandiswa.domain.Staff.SpaAdmin;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class SpaAdminFactoryTest {

    @Test
    public void getSpaAdmin() {
        String password = "th63543@";
        SpaAdmin admin = SpaAdminFactory.getSpaAdmin(password);
        System.out.print(admin);
        Assert.assertNotNull(admin.getPassword());
    }
}