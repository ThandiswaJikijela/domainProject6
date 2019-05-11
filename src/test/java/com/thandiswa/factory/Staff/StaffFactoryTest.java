package com.thandiswa.factory.Staff;

import com.thandiswa.domain.Staff.Staff;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class StaffFactoryTest {
    private Map<String, String> values;
    @Test
    public void getStaff() {
        values = new HashMap<String, String>();
        values.put("name","Rose");
        values.put("phone","0749374876");
        values.put("address","Port Elizabeth");
        String email = "rose39@yahoo.com";
        Staff staff = StaffFactory.getStaff(values,email);
        System.out.print(staff);
        Assert.assertNotNull(staff.getEmail());
    }
}