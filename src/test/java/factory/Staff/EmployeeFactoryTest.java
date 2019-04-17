package factory.Staff;

import domain.Staff.Employee;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    @Test
    public void getEmployee() {
        String username = "William Bank";
        String password = "th63543@";
        Employee emp = EmployeeFactory.getEmployee(username,password);
        System.out.print(emp);
        Assert.assertNotNull(emp.getUsername(), emp.getPassword());
    }
}