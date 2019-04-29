package repository.Impl.Staff;

import domain.Staff.Staff;
import factory.Staff.StaffFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import repository.Staff.StaffRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class StaffRepositoryImplTest {
    private StaffRepository repository;
    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {
        repository = StaffRepositoryImpl.getRepository();
        values = new HashMap<String, String>();
        values.put("name","Rose");
        values.put("phone","0749374876");
        values.put("address","Port Elizabeth");
    }

    @Test
    public void create() {
        Staff staff = StaffFactory.getStaff(values,"rose39@yahoo.com");
        repository.create(staff);
        System.out.print(staff);
        assertEquals("rose39@yahoo.com",staff.getEmail());
    }

    @Test
    public void read() {
        Staff readStaff = repository.read("");
        assertEquals("rose39@yahoo.com",readStaff.getEmail());
    }


    @Test
    public void update() {
        Staff staff = repository.read("1");
        Staff newStaff = new Staff.Builder()
                .name(values.get("name"))
                .phone(values.get("phone"))
                .address(values.get("address"))
                .email("sadi@gmail.com")
                .build();
        repository.update(newStaff);
        Staff UpdateStaff = repository.read("1");
        assertEquals("sadi@gmail.com",UpdateStaff.getEmail());
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