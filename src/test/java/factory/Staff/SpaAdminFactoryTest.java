package factory.Staff;

import domain.Staff.SpaAdmin;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpaAdminFactoryTest {

    @Test
    public void getSpaAdmin() {
        String adminID = "billy bones";
        String password = "th63543@";
        SpaAdmin admin = SpaAdminFactory.getSpaAdmin(adminID,password);
        System.out.print(admin);
        Assert.assertNotNull(admin.getAdminID(), admin.getPassword());
    }
}