package com.thandiswa.factory.Staff;

import com.thandiswa.domain.Staff.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactoryTest {
    private Map<String, String> values;
    @Test
    public void getEmployee() {
        values = new HashMap<String, String>();
        values.put("password","th63543@");
        values.put("employeeID","76476612");
        String username = "William Bank";
        Employee emp = EmployeeFactory.getEmployee(values,username);
        System.out.print(emp);
        Assert.assertNotNull(emp.getUsername());
    }
}