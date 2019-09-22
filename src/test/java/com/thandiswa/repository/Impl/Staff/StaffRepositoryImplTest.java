package com.thandiswa.repository.Impl.Staff;

import com.thandiswa.domain.Staff.Staff;
import com.thandiswa.factory.Staff.StaffFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import com.thandiswa.repository.Staff.StaffRepository;
import org.junit.runners.MethodSorters;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StaffRepositoryImplTest {
    private StaffRepository repository;
    private Staff staff;

    @Before
    public void setUp() throws Exception {
        repository = StaffRepositoryImpl.getStaffRepository();
        this.staff = StaffFactory.getStaff("rose39@yahoo.com","Bellville");
    }

    @Test
    public void create() {
        Staff created = this.repository.create(this.staff);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created,this.staff);
    }

    @Test
    public void read() {
        System.out.println("In read, address = "+ staff.getAddress());
        Staff read = this.repository.read(staff.getAddress());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(staff,read);
    }


    @Test
    public void update() {
        String newAddress = "Bisho";
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
    public void getAll() {
        Set<Staff> staff1 = this.repository.getAll();
        //System.out.println("In getAll, all = " + staff1);
    }
}