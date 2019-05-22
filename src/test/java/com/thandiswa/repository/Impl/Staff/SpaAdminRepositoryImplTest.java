package com.thandiswa.repository.Impl.Staff;

import com.thandiswa.domain.Staff.SpaAdmin;
import com.thandiswa.factory.Staff.SpaAdminFactory;
import com.thandiswa.repository.Staff.SpaAdminRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SpaAdminRepositoryImplTest {
    private SpaAdminRepository repository;
    private SpaAdmin spaAdmin;

    @Before
    public void setUp() throws Exception {
        repository = SpaAdminRepositoryImpl.getRepository();
        this.spaAdmin = SpaAdminFactory.getSpaAdmin("Barr45#");
    }

    @Test
    public void create() {
        SpaAdmin created = this.repository.create(this.spaAdmin);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created,this.spaAdmin);
    }

    @Test
    public void update() {
        String newPassword = "garry0947";
        SpaAdmin updated = new SpaAdmin.Builder().password(newPassword).build();
        System.out.println("In update, about_to_updated = " + spaAdmin.getPassword());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newPassword, updated.getPassword());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(spaAdmin.getAdminID());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, username = "+ spaAdmin.getPassword());
        SpaAdmin read = this.repository.read(spaAdmin.getPassword());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(spaAdmin,read);
    }

    @Test
    public void getAll() {
        Set<SpaAdmin> spaAdmins = this.repository.getAll();
        //System.out.println("In getAll, all = " + spaAdmins);
    }
}