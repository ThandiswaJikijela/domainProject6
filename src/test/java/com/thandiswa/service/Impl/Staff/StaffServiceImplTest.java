package com.thandiswa.service.Impl.Staff;

import com.thandiswa.domain.Staff.Staff;
import com.thandiswa.factory.Staff.StaffFactory;
import com.thandiswa.repository.Impl.Staff.StaffRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StaffServiceImplTest {
    private StaffRepositoryImpl repository;
    private Staff staff;

    @Before
    public void setUp() throws Exception {
        repository = StaffRepositoryImpl.getRepository();
        this.staff = StaffFactory.getStaff("silver@yahoo.com","Nyanga");
    }

    @Test
    public void create() {
        Staff created = this.repository.create(this.staff);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created,this.staff);
    }

    @Test
    public void update() {
        String newAddress = "Lost Angels";
        Staff updated = new Staff.Builder().address(newAddress).build();
        System.out.println("In update, about_to_updated = " + staff.getAddress());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newAddress, updated.getAddress());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(staff.getEmail());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, address = "+ staff.getAddress());
        Staff read = this.repository.read(staff.getAddress());
        System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(staff,read);
    }

    @Test
    public void getAll() {
        Set<Staff> staff1 = this.repository.getAll();
        //System.out.println("In getAll, all = " + staff1);
    }
}