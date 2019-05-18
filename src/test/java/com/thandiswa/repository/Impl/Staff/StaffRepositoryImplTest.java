package com.thandiswa.repository.Impl.Staff;

import com.thandiswa.domain.Staff.Staff;
import com.thandiswa.factory.Staff.StaffFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.thandiswa.repository.Staff.StaffRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class StaffRepositoryImplTest {
    private StaffRepository repository;

    @Before
    public void setUp() throws Exception {
        repository = StaffRepositoryImpl.getRepository();
    }

    @Test
    public void create() {
        Staff staff = StaffFactory.getStaff("rose39@yahoo.com","Bellville");
        repository.create(staff);
        System.out.print(staff);
        assertNotNull(staff.getEmail(),staff.getAddress());
    }

    @Test
    public void read() {
        Staff readStaff = repository.read("");
        assertEquals("rose39@yahoo.com",readStaff.getEmail());
    }


    @Test
    public void update() {
       /* Staff staff = repository.read("1");
        Staff newStaff = new Staff.Builder()
                .name(values.get("name"))
                .phone(values.get("phone"))
                .address(values.get("address"))
                .email("sadi@gmail.com")
                .build();
        repository.update(newStaff);
        Staff UpdateStaff = repository.read("1");
        assertEquals("sadi@gmail.com",UpdateStaff.getEmail());

        */
    }

    @Test
    public void delete() {
        repository.delete("1");
        Staff staff = repository.read("1");
        assertNull(staff);
    }

    @Test
    public void getAll() {
        Set<Staff> staff = this.repository.getAll();
        Assert.assertEquals(1,staff.size());
    }
}