package com.thandiswa.factory.Staff;

import com.thandiswa.domain.Staff.Staff;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class StaffFactoryTest {

    @Test
    public void getStaff() {

        String address = "Port Elizabeth";
        String email = "rose39@yahoo.com";
        Staff staff = StaffFactory.getStaff(email,address);
        System.out.print(staff);
        Assert.assertNotNull(staff.getEmail(), staff.getAddress());
    }
}