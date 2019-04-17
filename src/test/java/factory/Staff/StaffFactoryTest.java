package factory.Staff;

import domain.Staff.Staff;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StaffFactoryTest {

    @Test
    public void getStaff() {
        String name = "Rose";
        String email = "rose39@yahoo.com";
        Staff staff = StaffFactory.getStaff(name,email);
        System.out.print(staff);
        Assert.assertNotNull(staff.getName(), staff.getEmail());
    }
}