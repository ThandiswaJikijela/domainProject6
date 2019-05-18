package com.thandiswa.factory.Staff;

import com.thandiswa.domain.Staff.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactoryTest {
    @Test
    public void getEmployee() {

        String password = "th63543@";
        String username = "William Bank";
        Employee emp = EmployeeFactory.getEmployee(username, password);
        System.out.print(emp);
        Assert.assertNotNull(emp.toString());
    }
}